package exercicios.ex10.domain;

public class Average {
    private double value1;
    private double value2;
    private double value3;
    private double avarage;

    public Average(double value1, double value2, double value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public void calcAverage(){
        this.avarage = (value1 + value2 + value3) / 3;
        System.out.printf("Media: %.2f", avarage);
    }
}
