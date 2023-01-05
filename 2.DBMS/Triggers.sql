create database sql_triggers;
use sql_triggers;

create table employee (
  id int not null primary key, 
  name varchar(30) not null, 
  occupation varchar(50), 
  working_date date, 
  working_hours int
);

insert into employee values (1, "Suresh", "Engineer", "2022-11-13", 9);
insert into employee values (2, "Karan", "Carpenter", "2020-05-01", 12);
insert into employee values (3, "Utsav", "Doctor", "2020-04-13", 10);
insert into employee values (4, "Raj", "Plumber", "2019-09-13", 12);
insert into employee values (5, "Shubham", "Engineer", "2021-12-13", 9);
insert into employee values (6, "Arjun", "Fortune Teller", "2021-11-13", 9);

select 
  * 
from 
  employee;
  
DELIMITER // 
create trigger t1 
before insert on employee 
for each row begin 
if new.working_hours < 0 
then 
set 
  new.working_hours = 0;
end if;
end // 
insert into employee 
values 
  ( 7, "Viren", "Artist", "2021-11-13", -9);
  
select 
  * 
from 
  employee;
  
DELIMITER // 
CREATE TRIGGER t2 
BEFORE 
UPDATE 
  ON employee FOR EACH ROW BEGIN if new.working_hours < 10 then 
set 
  new.working_hours = 10;
end if;
end // 
update 
  employee 
set 
  working_hours = 5 
where 
  id = 1;
  
select 
  * 
from 
  employee;
  
DELIMITER // 
CREATE TRIGGER t3 
AFTER UPDATE ON employee 
FOR EACH ROW BEGIN 
if old.occupation <> new.occupation 
then insert into employee 
values 
  (8, "Asad", "Fortune Teller", "2021-10-13", 11);
end if;
end // 

select 
  * 
from 
  employee;
  
show triggers;
drop 
  trigger t1;
