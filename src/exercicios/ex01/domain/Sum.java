package exercicios.ex01.domain;

public class Sum {
    private double a;
    private double b;
    private double c;


    public Sum(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculateSum(){
        double result = this.a + this.b;

        if (result > this.c){
            System.out.printf("A soma dos valores a(%.1f) e b(%.1f) é %.1f, e é maior que o valor c(%.1f)", this.a, this.b, result, this.c);
        }else {
            System.out.printf("A soma dos valores a(%.1f) e b(%.1f) é %.1f, e é menor ou igual o valor c(%.1f)", this.a, this.b, result, this.c);
        }

    }
}
