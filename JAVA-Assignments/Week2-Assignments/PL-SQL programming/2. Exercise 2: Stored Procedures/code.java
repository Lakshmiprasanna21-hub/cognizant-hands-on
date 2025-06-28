--ProcessMonthlyInterest: Apply Monthly Interest to Savings Accounts


-- STEP 1: Create the ACCOUNTS table
CREATE TABLE ACCOUNTS (
  ACCOUNT_ID NUMBER PRIMARY KEY,
  ACCOUNT_TYPE VARCHAR2(20),
  BALANCE NUMBER(10,2)
);

-- STEP 2: Insert sample data
INSERT INTO ACCOUNTS VALUES (101, 'SAVINGS', 1000);
INSERT INTO ACCOUNTS VALUES (102, 'CURRENT', 2000);
INSERT INTO ACCOUNTS VALUES (103, 'SAVINGS', 1500);
INSERT INTO ACCOUNTS VALUES (104, 'SAVINGS', 500);
COMMIT;

-- STEP 3: Create the stored procedure
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  -- Apply 1% interest to all savings accounts
  UPDATE ACCOUNTS
  SET BALANCE = BALANCE + (BALANCE * 0.01)
  WHERE ACCOUNT_TYPE = 'SAVINGS';

  COMMIT;

  DBMS_OUTPUT.PUT_LINE('✅ Monthly interest applied to all savings accounts.');
END;
/

-- STEP 4: Enable output (only needed in SQL Developer or SQL*Plus)
SET SERVEROUTPUT ON;

-- STEP 5: Execute the procedure
BEGIN
  ProcessMonthlyInterest;
END;
/

-- STEP 6: See updated balances
SELECT * FROM ACCOUNTS;

