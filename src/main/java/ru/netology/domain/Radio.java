package ru.netology.domain;

public class Radio {
    private int currentRS;
    private int currentVolume;
    private int minRS = 0;
    private int maxRS = 9;
    private int minVolume = 0;
    private int maxVolume = 10;


    //метод увеличения радиостанции


    public void increaseRS() {
        if (currentRS < maxRS) {
            currentRS += 1;
        } else {
            currentRS = minRS;
        }
        setCurrentRS(currentRS);
    }


    //метод уменьшения радиостанции
    public void decreaseRS() {


        if (currentRS != minRS) {
            currentRS -= 1;
        } else {
            currentRS = maxRS;
        }
        setCurrentRS(currentRS);
    }

    public int getCurrentRS() {
        return currentRS;
    }

    public void setCurrentRS(int currentRS) {
        if (currentRS < minRS) {
            return;
        }
        if (currentRS > maxRS) {
            return;
        }
        this.currentRS = currentRS;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;

    }

    //метод увеличения громкости
    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        } else {
            currentVolume = maxVolume;
        }
        setCurrentVolume(currentVolume);
    }

    //метод уменьшения громкости
    public void decreaseVolume() {
        if (currentVolume != minVolume) {
            currentVolume -= 1;
        } else {
            currentVolume = minVolume;
        }
        setCurrentVolume(currentVolume);
    }


}
