package com.blessing333.gccoffee.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {
    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> new Email("accccc"));
    }

    @Test
    void testValidEmail() {
        var email = new Email("hello@gmail.com");
        assertEquals("hello@gmail.com", email.getAddress());
    }

    @Test
    void testEqEmail() {
        var email = new Email("hello@gmail.com");
        var email2 = new Email("hello@gmail.com");
        assertEquals(email, email2);
    }
}