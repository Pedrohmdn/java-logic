package exercicios.ex05.test;

import exercicios.ex05.domain.CalcWage;

import java.util.Scanner;

public class CalcWageTest {

    /*
    Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
    usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu salário:");
        double wage = Double.parseDouble(input.next());

        CalcWage calcWage = new CalcWage(wage);

        calcWage.result();
    }
}
