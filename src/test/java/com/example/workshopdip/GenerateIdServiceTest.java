package com.example.workshopdip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GenerateIdServiceTest {

    @Autowired
    private GenerateIdService service;

    @Test
    @DisplayName("test stub")
    public void case01() {
        Random random = new Random(){
            @Override
            public int nextInt(int bound) {
                return 7;
            }
        };
        service.setRandom(random);
        String id = service.get();
        assertEquals("XYZ7", id);
    }
}