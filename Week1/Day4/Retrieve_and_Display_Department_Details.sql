DECLARE
    v_dept DEPARTMENTS%ROWTYPE;
    v_deptid DEPARTMENTS.DEPT_ID%TYPE := 10;
BEGIN
    SELECT * INTO v_dept
    FROM DEPARTMENTS
    WHERE DEPT_ID = v_deptid;
    DBMS_OUTPUT.PUT_LINE('Department Name: ' || v_dept.DEPT_NAME);
    DBMS_OUTPUT.PUT_LINE('Location: ' || v_dept.LOCATION);
END;
/
