package ru.netology.domain.constructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldUseConstructor() {
        Radio radio = new Radio(10, 9, 0, 5, 100, 0, 50 );
        assertEquals(5, radio.getCurrentRadioNumber());
    }

    @Test
    public void shouldUseNoArgsConstructor() {
        Radio radio = new Radio();
        assertEquals(50, radio.getCurrentVolume());
    }
}