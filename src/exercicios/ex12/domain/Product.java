package exercicios.ex12.domain;

public class Product {
    private double initialValue;
    private String formaDePagamento;
    private static double avista = 0.15;
    private static double avistaCartao = 0.10;
    private static double parceladoTresVezes = 0.10;

    public Product(double initialValue, String formaDePagamento) {
        this.initialValue = initialValue;
        this.formaDePagamento = formaDePagamento;
    }

    public void calcValue(){
        double finalValue;

        switch (this.formaDePagamento){
            case "1":
                finalValue = initialValue - initialValue * avista;
                System.out.printf("Valor com desconto no pagamento a vista: %.3f", finalValue);
                break;
            case "2":
                finalValue = initialValue - initialValue * avistaCartao;
                System.out.printf("Valor com desconto no pagamento a vista: %.3f", finalValue);
                break;
            case "3":
                System.out.printf("Valor sem desconto: %.3f", initialValue);
                break;
            case "4":
                finalValue = initialValue + initialValue * avistaCartao;
                System.out.printf("Valor com juros no parcelamento em 3 vezes: %.3f", finalValue);
                break;
            default:
                throw new IllegalArgumentException("Opção invalída!");

        }



    }

    public double getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(double initialValue) {
        this.initialValue = initialValue;
    }

    public static double getAvista() {
        return avista;
    }

    public static void setAvista(double avista) {
        Product.avista = avista;
    }

    public static double getAvistaCartao() {
        return avistaCartao;
    }

    public static void setAvistaCartao(double avistaCartao) {
        Product.avistaCartao = avistaCartao;
    }


    public static double getParceladoTresVezes() {
        return parceladoTresVezes;
    }

    public static void setParceladoTresVezes(double parceladoTresVezes) {
        Product.parceladoTresVezes = parceladoTresVezes;
    }
}
