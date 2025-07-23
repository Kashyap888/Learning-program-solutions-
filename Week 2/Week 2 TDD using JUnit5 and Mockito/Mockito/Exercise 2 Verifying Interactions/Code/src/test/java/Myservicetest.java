package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    private ExternalApi externalApi;
    private MyService myService;

    @BeforeEach
    public void setUp() {
        externalApi = mock(ExternalApi.class); // Create mock
        myService = new MyService(externalApi); // Inject mock
    }

    @Test
    public void testFetchData_callsExternalApiGetData() {
        myService.fetchData();
        verify(externalApi, times(1)).getData(); // Verify interaction
    }
}

