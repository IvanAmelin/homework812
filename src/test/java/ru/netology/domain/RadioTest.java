package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldGetAndSetNumber() {
        int expected = 5;
        Radio radio = new Radio();
        radio.setMaxRadioNumber(9);
        radio.setMinRadioNumber(1);
        radio.setCurrentRadioNumber(5);
        assertEquals(expected, radio.getCurrentRadioNumber());
    }

    @Test
    public void shouldGetAndSetVolume() {
        int expected = 5;
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldUpVolume() {
        int expected = 6;
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    public void shouldDownVolume() {
        int expected = 4;
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    public void shouldGoFrom10To10Volume() {
        int expected = 10;
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    public void shouldGoFrom0To0Volume() {
        int expected = 0;
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldUpRadioNumber() {
        int expected = 6;
        Radio radio = new Radio();
        radio.setMaxRadioNumber(9);
        radio.setMinRadioNumber(1);
        radio.setCurrentRadioNumber(5);
        radio.increaseRadioNumber();
        assertEquals(expected, radio.getCurrentRadioNumber());
    }

    @Test
    public void shouldDownRadioNumber() {
        int expected = 4;
        Radio radio = new Radio();
        radio.setMaxRadioNumber(9);
        radio.setMinRadioNumber(1);
        radio.setCurrentRadioNumber(5);
        radio.decreaseRadioNumber();
        assertEquals(expected, radio.getCurrentRadioNumber());
    }
    @Test
    public void shouldGo9To1RadioNumber() {
        int expected = 1;
        Radio radio = new Radio();
        radio.setMaxRadioNumber(9);
        radio.setMinRadioNumber(1);
        radio.setCurrentRadioNumber(9);
        radio.increaseRadioNumber();
        assertEquals(expected, radio.getCurrentRadioNumber());
    }
    @Test
    public void shouldGo1To9RadioNumber() {
        int expected = 9;
        Radio radio = new Radio();
        radio.setMaxRadioNumber(9);
        radio.setMinRadioNumber(1);
        radio.setCurrentRadioNumber(1);
        radio.decreaseRadioNumber();
        assertEquals(expected, radio.getCurrentRadioNumber());
    }
}