package exercicios.ex10.test;

import exercicios.ex10.domain.Average;

import java.util.Scanner;

public class AveregeTest {

    // Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double value1 = Double.parseDouble(input.next());
        System.out.println("Digite a segunda nota:");
        double value2 = Double.parseDouble(input.next());
        System.out.println("Digite a terceira nota:");
        double value3 = Double.parseDouble(input.next());
        input.close();

        Average average = new Average(value1, value2, value3);

        average.calcAverage();
    }
}
