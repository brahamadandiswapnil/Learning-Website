package com.demo.lerning_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoProjectApplicationTests {

    @Test
    void contextLoads() {
        // This test ensures that the Spring application context loads successfully.
        // If the application fails to start due to a misconfiguration, this test will fail.
        assertTrue(true);
    }
}
