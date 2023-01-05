--Create Database
CREATE DATABASE School;

--Use Database
USE School;

--Create a Table for Friends Details
CREATE TABLE Friends (
 id INTEGER PRIMARY KEY,
 name VARCHAR(30) NOT NULL,
 gender CHAR(1) NOT NULL
);

--Insert values into the table
INSERT INTO Friends VALUES 
(1, 'Ashish','M'),
(2, 'Komal', 'F'),
(3, 'Priyanka', 'F'),
(4, 'Utsav', 'M'),
(5, 'Gauri', 'F'),
(6, 'Khushi', 'F'),
(7, 'Avantika', 'F'),
(8, 'Shubham', 'M'),
(9, 'Karan', 'M'),
(10, 'Aniket', 'M');

--Show table
SELECT * FROM Friends;

--Update values in table
UPDATE Friends
SET name = 'Chris', gender = 'M'
WHERE id =1;

UPDATE Friends 
SET 
    gender = 'M'
WHERE
    id = 2;

--Show table
SELECT * FROM Friends;

--Delete statements
DELETE FROM Friends WHERE id= 2;

--Show Table
SELECT * FROM Friends;

--Select statement with where condition
SELECT name FROM Friends WHERE gender = 'F';
