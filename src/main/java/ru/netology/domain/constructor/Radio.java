package ru.netology.domain.constructor;

public class Radio {
    private int radioNumbers = 10;
    private int maxRadioNumber = radioNumbers - 1;
    private int minRadioNumber = 0;
    private int currentRadioNumber;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = 50;

    public Radio() {
    }

    public Radio(int radioNumbers,
                 int maxRadioNumber,
                 int minRadioNumber,
                 int currentRadioNumber,
                 int maxVolume,
                 int minVolume,
                 int currentVolume) {
        this.radioNumbers = radioNumbers;
        this.maxRadioNumber = maxRadioNumber;
        this.minRadioNumber = minRadioNumber;
        this.currentRadioNumber = currentRadioNumber;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
    }

    public int getRadioNumbers() {
        return radioNumbers;
    }

    public void setRadioNumbers(int radioNumbers) {
        radioNumbers = radioNumbers;
    }

    public int getMaxRadioNumber() {
        return maxRadioNumber;
    }

    public void setMaxRadioNumber(int maxRadioNumber) {
        maxRadioNumber = maxRadioNumber;
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

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int increaseRadioNumber() {
        if (currentRadioNumber < 9) {
            currentRadioNumber = currentRadioNumber + 1;
            return currentRadioNumber;
        } else {
            currentRadioNumber = 0;

        }
        return currentRadioNumber;
    }

    public int decreaseRadioNumber() {
        if (currentRadioNumber > 1) {
            currentRadioNumber = currentRadioNumber - 1;
            return currentRadioNumber;
        } else {
            currentRadioNumber = 9;
        }
        return currentRadioNumber;
    }
}


