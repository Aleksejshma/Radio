package ru.netologi.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netologi.radio.Radio;

public class RadioTest {

    @Test //

    public void normalValueStationTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test//

    public void rightBorderStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test//

    public void rightBorderStationTest2() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.setCurrentStation(10);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void leftBorderStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void leftBorderStationTest2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void leftBorderStationTest3() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.setNextStation(9);


        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTest2() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation(10);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.setPrevStation(0);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTest2() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPrevStation(-1);


        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void diminishVolumeNormalValueTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void diminishVolumeLeftBorderTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.setDiminishVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void diminishVolumeLeftBorderTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setDiminishVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void addVolumeRightBorderTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.setAddVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void addVolumeRightBorderTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setAddVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
