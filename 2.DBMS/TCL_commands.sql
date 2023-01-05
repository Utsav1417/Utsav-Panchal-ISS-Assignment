Create Database sql_tcl;
Use sql_tcl;

CREATE TABLE details (
    id INT PRIMARY KEY,
    name VARCHAR(20),
    age INT
);

insert into details 
values 
  (1, 'Utsav', 20);
insert into details 
values 
  (2, 'Mandar', 21);
insert into details 
values 
  (3, 'Manisha', 20);
insert into details 
values 
  (4, 'Kanchan', 21);
insert into details 
values 
  (5, 'Gautam', 20);

SELECT 
    *
FROM
    details;

savepoint one;

DELETE FROM details 
WHERE
    id = 3;

SELECT 
    *
FROM
    details;

savepoint two;

UPDATE details 
SET 
    name = 'Nisha'
WHERE
    id = 4;

SELECT 
    *
FROM
    details;

savepoint three;

insert into details 
values 
  (3, 'Bhavik', 20);

SELECT 
    *
FROM
    details;

rollback;

SELECT 
    *
FROM
    details;

rollback to two;

SELECT 
    *
FROM
    details;
  
commit;
