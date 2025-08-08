package exercicios.ex14.domain;

public class Replace {
    private int a;
    private int b;

    public Replace(int a, int b) {
        this.a = b;
        this.b = a;
    }

    @Override
    public String toString() {
        return "A = " + a +
                ", B = " + b;
    }
}
