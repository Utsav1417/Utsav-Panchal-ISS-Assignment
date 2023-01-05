CREATE DATABASE sql_date_time;
USE sql_date_time;

CREATE TABLE EmployeeIndia (
  EmployeeId INT PRIMARY KEY, 
  FirstName VARCHAR(10), 
  LastName VARCHAR(10), 
  Gender VARCHAR(10), 
  Department VARCHAR(20)
);

INSERT INTO EmployeeIndia 
VALUES 
  (
    1, 'Pranita', 'Shetty', 'Female', 'IT'
  );
INSERT INTO EmployeeIndia 
VALUES 
  (
    2, 'Priyanka', 'Jampana', 'Female', 
    'BA'
  );
INSERT INTO EmployeeIndia 
VALUES 
  (
    3, 'Sushmita', 'Shinde', 'Female', 
    'HR'
  );
INSERT INTO EmployeeIndia 
VALUES 
  (4, 'Suhas', 'Patil', 'Male', 'HR');
INSERT INTO EmployeeIndia 
VALUES 
  (5, 'Anurag', 'Singh', 'Male', 'IT');
INSERT INTO EmployeeIndia 
VALUES 
  (6, 'Rajesh', 'Bane', 'Male', 'BA');
INSERT INTO EmployeeIndia 
VALUES 
  (7, 'Hina', 'Khan', 'Female', 'IT');
  
SELECT 
  * 
FROM 
  EmployeeIndia;
  
CREATE TABLE EmployeeUSA (
  EmployeeId INT PRIMARY KEY, 
  FirstName VARCHAR(10), 
  LastName VARCHAR(10), 
  Gender VARCHAR(10), 
  Department VARCHAR(20)
);

INSERT INTO EmployeeUSA 
VALUES 
  (1, 'Chris', 'Paul', 'Male', 'IT');
INSERT INTO EmployeeUSA 
VALUES 
  (
    2, 'Priyanka', 'Jampana', 'Female', 
    'BA'
  );
INSERT INTO EmployeeUSA 
VALUES 
  (3, 'Sara', 'Sheth', 'Female', 'HR');
INSERT INTO EmployeeUSA 
VALUES 
  (4, 'Suhas', 'Patil', 'Male', 'HR');
INSERT INTO EmployeeUSA 
VALUES 
  (
    5, 'Srikant', 'Joshi', 'Male', 'IT'
  );
INSERT INTO EmployeeUSA 
VALUES 
  (6, 'Mahesh', 'Kadam', 'Male', 'BA');
INSERT INTO EmployeeUSA 
VALUES 
  (7, 'Hina', 'Khan', 'Female', 'IT');
  
SELECT 
  * 
FROM 
  EmployeeUSA;
  
SELECT FirstName, LastName, Gender, Department
FROM EmployeeIndia
UNION
SELECT FirstName, LastName, Gender, Department
FROM EmployeeUSA;

SELECT FirstName, LastName, Gender, Department
FROM EmployeeIndia
UNION ALL
SELECT FirstName, LastName, Gender, Department
FROM EmployeeUSA;

SELECT t1.* FROM EmployeeIndia AS t1
INNER JOIN EmployeeUSA AS t2 ON
t1.FirstName=t2.FirstName
AND t1.LastName=t2.LastName
AND t1.Gender=t2.Gender
AND t1.Department=t2.Department;

SELECT EmployeeIndia.FirstName,
EmployeeIndia.Gender, EmployeeIndia.Department
FROM EmployeeIndia LEFT JOIN EmployeeUSA
ON
EmployeeIndia.FirstName=EmployeeUSA.FirstName;

select current_date;
select current_time;
select current_timestamp;
select current_date-10;
select current_time-10;

CREATE TABLE race_results (
race_id int,
runner_name varchar(30),
race_name varchar(20),
start_day DATE,
start_time TIME,
total_miles decimal(3, 1),
end_time TIMESTAMP,
PRIMARY KEY (race_id)
);

INSERT INTO race_results
(race_id, runner_name, race_name, start_day, start_time, total_miles, end_time)
VALUES
(1, 'bolt', '1600_meters', '2022-09-18', '7:00:00', 1.0, '2022-09-18 7:06:30'),
(2, 'bolt', '5K', '2022-10-19', '11:00:00', 3.1, '2022-10-19 11:22:31'),
(3, 'bolt', '10K', '2022-11-20', '10:00:00', 6.2, '2022-11-20 10:38:05'),
(4, 'bolt', 'half_marathon', '2022-12-21', '6:00:00', 13.1, '2022-12-21 07:39:04'),
(5, 'bolt', 'full_marathon', '2023-01-22', '8:00:00', 26.2, '2023-01-22 11:23:10'),
(6, 'felix', '1600_meters', '2022-09-18', '7:00:00', 1.0, '2022-09-18 7:07:15'),
(7, 'felix', '5K', '2022-10-19', '11:00:00', 3.1, '2022-10-19 11:30:50'),
(8, 'felix', '10K', '2022-11-20', '10:00:00', 6.2, '2022-11-20 11:10:17'),
(9, 'felix', 'half_marathon', '2022-12-21', '6:00:00', 13.1, '2022-12-21 08:11:57'),
(10, 'felix', 'full_marathon', '2023-01-22', '8:00:00', 26.2, '2023-01-22 12:02:10');

Select * from race_results;

SELECT DATE '2022-10-05' + 17 AS new_date;

SELECT TIME '11:00' - TIME '3:00' AS time_diff;

SELECT runner_name, race_name, end_time - start_time
AS total_time
FROM race_results;

SELECT runner_name, race_name, end_time - start_time AS half_full_results
FROM race_results
WHERE total_miles > 12;

select count(runner_name), race_name from race_results group by race_name;

SELECT runner_name, MIN(CAST(end_time - start_time AS time)) AS min_time
FROM race_results GROUP BY runner_name;