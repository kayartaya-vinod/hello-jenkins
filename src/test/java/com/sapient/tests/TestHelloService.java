package com.sapient.tests;

import com.sapient.service.HelloService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestHelloService {

    HelloService service;

    @BeforeEach
    void init() {
        service = new HelloService();
    }

    @Test
    void testGetHelloMessageWithValidName() {
        Assertions.assertEquals("Hello, Vinod!", service.getHelloMessage("Vinod"));
    }

    @Test
    void testGetHelloMessageWithNullName() {
        Assertions.assertEquals("Hello, friend!", service.getHelloMessage(null));
    }

    @Test
    void testGetHelloMessageWithEmptyName() {
        Assertions.assertEquals("Hello, friend!", service.getHelloMessage("   "));
    }
}
