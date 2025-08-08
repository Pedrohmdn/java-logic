package exercicios.ex14.test;

import exercicios.ex14.domain.Replace;

import java.util.Scanner;

public class ReplaceTest {

    //  Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número para o valor A: ");
        int a = input.nextInt();
        System.out.println("Digite um número para o valor B: ");
        int b = input.nextInt();
        input.close();
        Replace replace = new Replace(a, b);

        System.out.println(replace);
    }
}
