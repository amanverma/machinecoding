package design_patterns_practice.observer;

import java.util.Observable;
import java.util.Observer;

public class ThirdPartyDisplay implements Observer {
    Observable observable;
    String pressure;
    String humidity;
    ThirdPartyDisplay(Observable o){
        this.observable = o;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDataObject){
            WeatherDataObject wdo = (WeatherDataObject) o;
            this.pressure = wdo.getTemp();
            this.humidity = wdo.getHumidity();
            display();
        }

    }

    private void display() {
        System.out.println("pressure "+ pressure + "  humidity "+humidity);
    }
}
