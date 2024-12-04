package chap1_9.practice.q4;

public class WeatherApp {

    public static void main(String[] args) {

        Weather weather = Weather.RAINY;
        System.out.println("현재 날씨: " + weather.getStatus());
        System.out.println("조언: " + weather.getAdvice());
    }
}
