package exercicios.ex03.domain;

public class Calc {
    private int a;
    private int b;
    private int c;

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void operation(){

        if (a == b){
            c = a + b;
        }else {
            c = a * b;
        }

        System.out.println("O resultado da operação é: " + c);
    }
}
