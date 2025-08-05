package exercicios.ex02.domain;

public class OddOrEven {
    private int num;


    public OddOrEven(int num) {
        this.num = num;

    }

    public void result(){
        String result = num % 2 == 0 ? "Par" : "Impar";

        if (num >= 0){
            System.out.printf("O número %d é %s e é positivo ", num, result);
        }else {
            System.out.printf("O número %d é %s e é negativo ", num, result);
        }


    }
}
