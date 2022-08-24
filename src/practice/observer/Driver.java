package practice.observer;

public class Driver {
    public static void main(String[] args) {
        WeatherDataObject wdo = new WeatherDataObject("45 degrees", "2.2 bar", "98%");

        GeneralDisplay generalDisplay = new GeneralDisplay(wdo);
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(wdo);

        wdo.updateParameters("27 degrees", "1.4 bar", "97%");
        wdo.updateParameters("28 degrees", "1.5 bar", "99%");
        wdo.updateParameters("34 degrees", "1.9 bar", "91%");

        System.out.println("==new info == "+'\n');

        wdo.deleteObserver(generalDisplay);

        wdo.updateParameters("39 degrees", "3.9 bar", "72%");

    }

}
