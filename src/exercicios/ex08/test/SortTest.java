package exercicios.ex08.test;

import exercicios.ex08.domain.Sort;

import java.util.Scanner;

public class SortTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        int value = Integer.parseInt(input.next());
        System.out.println("Digite outro número:");
        int value2 = Integer.parseInt(input.next());
        System.out.println("Digite outro número novamente:");
        int value3 = Integer.parseInt(input.next());
        input.close();
        Sort sort = new Sort(value, value2, value3);

        System.out.println(sort);
    }
}
