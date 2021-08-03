package com.example.workshopdip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GenerateIdServiceUnitTest {

    @Mock
    private Random random;

    @Test
    @DisplayName("เริ่มต้นใช้งาน mockito + junit 5")
    public void case01() {
        when(random.nextInt(anyInt())).thenReturn(7);
        GenerateIdService generateIdService = new GenerateIdService();
        generateIdService.setRandom(random);
        String id = generateIdService.get();
        assertEquals("XYZ7", id);
    }
}