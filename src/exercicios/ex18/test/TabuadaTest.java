package exercicios.ex18.test;

public class TabuadaTest {

    // Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

    public static void main(String[] args) {

        for (int i = 1; i <=10; i++){
            for (int y = 1; y<=10; y++){
                int calc = i * y;
                System.out.println(i + " * " + y + " = " + calc);
            }
            System.out.println("------------------------");
        }
    }
}
