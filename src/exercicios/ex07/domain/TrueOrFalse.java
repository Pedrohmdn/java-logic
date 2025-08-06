package exercicios.ex07.domain;

public class TrueOrFalse {
    public boolean bool1;
    public boolean bool2;

    public TrueOrFalse(boolean bool1, boolean bool2) {
        this.bool1 = bool1;
        this.bool2 = bool2;
    }

    public void result(){
        if (bool1 == true && bool2 == true){
            System.out.println("Ambos os valores são verdadeiros");
        }else if (bool1 == false && bool2 == false){
            System.out.println("Ambos os valores são falsos");
        }
        else {
            System.out.println("um valor é falso e outro é verdadeiro");
        }
    }
}
