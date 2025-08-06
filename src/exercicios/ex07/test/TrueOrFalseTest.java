package exercicios.ex07.test;

import exercicios.ex07.domain.TrueOrFalse;

import java.util.Scanner;

public class TrueOrFalseTest {

    //Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite true ou false:");
        boolean bool1 = Boolean.parseBoolean(input.next());
        System.out.println("Digite true ou false novamente:");
        boolean bool2 = Boolean.parseBoolean(input.next());
        input.close();
        TrueOrFalse trueOrFalse = new TrueOrFalse(bool1, bool2);

        trueOrFalse.result();

    }
}
