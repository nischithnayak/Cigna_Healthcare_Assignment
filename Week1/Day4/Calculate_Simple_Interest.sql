DECLARE
    p NUMBER := 10000;   
    r NUMBER := 5;       
    t NUMBER := 2;       
    si NUMBER;           
BEGIN
    si := (p * r * t) / 100;
    DBMS_OUTPUT.PUT_LINE('Simple Interest = ' || si);
END;
/
