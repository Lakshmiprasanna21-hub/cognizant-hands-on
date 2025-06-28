---The bank wants to apply a discount to loan interest rates for customers above 60 years old.
  
  -- Step 1: Create CUSTOMER table
CREATE TABLE CUSTOMERS (
  CUSTOMER_ID NUMBER,
  AGE NUMBER
);

-- Step 2: Create LOANS table
CREATE TABLE LOANS (
  CUSTOMER_ID NUMBER,
  LOAN_INTEREST_RATE NUMBER
);

-- Step 3: Insert sample data
INSERT INTO CUSTOMERS VALUES (1, 65);
INSERT INTO CUSTOMERS VALUES (2, 70);
INSERT INTO CUSTOMERS VALUES (3, 58);

INSERT INTO LOANS VALUES (1, 10.5);
INSERT INTO LOANS VALUES (2, 11.0);
INSERT INTO LOANS VALUES (3, 12.0);

COMMIT;

-- Step 4: PL/SQL block to apply discount
BEGIN
  FOR cust IN (
    SELECT CUSTOMER_ID, AGE
    FROM CUSTOMERS
    WHERE AGE > 60
  ) LOOP
    UPDATE LOANS
    SET LOAN_INTEREST_RATE = LOAN_INTEREST_RATE - 1
    WHERE CUSTOMER_ID = cust.CUSTOMER_ID;

    DBMS_OUTPUT.PUT_LINE('1% interest discount applied to customer ID: ' || cust.CUSTOMER_ID);
  END LOOP;

  COMMIT;
END;
/

  
 
