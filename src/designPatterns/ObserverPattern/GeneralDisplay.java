package designPatterns.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class GeneralDisplay implements Observer, DisplayElement {
    Observable observable;
    String T;
    String H;
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDataObject){
            WeatherDataObject wdo = (WeatherDataObject)o;
            this.T = wdo.getTemperature();
            this.H = wdo.getHumidty();
        }
    }

    @Override
    public void display() {
        System.out.println(T + " "+ H);
    }
}
