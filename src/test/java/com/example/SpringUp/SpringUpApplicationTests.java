package com.example.SpringUp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SpringUpApplicationTestsTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void contextLoadsSuccessfully() {
        // Test that the application context loads without errors
        assertNotNull(applicationContext, "Application context should not be null");
    }

    @Test
    void mainApplicationBeanExists() {
        // Test that the main SpringUpApplication bean is present
        boolean hasMainBean = applicationContext.containsBean("springUpApplication");
        assertTrue(hasMainBean, "Main application bean should exist in context");
    }

    @Test
    void contextHasExpectedBeans() {
        // Test that at least one expected bean (e.g., from Spring Boot auto-configuration) is present
        boolean hasDataSource = applicationContext.containsBean("dataSource");
        assertTrue(hasDataSource, "DataSource bean should be available in context");
    }
}
