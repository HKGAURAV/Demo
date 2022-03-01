create table person
(
id integer not null,
name varchar(255) not null,
location varchar(255),
birth_date timestamp ,
primary key (id)
);
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(1,'Gaurav','Pune',sysdate());
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(2,'Puja','Pune',sysdate());
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(3,'Ashu','Pune',sysdate());
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(4,'Panda','Pune',sysdate());
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(5,'Amit','Pune',sysdate());



