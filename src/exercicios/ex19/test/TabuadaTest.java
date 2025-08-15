package exercicios.ex19.test;

import exercicios.ex19.domain.Tabuada;

import java.util.Scanner;

public class TabuadaTest {

    // Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número da tabuada: ");
        int num = input.nextInt();
        input.close();

        Tabuada tabuada = new Tabuada(num);

        tabuada.calcTabuada();


    }


}
