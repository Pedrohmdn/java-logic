package exercicios.ex02.test;

import exercicios.ex02.domain.OddOrEven;

import java.util.Scanner;

public class OddOrEvenTest {

    //Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = Integer.parseInt(input.next());


        OddOrEven oddOrEven = new OddOrEven(num);

        oddOrEven.result();
    }
}
