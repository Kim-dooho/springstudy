DROP TABLE contact_t;
CREATE TABLE contact_t (
  contact_no NUMBER NOT NULL PRIMARY KEY,
  NAME       VARCHAR2(100byte),
  email      VARCHAR2(100byte),
  mobile     VARCHAR2(100byte),
  created_at  DATE
);
    
DROP SEQUENCE contact_seq;
CREATE SEQUENCE contact_seq;
    