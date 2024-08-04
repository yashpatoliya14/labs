
--TABLE1
CREATE TABLE DEPOSIT(
	ACTNO INT,
	CNAME VARCHAR(50),
	BNAME VARCHAR(50),
	AMOUNT DECIMAL(8,2),
	ADATE DATETIME)

--INSERT
INSERT INTO DEPOSIT VALUES(
101,'ANIL','VRCE',1000,'1995-3-1')
INSERT INTO DEPOSIT VALUES(
102,'SUNIL','AJNI',5000,'1996-1-4')
INSERT INTO DEPOSIT VALUES(
103,'MEHUL','KAROLBAGH ',3500,'1995-11-17')
INSERT INTO DEPOSIT VALUES(
104,'MADHURI','CHANDI',1200,'1995-12-17')
INSERT INTO DEPOSIT VALUES(
105,'PRAMOD','M.G. ROAD ',3000,'1996-3-27')
INSERT INTO DEPOSIT VALUES(
106,'SANDIP','ANDHERI',2000,'1996-3-31')
INSERT INTO DEPOSIT VALUES(
107,'SHIVANI ','VIRAR ',1000,'1995-9-5')
INSERT INTO DEPOSIT VALUES(
108,'KRANTI ','NEHRU PLACE ',5000,'1995-7-2')
INSERT INTO DEPOSIT VALUES(
109,'MINU ','POWAI',7000,'1995-8-10')

SELECT * FROM DEPOSIT

--TABLE2
CREATE TABLE BRANCH(
	BNAME VARCHAR(50),
	CITY VARCHAR(50),
)

--INSERT2
INSERT INTO BRANCH VALUES
	('VRCE','NAGPUR'),
	('AJNI','NAGPUR'),
	('KAROLBAGH','DELHI'),
	('CHANDI','DELHI '),
	('DHARAMPETH','NAGPUR'),
	('M.G. ROAD','BANGLORE '),
	('ANDHERI','BOMBAY'),
	('VIRAR','BOMBAY'),
	('NEHRU PLACE ','DELHI'),
	('POWAI','BOMBAY')

SELECT * FROM BRANCH 

--TABLE3
CREATE TABLE CUSTOMERS(
    CNAME VARCHAR(50), 
	CITY VARCHAR(50)
)

--INSERT3
INSERT INTO CUSTOMERS
VALUES
('ANIL', 'CALCUTTA'),
('SUNIL', 'DELHI'), 
('MEHUL', 'BARODA'), 
('MANDAR', 'PATNA'), 
('MADHURI','NAGPUR'), 
('PRAMOD','NAGPUR'), 
('SANDIP','SURAT'),
('SHIVANI','BOMBAY'),
('KRANTI', 'BOMBAY'),
('NAREN', 'BOMBAY')



--TABLE4
CREATE TABLE BORROW(
    LOANNO  INT,
    CNAME	VARCHAR(50),
    CITY	VARCHAR(50),
    AMOUNT  DECIMAL(8,2)
)

--INSERT4
INSERT INTO BORROW VALUES
(201,'ANIL','VRCE',1000), 
(206,'MEHUL','AJNI',5000),
(311,'SUNIL','DHARAMPETH',3000),
(321,'MADHURI','ANDHERI',2000),
(375,'PRAMOD','VIRAR',8000),
(481,'KRANTI','NEHRU PLACE', 3000)

SELECT * FROM BORROW






--1. Retrieve all data from table DEPOSIT.
SELECT * FROM DEPOSIT
--2. Retrieve all data from table BORROW.
SELECT * FROM BORROW
--3. Retrieve all data from table CUSTOMERS.
SELECT * FROM CUSTOMERS
--4. Display Account No, Customer Name & Amount from DEPOSIT.
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSIT
--5. Display Loan No, Amount from BORROW.
SELECT LOANNO,AMOUNT FROM BORROW
--6. Display loan details of all customers who belongs to ‘ANDHERI’ branch from borrow table.
SELECT * FROM BORROW WHERE CITY='ANDHERI'
--7. Give account no and amount of depositor, whose account no is equals to 106 from deposit table.
SELECT ACTNO,AMOUNT FROM DEPOSIT WHERE ACTNO>6
--8. Give name of borrowers having amount greater than 5000 from borrow table.
SELECT CNAME FROM BORROW WHERE AMOUNT>5000
--9. Give name of customers who opened account after date '1-12-96' from deposit table.
SELECT CNAME FROM DEPOSIT WHERE ADATE >'1996-12-01'
--10. Display name of customers whose account no is less than 105 from deposit table.
SELECT CNAME FROM DEPOSIT WHERE ACTNO<105
--11. Display name of customer who belongs to either ‘NAGPUR’ or ‘DELHI’ from customer table. (OR & IN)
SELECT * FROM CUSTOMERS WHERE CNAME IN('NAGPUR','DELHI')
--12. Display name of customers with branch whose amount is greater than 4000 and account no is less than
--105 from deposit table.
SELECT CNAME FROM DEPOSIT WHERE AMOUNT>4000 AND ACTNO<105
--13. Find all borrowers whose amount is greater than equals to 3000 & less than equals to 8000 from borrow
--table. (AND & BETWEEN)
SELECT * FROM BORROW WHERE AMOUNT BETWEEN 3000 AND 8000
--14. Find all depositors who do not belongs to ‘ANDHERI’ branch from deposit table.
SELECT * FROM DEPOSIT WHERE BNAME<>'ANDHERI'
--15. Display Account No, Customer Name & Amount of such customers who belongs to ‘AJNI’, ‘KAROLBAGH’
--Or ‘M.G.ROAD’ and Account No is less than 104 from deposit table.
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSIT WHERE BNAME IN ('AJNI','KAROLBAGH','MGROAD') AND ACTNO<104


