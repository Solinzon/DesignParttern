package observer;

public class Main {
    public static void main(String[] args) {
        IObservable weatherBureau = new WeatherBureau();
        weatherBureau.subscrib(new Citizen("老王"));
        weatherBureau.subscrib(new Citizen("老张"));
        weatherBureau.subscrib(new Citizen("老陈"));
        weatherBureau.notifyAllObervers("晴天");

    }
}
