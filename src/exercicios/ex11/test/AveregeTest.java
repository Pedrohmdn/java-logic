package exercicios.ex11.test;





import exercicios.ex11.domain.Average;

import java.util.Scanner;

public class AveregeTest {

    // Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
    // se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String name = input.next();
        System.out.println("Digite a primeira nota:");
        double value1 = Double.parseDouble(input.next());
        System.out.println("Digite a segunda nota:");
        double value2 = Double.parseDouble(input.next());
        System.out.println("Digite a terceira nota:");
        double value3 = Double.parseDouble(input.next());
        System.out.println("Digite a quarta nota:");
        double value4 = Double.parseDouble(input.next());
        input.close();

        Average average = new Average(name, value1, value2, value3, value4);

        average.calcAverage();



    }
}
