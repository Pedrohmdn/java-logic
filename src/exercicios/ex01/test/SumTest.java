package exercicios.ex01.test;

import exercicios.ex01.domain.Sum;

import java.util.Scanner;

public class SumTest {

    // Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor para A:");
        double a = Double.parseDouble(input.next());

        System.out.println("Digite um valor para B:");
        double b = Double.parseDouble(input.next());

        System.out.println("Digite um valor para C:");
        double c = Double.parseDouble(input.next());

        input.close();

        Sum sum = new Sum(a,b,c);

        sum.calculateSum();
    }

}
