--유저 생성
create user ‘javaUser’@’localhost’ indentified by ‘mysql’;

--DB생성
create database javadb;

-- 유저 권한 부여
grant all privileges on javadb.* to ‘javaUser’@’localhost’ with grant option;
flush privileges;

--상품 등록 DB 생성 
create table product(
pno int not null auto_increment,
pname varchar(50) not null,
price int not null default 0,
regdate datetime default now(),
madeby text,
primaryt key(pno));