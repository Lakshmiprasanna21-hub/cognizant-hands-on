------Test Class using Mockito
  
  package Examples;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Mock the ExternalApi
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Define mock behavior
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject mock into MyService
        MyService service = new MyService(mockApi);

        // Step 4: Call the method
        String result = service.fetchData();

        // Step 5: Verify that getData() was called
        verify(mockApi).getData();

        // Optional: check the output
        assertEquals("Mock Data", result);
    }
}
