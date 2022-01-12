package ru.netology.domain;

public class Radio {
    private int maxRadioNumber;
    private int minRadioNumber;
    private int currentRadioNumber;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;

    public int getMaxRadioNumber() {
        return maxRadioNumber;
    }

    public void setMaxRadioNumber(int maxRadioNumber) {
        this.maxRadioNumber = maxRadioNumber;
    }

    public int getMinRadioNumber() {
        return minRadioNumber;
    }

    public void setMinRadioNumber(int minRadioNumber) {
        this.minRadioNumber = minRadioNumber;
    }

    public int getCurrentRadioNumber() {
        return currentRadioNumber;
    }

    public void setCurrentRadioNumber(int currentRadioNumber) {
        if (currentRadioNumber > maxRadioNumber) {
            return;
        }
        if (currentRadioNumber < minRadioNumber) {
            return;
        }
        this.currentRadioNumber = currentRadioNumber;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public int increaseRadioNumber() {
        if (currentRadioNumber < 9) {
            currentRadioNumber = currentRadioNumber + 1;
            return currentRadioNumber;
        }
        if (currentRadioNumber == 9) {
            currentRadioNumber = 1;
        }
        return currentRadioNumber;
    }

    public int decreaseRadioNumber() {
        if (currentRadioNumber > 1) {
            currentRadioNumber = currentRadioNumber - 1;
            return currentRadioNumber;
        }
        if (currentRadioNumber == 1) {
            currentRadioNumber = 9;
        }
        return currentRadioNumber;
    }
}