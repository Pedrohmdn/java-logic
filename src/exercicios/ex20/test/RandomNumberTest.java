package exercicios.ex20.test;

import java.util.Random;

public class RandomNumberTest {

    //Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

    public static void main(String[] args) {

        Random random = new Random();
        int num = random.nextInt(101);
        System.out.println(num);


    }


}
