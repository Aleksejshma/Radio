package ru.netologi.radio;

public class Radio {

    private int currentStation;

    private int currentVolume;

    private int nextStation;

    private int prevStation;

    private int diminishVolume;

    private int addVolume;


    public int getAddVolume() {
        return addVolume;
    }

    public void setAddVolume(int addVolume) {
        if (currentVolume != 100) {
            currentVolume++;
            return;
        }
        currentVolume = 100;
        this.addVolume = addVolume;
    }

    public int getDiminishVolume() {
        return diminishVolume;
    }

    public void setDiminishVolume(int diminishVolume) {
        if (currentVolume != 0) {
            currentVolume--;
            return;
        }
        currentVolume = 0;
        this.diminishVolume = diminishVolume;
    }

    public int getPrevStation() {
        return prevStation;
    }

    public void setPrevStation(int prevStation) {
        if (currentStation != 0) {
            currentStation--;
            return;
        }
        currentStation = 9;
        this.prevStation = prevStation;
    }


    public int getNextStation() {
        return nextStation;
    }

    public void setNextStation(int nextStation) {
        if (currentStation != 9) {
            currentStation++;
            return;
        }
        currentStation = 0;
        this.nextStation = nextStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }

        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }
}
