package exercicios.ex15.test;

import exercicios.ex15.domain.Triangle;

import java.util.Scanner;

public class TriangleTest {

    //Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
    //equilátero, isósceles ou escaleno.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do lado A do triâgulo: ");
        double a = input.nextDouble();
        System.out.println("Digite o valor do lado B do triâgulo: ");
        double b = input.nextDouble();
        System.out.println("Digite o valor do lado C do triâgulo: ");
        double c = input.nextDouble();

        Triangle triangle = new Triangle(a,b,c);

        triangle.calc();
    }
}
