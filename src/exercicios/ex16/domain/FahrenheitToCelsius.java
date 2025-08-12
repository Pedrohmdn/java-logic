package exercicios.ex16.domain;

public class FahrenheitToCelsius {
    private double fahrenheitTemp;
    private double celsiusTemp;

    public FahrenheitToCelsius(double fahrenheitTemp) {
        this.fahrenheitTemp = fahrenheitTemp;
        calcCelsius();
    }

    public void calcCelsius(){
        celsiusTemp = (5 * (fahrenheitTemp - 32)) / 9;
    }

    @Override
    public String toString() {
        return "fahrenheitTemp = " + fahrenheitTemp +
                ", celsiusTemp = " + celsiusTemp;
    }
}
