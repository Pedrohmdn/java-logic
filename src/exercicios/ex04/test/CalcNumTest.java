package exercicios.ex04.test;

import exercicios.ex04.domain.CalcNum;

import java.util.Scanner;

public class CalcNumTest {

    //Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num1 = Integer.parseInt(input.next());

        CalcNum calcNum = new CalcNum(num1);

        calcNum.result();
    }
}
