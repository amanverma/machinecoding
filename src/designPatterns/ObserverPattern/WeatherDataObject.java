package designPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

//Observable superclass manages registration/de-registration of Observer and notification of Observers.
public class WeatherDataObject extends Observable {
    public String getTemperature() {
        return temperature;
    }

    public String getHumidty() {
        return humidity;
    }

    public String getPressure() {
        return pressure;
    }

    String temperature;
    String humidity;
    String pressure;
    //List<Observer> observerList;

    WeatherDataObject(List<Observer> observerList){
        observerList.forEach(o->{
            this.addObserver(o);
        });
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(String T, String H, String P){
        this.temperature = T;
        this.humidity = H;
        this.pressure = P;
        measurementsChanged();
    }
}
