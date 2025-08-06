package exercicios.ex06.domain;

public class Readjustment {
    private double value;
    private double percentage = 0.05;

    public Readjustment(double value) {
        this.value = value;
    }

    public void calc(){
        double result = this.value + this.value * percentage;
        System.out.printf("Valor apos o reajuste de %.2f%s: %.3f ", this.percentage,"%", result);

    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
