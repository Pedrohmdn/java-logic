package exercicios.ex16.test;

import exercicios.ex16.domain.FahrenheitToCelsius;

import java.util.Scanner;

public class FahrenheitToCelsiusTest {

    //Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.

    //Fórmula: C = (5 * ( F-32) / 9)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fahTemp = input.nextDouble();

        FahrenheitToCelsius fahrenheitToCelsius = new FahrenheitToCelsius(fahTemp);

        System.out.println(fahrenheitToCelsius);
    }
}
