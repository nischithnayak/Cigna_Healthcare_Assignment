CREATE TABLE Department (
  Deptno NUMBER PRIMARY KEY,
  Dname VARCHAR2(25) NOT NULL,
  Location VARCHAR2(25) NOT NULL
);

CREATE TABLE Employee (
  Emp_No NUMBER PRIMARY KEY,
  Ename VARCHAR2(25) NOT NULL,
  Job VARCHAR2(25) NOT NULL,
  Salary NUMBER NOT NULL,
  Deptno NUMBER,
  CONSTRAINT fk_dept FOREIGN KEY (Deptno) REFERENCES Department(Deptno) ON DELETE CASCADE
);

INSERT INTO Department VALUES (10, 'Cloud', 'BLR');
INSERT INTO Department VALUES (11, 'Development', 'MUMBAI');
INSERT INTO Department VALUES (12, 'Testing', 'HYD');
INSERT INTO Department VALUES (13, 'Sales', 'DELHI');
INSERT INTO Department VALUES (14, 'Accounting', 'BLR');

INSERT INTO Employee VALUES (100, 'Nischith', 'Sales', 1000, 13);
INSERT INTO Employee VALUES (200, 'Surya', 'HR', 2000, 11);
INSERT INTO Employee VALUES (300, 'Pavan', 'Manager', 1500, 12);
INSERT INTO Employee VALUES (400, 'Navya', 'Clerk', 1200, 14);
INSERT INTO Employee VALUES (500, 'Raksha', 'Engineer', 2500, 10);
