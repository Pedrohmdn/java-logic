package exercicios.ex19.domain;

public class Tabuada {
    private int tabuada;

    public Tabuada(int tabuada) {
        this.tabuada = tabuada;
    }


    public void calcTabuada(){
        for (int i = 1; i<=10; i++){
            int calc = tabuada * i;
            System.out.println(tabuada + " * " + i + " = " + calc);
        }
    }
}
