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
    @Test
    public void shouldRadioChangeFrom9ToMin() {
        Radio radio = new Radio(10, 9, 0, 9, 100, 0, 50 );
        radio.increaseRadioNumber();
        assertEquals(0, radio.getCurrentRadioNumber());
    }
    @Test
    public void shouldRadioChangeFrom0ToMax() {
        Radio radio = new Radio(10, 9, 0, 0, 100, 0, 50 );
        radio.decreaseRadioNumber();
        assertEquals(9, radio.getCurrentRadioNumber());
    }
    @Test
    public void shouldVolumeChangeFrom0To0() {
        Radio radio = new Radio(10, 9, 0, 0, 100, 0, 0 );
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldVolumeChangeFrom100To100() {
        Radio radio = new Radio(10, 9, 0, 0, 100, 0, 100 );
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }
}