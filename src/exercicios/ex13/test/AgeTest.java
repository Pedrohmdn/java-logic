package exercicios.ex13.test;

import exercicios.ex13.domain.Age;

import java.util.Scanner;

public class AgeTest {

    //Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = input.nextLine();
        System.out.println("Digite sua idade: ");
        int ageInput = Integer.parseInt(input.next());
        input.close();

        Age age = new Age(name, ageInput);

        System.out.println(age);
    }
}
