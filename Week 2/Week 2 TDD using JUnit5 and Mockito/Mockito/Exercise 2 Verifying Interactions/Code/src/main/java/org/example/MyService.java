package org.example;

import org.example.ExternalApi;

public class MyService {
    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void fetchData() {
        externalApi.getData(); // Call we want to verify
    }
}