
create database dynamic_web_app;
use dynamic_web_app;

create table users(
id int primary key auto_increment,
uname varchar(50),
upwd varchar(50),
uemail varchar(50),
umobile varchar(10)
);

select * from users;