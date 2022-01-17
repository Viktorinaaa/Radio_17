package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource(
            value = {"'Mid', 5, 5",
                    "'Min1', 0, 0",
                    "'Max1', 9, 9",
                    "'Min2', 1, 1",
                    "'Max2', 8, 8",
                    "'OverMax', 15, 0",
                    "'UnderMin', -15, 0"
            }
    )
    public void getCurrentRS(String name, int currentRS, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRS(currentRS);
        int actual = radio.getCurrentRS();

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(
            value = {"'Mid', 3, 4",
                    "'Min', 0, 1",
                    "'Max', 9, 0",
                    "'Min2', 1, 2",
                    "'Max2', 8, 9",
                    "'OverMax', 15, 1",
                    "'UnderMin', -15, 1"


            }
    )
    void increaseRS(String name, int currentRS, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRS(currentRS);
        radio.increaseRS();

        int actual = radio.getCurrentRS();

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource(
            value = {"'Mid', 6, 5",
                    "'Min', 0, 9",
                    "'Max', 9, 8",
                    "'Min2', 1, 0",
                    "'Max2', 8, 7",
                    "'OverMax', 15, 9",
                    "'UnderMin', -15, 9"
            }
    )
    void decreaseRS(String name, int currentRS, int expected) {
        Radio radio = new Radio();

        radio.setCurrentRS(currentRS);
        radio.decreaseRS();

        int actual = radio.getCurrentRS();

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(
            value = {"'Mid', 3, 3",
                    "'Min', 0, 0",
                    "'Max', 10, 10",
                    "'Min2', 1, 1",
                    "'Max2', 8, 8",
                    "'OverMax', 15, 0",
                    "'UnderMin', -15, 0"
            }
    )
    void getCurrentVolume(String name, int currentVolume, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(currentVolume);
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(
            value = {"'Mid', 3, 4",
                    "'Min', 0, 1",
                    "'Max', 10, 10",
                    "'Min2', 1, 2",
                    "'Max2', 9, 10",
                    "'OverMax', 15, 1",
                    "'UnderMin', -15, 1"

            }
    )
    void increaseVolume(String name, int currentVolume, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource(
            value = {"'Mid', 3, 2",
                    "'Min', 0, 0",
                    "'Max', 10, 9",
                    "'Min2', 1, 0",
                    "'Max2', 9, 8",
                    "'OverMax', 15, 0",
                    "'UnderMin', -15, 0"
            }
    )
    void decreaseVolume(String name, int currentVolume, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


}