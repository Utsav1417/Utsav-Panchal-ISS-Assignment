--Create Database
Create Database Startup;

--Use Database
Use Startup;

--Create a Table for Employee Details
CREATE TABLE Employees(
 Emp_ID int NOT NULL AUTO_INCREMENT,
 FirstName varchar(255) ,
 LastName varchar(255) ,
 Age int, 
 CHECK (Age>=18),
 PRIMARY KEY (Emp_ID)
);

--Insert Into where check statement is false
INSERT INTO Employees
(FirstName,LastName,Age) VALUES
("Riddhish","Singh",20),
("Utsav", "Panchal",17),
("Sangita", "Shinde",21),
("Mayur", "Patil",22),
("Arjun","Shetty",21);

--Insert Into where check statement is true
INSERT INTO Employees
(FirstName,LastName,Age) VALUES
("Riddhish","Singh",20),
("Utsav", "Panchal",22),
("Sangita", "Shinde",21),
("Mayur", "Patil",22),
("Arjun","Shetty",21);

--Show Inserted Data in table
Select * from Employees;

--Alter Statements
ALTER TABLE Employees RENAME Emp_Army;
ALTER TABLE Employees ADD salary int;

--Show table after alter statement
Select * from Emp_Army;

--Update Statements
UPDATE Emp_Army SET salary = Age*1000 WHERE Emp_ID between 6 and 10 ;

--Show table after Update statement
Select * from Emp_Army;

--Create new table and use Foreign Key
CREATE TABLE department(
 dep_no INTEGER PRIMARY KEY ,
 Employee_id INTEGER ,
 dep_name VARCHAR(45),
 CONSTRAINT emp_add FOREIGN KEY
 (Employee_id) REFERENCES Emp_Army(Emp_id)
);

--Insert values in new table
INSERT INTO department VALUES
(101,6,"Development"),
(102,7,"Operations"),
(103,8,"Admin"),
(104,9,"Sales"),
(105,10,"Marketing");

--Show new table
Select * from department;

--Truncate and Drop table
Truncate Table department;
Drop Table department;