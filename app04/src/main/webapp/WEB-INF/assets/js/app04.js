/*********************************************
 * 파일명 : app04.js
 * 설  명 : 책(Contact) 관리 JavaScript
 * 
 * 수정일      수정자  Version  Function
 * --------------------------------------------
 * 2024-07-01  민경태  1.0      Init()
 *                              contextPath()
 *                              GetContacts()
 *********************************************/


const contacts = $('#contacts');
const contactNo = $('#contactNo');
const title = $('#title');
const author = $('#author');
const initBtn = $('#init-btn');
const registerBtn = $('#register-btn');
const modifyBtn = $('#modify-btn');
const removeBtn = $('#remove-btn');


const Init = ()=>{
  initBtn.on('click', evt=>{
    contactNo.val('').prop('readonly', false);
    title.val('');
    author.val('');
    registerBtn.prop('disabled', false);
    modifyBtn.prop('disabled', true);
    removeBtn.prop('disabled', true);
  })
}

const contextPath = ()=>{
  const url = location.href;   /* http://localhost:9090/app04/api/users */
  const host = location.host;  /* localhost:9090 */
  const beginIndex = url.indexOf(host) + host.length;
  const endIndex = url.indexOf('/', beginIndex + 1);
  return url.substring(beginIndex, endIndex);  // include beginIndex, exclude endIndex
}

const GetContacts = (url, dataType)=>{
  $.ajax({
    type: 'get',
    url: contextPath() + url,
    dataType: dataType
  }).done(resData=>{
    
    contacts.empty();
    
    if(dataType === 'xml') {      
      $.each(resData.getElementsByTagName('contact'), (i, contact)=>{
        let str = '<tr>';
        str += '<td>' + contact.getElementsByTagName('contactNo')[0].textContent + '</td>';
        str += '<td>' + contact.getElementsByTagName('title')[0].textContent + '</td>';
        str += '<td>' + contact.getElementsByTagName('author')[0].textContent + '</td>';
        str += '<td><button type="button" class="detail-btn" data-contact-no="' + contact.getElementsByTagName('contactNo')[0].textContent + '">상세</button></td>';
        str += '</tr>';
        contacts.append(str);
      });
    } else if(dataType === 'json') {      
      $.each(resData.contacts, (i, contact)=>{
        let str = '<tr>';
        str += '<td>' + contact.contactNo + '</td>';
        str += '<td>' + contact.title + '</td>';
        str += '<td>' + contact.author + '</td>';
        str += '<td><button type="button" class="detail-btn" data-contact-no="' + contact.contactNo + '">상세</button></td>';
        str += '</tr>';
        contacts.append(str);
      })
    }
    
  }).fail(jqXHR=>{
    alert(jqXHR.responseText);
  })
}

const GetContactByNo = ()=>{
  $(document).on('click', '.detail-btn', evt=>{
    $.ajax({
      type: 'get',
      url: contextPath() + '/api/contacts/' + evt.target.dataset.contactNo,
      dataType: 'json'
    }).done(resData=>{
      contactNo.val(resData.contact.contactNo).prop('readonly', true);
      title.val(resData.contact.title);
      author.val(resData.contact.author);
      registerBtn.prop('disabled', true);
      modifyBtn.prop('disabled', false);
      removeBtn.prop('disabled', false);
    }).fail(jqXHR=>{
      alert(jqXHR.responseText);
    })
  })
}

const RegisterContact = ()=>{
  registerBtn.on('click', evt=>{
    $.ajax({
      type: 'post',
      url: contextPath() + '/api/contacts',
      contentType: 'application/json',
      data: JSON.stringify({
        contactNo: contactNo.val(),
        title: title.val(),
        author: author.val()
      }),
      dataType: 'json'
    }).done(resData=>{
      if(resData.isSuccess){
        alert(resData.inserted + '에 등록되었습니다.');
        GetContacts('/api/contacts', 'json');
        initBtn.trigger('click');
      } else {
        alert('책 등록이 실패했습니다.');
      }
    }).fail(jqXHR => {
      alert(jqXHR.responseText);
    })
  })
}

const ModifyContact = ()=>{
  modifyBtn.on('click', evt=>{
    $.ajax({
      type: 'put',
      url: contextPath() + '/api/contacts',
      contentType: 'application/json',
      data: JSON.stringify({
        contactNo: contactNo.val(),
        title: title.val(),
        author: author.val()
      }),
      dataType: 'json'
    }).done(resData=>{
      if(resData.isSuccess){
        alert(resData.updated + '에 수정되었습니다.');
        GetContacts('/api/contacts', 'json');
      } else {
        alert('책 정보가 수정되지 않았습니다.');
      }
    }).fail(jqXHR=>{
      alert(jqXHR.responseText);
    })
  })
}

const RemoveContact = ()=>{
  removeBtn.on('click', evt=>{
    if(!confirm('삭제할까요?')){
      alert('취소되었습니다.');
      return;
    }
    $.ajax({
      type: 'delete',
      url: contextPath() + '/api/contacts/' + contactNo.val(),
      dataType: 'json'
    }).done(resData=>{
      if(resData.isSuccess){
        alert(resData.deleted + '에 삭제되었습니다.');
        GetContacts('/api/contacts.json', 'json');
        initBtn.trigger('click');
      } else {
        alert('책이 삭제되지 않았습니다.');
      }
    }).fail(jqXHR=>{
      alert(jqXHR.responseText);
    })
  })
}


Init();
initBtn.trigger('click');
// GetContacts('/api/contacts', 'json');
// GetContacts('/api/contacts.json', 'json');
GetContacts('/api/contacts.xml', 'xml');
GetContactByNo();
RegisterContact();
ModifyContact();
RemoveContact();