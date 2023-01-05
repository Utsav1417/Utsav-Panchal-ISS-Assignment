	CREATE DATABASE Marks;
	USE Marks;

	--Create Table
	CREATE TABLE students (
	 id INTEGER PRIMARY KEY
	AUTO_INCREMENT,
	 std_name VARCHAR(20),
	 gender VARCHAR(20),
	 Maths INTEGER ,
	 Eng INTEGER,
	 His INTEGER );

	--insert some values
	INSERT INTO students
	(std_name,gender,Maths,Eng,His) VALUES
	('Ryan','M', 56 ,65,76),
	('Joanna','F',79, 91, 82),
	('Purva', 'F',84, 76, 92),
	('Rutuja','F',64,73,44),
	('Sneha','F',79,91,82),
	('Shruti','F',83,77,69),
	('Mandar','M',56,48,89),
	('Utsav','M',43,52,79),
	('Suraj','M',82,65,79),
	('Pratham','M',67,82,91);

	--Fetch Values
	SELECT * FROM students;

	--Fetch Values using aggregate functions
	SELECT AVG(Maths) as Maths_Average from students;
	SELECT AVG(Eng) as English_Average from students;
	SELECT AVG(His) as History_Average from students;

	SELECT MIN(Eng) as English_Min from students;
	SELECT MIN(Maths) as Maths_Min from students;

	SELECT MAX(His) as History_Max from students;
	SELECT MAX(Maths) as Maths_Max from students;

	SELECT SUM(Eng) as English_sum from students;
	SELECT SUM(His) as History_sum from students;

	SELECT COUNT(id) as No_of_students from students;
	SELECT COUNT(Maths) as No_of_students_given_Maths_exam from students;
	SELECT gender,COUNT(His) FROM students Group by gender;

	SELECT MAX(His) FROM students Group by gender Having MAX(His) > 90;