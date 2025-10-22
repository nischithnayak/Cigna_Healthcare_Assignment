1. Display employee names along with their department names

SELECT e.Ename, d.Dname
FROM Employee e
INNER JOIN Department d
ON e.Deptno = d.Deptno;


2. List all employees with their job titles and the location of their department

SELECT e.Ename, e.Job, d.Location
FROM Employee e
INNER JOIN Department d
ON e.Deptno = d.Deptno;

3. Display employees who work in the SALES department

SELECT e.Ename, d.Dname
FROM Employee e
INNER JOIN Department d
ON e.Deptno = d.Deptno
WHERE UPPER(d.Dname) = 'SALES';

4.List all employees along with their department name and location, including departments that have no employees

SELECT e.Ename, d.Dname, d.Location
FROM Employee e
RIGHT JOIN Department d
ON e.Deptno = d.Deptno;

5.Display all departments and employees, even if some employees are not assigned to any department

SELECT e.Ename, d.Dname
FROM Employee e
FULL OUTER JOIN Department d
ON e.Deptno = d.Deptno;

6. Show each department name and total salary paid to its employees

SELECT d.Dname, SUM(e.Salary) AS Total_Salary
FROM Employee e
INNER JOIN Department d
ON e.Deptno = d.Deptno
GROUP BY d.Dname;

7. Find departments that have more than 3 employees (Display Dname and count)

SELECT d.Dname, COUNT(*) AS Employee_Count
FROM Employee e
INNER JOIN Department d
ON e.Deptno = d.Deptno
GROUP BY d.Dname
HAVING COUNT(*) > 3;

8. Display employees who work in the same location as the ACCOUNTING department

SELECT e.Ename, d.Location
FROM Employee e
INNER JOIN Department d
ON e.Deptno = d.Deptno
WHERE d.Location = (
  SELECT Location FROM Department WHERE UPPER(Dname) = 'ACCOUNTING'
);

9.For each department, display the employee who has the highest salary

SELECT e.Ename, d.Dname, e.Salary AS Highest_Salary
FROM Employee e
INNER JOIN Department d ON e.Deptno = d.Deptno
WHERE e.Salary = (
  SELECT MAX(Salary)
  FROM Employee
  WHERE Deptno = e.Deptno
);

10. List employees whose salary is greater than the average salary of their department

SELECT e.Ename, e.Salary, e.Deptno
FROM Employee e
WHERE e.Salary > (
  SELECT AVG(Salary)
  FROM Employee
  WHERE Deptno = e.Deptno
);

