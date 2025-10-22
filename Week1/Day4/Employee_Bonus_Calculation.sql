DECLARE
    emp_name VARCHAR2(50) := 'Nischith Nayak';
    salary NUMBER := 45000;
    bonus NUMBER;
BEGIN
    IF salary > 50000 THEN
        bonus := salary * 0.10;
    ELSE
        bonus := salary * 0.15;
    END IF;
    DBMS_OUTPUT.PUT_LINE('Employee Name: ' || emp_name);
    DBMS_OUTPUT.PUT_LINE('Salary: ' || salary);
    DBMS_OUTPUT.PUT_LINE('Bonus: ' || bonus);
END;
/
