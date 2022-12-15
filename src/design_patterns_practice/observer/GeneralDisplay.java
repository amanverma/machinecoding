package design_patterns_practice.observer;

import java.util.Observable;
import java.util.Observer;

public class GeneralDisplay implements Observer {
    Observable observable;
    private String temp;
    private String humidity;
    GeneralDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDataObject){
            WeatherDataObject wdo = (WeatherDataObject) o;
            this.temp = wdo.getTemp();
            this.humidity = wdo.getHumidity();
            display();
        }

    }

    private void display() {
        System.out.println("temp = "+ temp +" humidity= "+ humidity);
    }
}
