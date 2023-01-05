create database sql_Views;
use sql_Views;

create table Employee(
  FName varchar (10), 
  MName varchar (10), 
  LName varchar (10), 
  SSN integer, 
  Bdate date, 
  Address varchar (30), 
  Gender varchar (10), 
  Salary integer, 
  DNumber integer primary key
);

create table Department (
  D_Number integer, 
  DName varchar (10), 
  Building varchar (10), 
  Budget integer, 
  CONSTRAINT dep_num FOREIGN KEY (D_Number) REFERENCES Employee(DNumber)
);

Insert into Employee values
('Sara','Suresh','Shet', 4561,'2001-05-15','Matunga','F', 25000, 2),
('Nandini','Rajesh','Patil', 7892,'2001-01-06','Ghatkopar','F', 5000, 3),
('Mandar','Rajendra','Godambe', 1125,'2002-04-24','Virar','M', 2000,4),
('Sakshi','Vishwas','Mehta', 1239,'2001-10-23','Mulund','F', 50000, 1),
('Chris','Andrew','Paul', 2701,'2001-01-17','Kandivali','M', 20000, 5),
('Sangita','Suresh','Shigvan', 3567,'1996-10-27','Mahim','F', 35000, 6),
('Utsav','Ramakant','Panchal', 2112,'2000-03-16','Kurla','M', 50000, 7),
('Suraj','Sanjay','Kadam', 5661,'2001-07-26','Kanjur','M', 28000, 8);

insert into Department values
(1, 'EXTC', 'A', 1000000),
(3, 'IT', 'B', 2000000),
(5, 'COMPS', 'C', 3000000),
(2, 'ETRX', 'D', 4000000),
(4, 'ELECTRICAL', 'E', 5000000),
(6, 'ETRX', 'F', 6000000),
(7, 'EXTC', 'G', 7000000),
(8, 'IT', 'H', 8000000);

CREATE VIEW view_1 AS SELECT FName, LName, SSN, DNumber
FROM Employee;
SELECT * FROM view_1;

CREATE VIEW view_2 AS SELECT FName, LName, SSN, DNumber
FROM Employee WHERE Salary>10000;
SELECT * FROM view_2;

create view view_3 as Select Employee.SSN, Employee.FName,
Department.DName, Department.Building
from Employee
Inner Join Department
on Employee.DNumber = Department.D_Number;
select * from view_3;

CREATE VIEW view_4 AS SELECT FName, LName, SSN,Gender,
DNumber FROM Employee WHERE Gender='F' WITH CHECK OPTION;
INSERT INTO view_4 VALUES ('Akshay','Bane',4862,'M',2);
SELECT * FROM view_4;