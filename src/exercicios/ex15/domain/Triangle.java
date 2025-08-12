package exercicios.ex15.domain;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calc(){
        if (a == b && b == c){
            System.out.println("Triângulo Equilátero");
        } else if (a == b || b == c) {
            System.out.println("Triângulo Isósceles");
        } else{
            System.out.println("Triângulo Escaleno");
        }
    }
}
