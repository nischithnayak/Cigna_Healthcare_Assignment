DECLARE
    TYPE CountryCapitalTable IS TABLE OF VARCHAR2(50) INDEX BY VARCHAR2(50);
    country_capital CountryCapitalTable;
    country VARCHAR2(50);
BEGIN
    country_capital('India') := 'New Delhi';
    country_capital('USA') := 'Washington D.C.';
    country_capital('UK') := 'London';
    country_capital('France') := 'Paris';
    country_capital('Germany') := 'Berlin';
    country_capital('Japan') := 'Tokyo';
    country := '&country';
    IF country_capital.EXISTS(country) THEN
        DBMS_OUTPUT.PUT_LINE('Capital of ' || country || ' is ' || country_capital(country));
    ELSE
        DBMS_OUTPUT.PUT_LINE('Country not found');
    END IF;
END;
/
