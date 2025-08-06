package exercicios.ex05.domain;

public class CalcWage {
    private static double minimumWage = 1293.20;
    private double wage;

    public CalcWage(double wage) {
        this.wage = wage;
    }

    public void result(){
        double result = wage / minimumWage;

        System.out.printf("Você ganha %.0f salários mínimos", result);
    }

    public static double getMinimumWage() {
        return minimumWage;
    }

    public static void setMinimumWage(double minimumWage) {
        CalcWage.minimumWage = minimumWage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
