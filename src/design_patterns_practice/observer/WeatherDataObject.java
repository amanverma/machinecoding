package design_patterns_practice.observer;

import java.util.Observable;

public class WeatherDataObject extends Observable {
    WeatherDataObject(String temp, String pressure, String humidity){
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
    }
    public String getTemp() {
        return temp;
    }

    public String getPressure() {
        return pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    String temp;
    String pressure;
    String humidity;

    void updateParameters(String temp, String pressure, String humidity){
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }

    private void measurementsChanged() {
        this.setChanged();
        this.notifyObservers();
    }
}
