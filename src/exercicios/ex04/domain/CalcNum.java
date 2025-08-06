package exercicios.ex04.domain;

public class CalcNum {
    private int num;

    public CalcNum(int num) {
        this.num = num;
    }

    public void result(){
        System.out.printf("Antecessor: %d %nSucessor: %d ", num-1, num+1);
    }
}
