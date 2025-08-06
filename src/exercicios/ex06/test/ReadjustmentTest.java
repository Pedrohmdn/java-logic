package exercicios.ex06.test;

import exercicios.ex06.domain.Readjustment;

import java.util.Scanner;

public class ReadjustmentTest {

    //Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor para ser reajustado:");
        double value = Double.parseDouble(input.next());
        Readjustment readjustment = new Readjustment(value);

        readjustment.calc();
    }
}
