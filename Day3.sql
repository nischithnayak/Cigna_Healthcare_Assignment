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

INSERT INTO Department VALUES(10, "Cloud","BLR"); 
INSERT INTO Department VALUES(11, "Development","MUMBAI"); 
INSERT INTO Department VALUES(12, "Testing","HYD"); 
 

**Insert Employee Values**


INSERT INTO Employee VALUES(100, "Nischith", "Sales", 1000, 10); 
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

5.Display all departments and employees,even if sone employees are not assigned to any department 

SELECT e.Ename, d.Dname
FROM Employee e
LEFT JOIN Department d ON e.Deptno=d.Deptno;

6)Show each department name and  total salary paid to its employees.

SELECT d.Dname, SUM(e.Salary) AS Total_Salary
FROM Emp e 
INNER JOIN Dept d ON e.Deptno = d.Deptno
GROUP BY d.Dname

7) Find departments that have more than 3 employees.  Display dname and no. of employees.

SELECT d.Dname, COUNT(*) AS Employee_Count
FROM Employee e
INNER JOIN Department d ON e.Deptno = d.Deptno
GROUP BY d.Dname
HAVING COUNT(*) > 3;

8) Display employees who work in the same location as the ACCOUNTING department.

SELECT e.Ename,d.Locaton
FROM Employee e
INNER JOIN Department d ON e.Deptno = deuton
WHERE d.Locaton = (SELECT Location from Department WHERE Dname='Accounting');

9)   For each department, display the employee who has the highest salary

SELECT e.Ename,d.Dname,e.Salary AS Highest_Salary from Employee e INNER JOIN Department d ON e.Deptno = d.Deptno 
WHERE Salary IN (SELECT MAX(e.Sal) AS Highest_Salary
FROM Employee e
INNER JOIN Department d ON e.Deptno = d.Deptno
GROUP BY d.Dname); 

10) List employees whose salary is greater than the average salary of their department

SELECT e.Ename,e.Salary,e.Deptno
FROM Employee e
WHERE e.Salary > (SELECT AVG(Salary) FROM Employee where Deptno = e.Deptno)
