create table STUDENT_INFO(
	Rno int,
	Name varchar(20),
	Branch varchar(20),
	spi decimal(4,2),
	backlog int

)

insert into STUDENT_INFO values
(101 ,'Raju' ,'CE', 8.80, 0),
(102 ,'Amit', 'CE', 2.20 ,3),
(103 ,'Sanjay', 'ME', 1.50, 6),
(104 ,'Neha' ,'EC', 7.65, 1),
(105 ,'Meera', 'EE', 5.52, 2),
(106 ,'Mahesh' ,'EC', 4.50, 3)

select * from STUDENT_INFO



--1. Create a view Personal with all columns.
create view Personal 
as 
select * from STUDENT_INFO
--2. Create a view Student_Details having columns Name, Branch & SPI.
create view Student_Details 
as 
select Name,Branch,spi from STUDENT_INFO
--3. Create a view AcademicData having columns RNo, Name, Branch.
create view AcademicData 
as 
select rno,Name,BRANCH from STUDENT_INFO
--4. Create a view Student_ bklog having all columns but students whose bklog more than 2.
create view Student_bklog  
as 
select * from STUDENT_INFO where backlog>2
--5. Create a view Student_Pattern having RNo, Name & Branch columns in which Name consists of four
--letters.
create view Student_Pattern 
as 
select rno, Name ,Branch from STUDENT_INFO where Name like '____'
--6. Insert a new record to AcademicData view. (107, Meet, ME)
insert into AcademicData values(107,'Meet','ME')
--7. Update the branch of Amit from CE to ME in Student_Details view.
update Student_Details set branch='ME' where Name='Amit'
--8. Delete a student whose roll number is 104 from AcademicData view.
delete from AcademicData where rno=104

select * from AcademicData 



-----------------------------------------------------part b---------------------------------

--1. Create a view that displays information of all students whose SPI is above 8.5
create view view1 
as 
select * from STUDENT_INFO where spi>8.5
--2. Create a view that displays 0 backlog students.
create view view2 
as 
select * from STUDENT_INFO where backlog=0
--3. Create a view Computerview that displays CE branch data only
create view Computerview
as 
select * from STUDENT_INFO where branch='ce'

select * from Computerview 



-----------------------part -c ------------------------

--1. Create a view Result_EC that displays the name and SPI of students with SPI less than 5 of branch EC.
create view Result_EC 
as 
select name, spi from STUDENT_INFO where spi<5 and branch = 'ec'
--2. Update the result of student MAHESH to 4.90 in Result_EC view.
update Result_EC set spi=4.90 where Name='Mahesh'
--3. Create a view Stu_Bklog with RNo, Name and Bklog columns in which name starts with ‘M’ and having
--bklogs more than 5.
create view Stu_Bklog
as 
select rno,name,backlog from STUDENT_INFO where name like 'm%' and backlog>5

select * from Stu_Bklog
--4. Drop Computerview form the database.
drop view Computerview





----------------------------------------------------extra  


--1.Calculate the average salary of employees hired after 1st January, 1991. Label the column as Average_Salary_After_1991.
   select avg(salary) as Average_Salary_After_1991 from EMP where JDATE> '1991-01-01'
--2.Find the total number of employees in each department.
	select count(*),DEPARTMENT from EMP group by DEPARTMENT
--3.Display the total salary of employees in each city in descending order.
	select emp(SALARY),DEPARTMENT from EMP group by DEPARTMENT
--4.Find the total number of employees in each city.

--5.Find the highest salary among all employees.

--6.Retrieve the maximum salary from the IT department.

--7.Count the total number of distinct cities where employees reside.

--8.Calculate the total salary of each department.

--9.Find the minimum salary of an employee residing in Ahmedabad.
   
--10.List the departments with total salaries exceeding 50000 and located in Rajkot.
   
--11.List the departments with total salaries exceeding 35000 and sort the list by total salary.
    
--12.List departments with more than two employees.

--13.Show departments where the average salary is above 25000.
    
--14.Retrieve cities with employees hired before 1st January 1991.

--15.Find departments with a total salary between 50000 and 100000.
