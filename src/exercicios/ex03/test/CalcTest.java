package exercicios.ex03.test;

import exercicios.ex03.domain.Calc;

import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
        caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
        imprimir seu valor na tela.

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num1 = Integer.parseInt(input.next());
        System.out.println("Digite outro número:");
        int num2 = Integer.parseInt(input.next());
        input.close();
        Calc calc = new Calc(num1, num2);

        calc.operation();
    }
}
