package exercicios.ex17.test;

public class GrowthTest {

    /*
    Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Sara seja maior que ficara.
     */


    public static void main(String[] args) {
        double saraHeight = 1.10;
        double franciscoHeight = 1.50;
        int years = 0;

        while (saraHeight < franciscoHeight){
            saraHeight+= 0.03;
            years++;
        }

        System.out.printf("Sara ficará maior que Francisco em %d anos", years);
    }
}
