DECLARE
    TYPE MarksTable IS TABLE OF NUMBER INDEX BY VARCHAR2(50);
    student_marks MarksTable;
    v_key VARCHAR2(50);
    total NUMBER := 0;
    count NUMBER := 0;
    avg_marks NUMBER;
BEGIN
    student_marks('Nischith') := 95;
    student_marks('Raksha') := 90;
    student_marks('Navya') := 88;
    student_marks('Surya') := 92;
    student_marks('Pavan') := 85;
    v_key := student_marks.FIRST;
    WHILE v_key IS NOT NULL LOOP
        DBMS_OUTPUT.PUT_LINE(v_key || ' : ' || student_marks(v_key));
        total := total + student_marks(v_key);
        count := count + 1;
        v_key := student_marks.NEXT(v_key);
    END LOOP;
    avg_marks := total / count;
    DBMS_OUTPUT.PUT_LINE('Total Marks = ' || total);
    DBMS_OUTPUT.PUT_LINE('Average Marks = ' || avg_marks);
END;
/
