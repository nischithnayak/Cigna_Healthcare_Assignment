**Department Table**

CREATE TABLE Department(
Deptno NUMBER PRIMARY KEY,
Dname VARCHAR2(25) NOT NULL,
Location VARCHAR2(25) NOT NULL
);

**Employee Table** 

CREATE TABLE Employee(
Emp_No NUMBER PRIMARY KEY,
Ename VARCHAR2(25) NOT NULL,
Job VARCHAR2(25) NOT NULL,
Salary NUMBER NOT NULL,
Deptno NUMBER,
CONSTRAINT fk_dept FOREIGN KEY(Deptno) REFERENCES Department(Deptno) ON DELETE CASCADE
);

**Insert Dept Values**

INSERT INTO Department VALUES(10, "CLOUD","BLR"); 
INSERT INTO Department VALUES(11, "DEV","MUMBAI"); 
INSERT INTO Department VALUES(12, "TEST","HYD"); 
 

**Insert Employee Values**


INSERT INTO Employee VALUES(100, "Nischith", "QA", 1000, 10); 
INSERT INTO Employee VALUES(200, "Surya", "HR", 2000, 11);
INSERT INTO Employee VALUES(300, "Pavan", "Manager", 1500, 12);  


1.Display employee names along with their department names

SELECT e.Ename, d.Dname
FROM Employee e
INNER JOIN Department d
ON d.Deptno=e.Deptno

2.List all employees with their job titles and the location of their department

SELECT e.Ename, e.Job, d.Location 
FROM Employee e
INNER JOIN Department d
ON d.Deptno=e.Deptno;  

3. Display employess who work in the sales department

SELECT d.Dname, e.Ename
FROM Employee e
INNER JOIN Department d 
ON e.Deptno=d.Deptno
WHERE d.Dname="Sales";

4. List all employess along with their department name and location, including departments that have no employees.

SELECT e.Ename, d.Dname, d.Location 
FROM Employee e
RIGHT JOIN Department d
ON e.Deptno=d.Deptno;
