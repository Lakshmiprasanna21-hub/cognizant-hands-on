package com.example;
import static org.junit.Assert.*;
import org.junit.Test;
public class AssertionsTest {
	

	    @Test
	    public void testAssertions() {

	        // Assert equals: check if 2 + 3 is equal to 5
	        assertEquals(5, 2 + 3);

	        // Assert true: check if the condition is true
	        assertTrue(5 > 3);

	        // Assert false: check if the condition is false
	        assertFalse(5 < 3);

	        // Assert null: check if value is null
	        Object obj1 = null;
	        assertNull(obj1);

	        // Assert not null: check if value is not null
	        String name = "JUnit";
	        assertNotNull(name);
	    }
	}
