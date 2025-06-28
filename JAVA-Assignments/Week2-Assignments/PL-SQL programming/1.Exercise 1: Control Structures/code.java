---The bank wants to apply a discount to loan interest rates for customers above 60 years old.
  
  
  
  BEGIN
  -- Loop through all customers who are older than 60
  FOR cust IN (
    SELECT CUSTOMER_ID, AGE
    FROM CUSTOMERS
    WHERE AGE > 60
  ) LOOP
    -- Apply 1% discount to their loan interest rate
    UPDATE LOANS
    SET LOAN_INTEREST_RATE = LOAN_INTEREST_RATE - 1
    WHERE CUSTOMER_ID = cust.CUSTOMER_ID;

    -- Print output message for confirmation
    DBMS_OUTPUT.PUT_LINE('1% interest discount applied to customer ID: ' || cust.CUSTOMER_ID);
  END LOOP;

  -- Commit the changes to the database
  COMMIT;
END;
