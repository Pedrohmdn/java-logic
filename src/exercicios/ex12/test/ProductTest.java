package exercicios.ex12.test;

import exercicios.ex12.domain.Product;

import java.util.Scanner;

public class ProductTest {

    /*
    Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento

     pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.



     Tabela de Código de Condições de Pagamento



     1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto

     2 - À Vista no cartão de crédito, recebe 10% de desconto

     3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros

     4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double value = Double.parseDouble(input.next());
        System.out.println("Digite um dos números para selecionar a forma de pagamento:\n1 - Avista\n2 - Avista no Cartão\n3 - Parcelado em 2 vezes\n4 - Parceldo em 3 vezes ");
        String formaDePagamento = input.nextLine();
        input.close();

        Product product = new Product(value, formaDePagamento);

        try {
            product.calcValue();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }




    }
}
