CREATE TABLE DEPARTMENT(
    Dnumber INT PRIMARY KEY,
    Dname VARCHAR(15),
    Mgr_ssn INT,
    Mgr_start_date DATE
);

CREATE TABLE PROJECT (
    Pnumber INT PRIMARY KEY,
    Pname VARCHAR(15),
    Plocation VARCHAR(15),
    Dnum INT,
    FOREIGN KEY (Dnum) REFERENCES DEPARTMENT(Dnumber)
);

CREATE TABLE DEPT_LOCATIONS (
    Dlocation VARCHAR PRIMARY KEY,
    Dnumber INT,
    FOREIGN KEY (Dnumber) REFERENCES DEPARTMENT(Dnumber)
);

CREATE TABLE EMPLOYEE (
    Ssn INT PRIMARY KEY,
    Fname VARCHAR(15),
    Minit CHAR,
    Lname VARCHAR(15),
    Bdate DATE,
    Address VARCHAR(30),
    Sex CHAR,
    Salary DECIMAL(10, 2),
    Super_ssn INT,
    Dno INT,
    FOREIGN KEY (Dnumber) REFERENCES DEPARTMENT(Dnumber),
    FOREIGN KEY (Super_ssn) REFERENCES EMPLOYEE(Ssn)
);

CREATE TABLE WORKS_ON(
    Essn INT,
    Pno INT,
    Hours DECIMAL(3, 1),
    PRIMARY KEY (Essn, Pno),
    FOREIGN KEY (Essn) REFERENCES EMPLOYEE(Ssn),
    FOREIGN KEY (Pno) REFERENCES PROJECT(Pnumber)
);

CREATE TABLE DEPENDENT(
    Dependent_name VARCHAR PRIMARY KEY,
    Essn INT,
    SEX CHAR,
    Bdate DATE,
    Relationship VARCHAR(8),
    FOREIGN KEY (Essn) REFERENCES EMPLOYEE(Ssn)
);