package exercicios.ex21.test;

import java.util.Scanner;

public class QuotientTest {

    //  Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = input.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = input.nextInt();
        input.close();

        calcQuotient(a, b);
    }

    public static void calcQuotient(int a, int b){
        int result = a / b;
        int rest = a % b;
        System.out.println(" O Quociente de " + a + " dividido por " + b + " é " + result);
        System.out.println(" O Resto de " + a + " dividido por " + b + " é " + rest);
    }
}
