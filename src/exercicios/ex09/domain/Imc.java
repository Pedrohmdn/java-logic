package exercicios.ex09.domain;

public class Imc {
    private double weight;
    private double height;
    private double imcResult;
    private String message;

    public Imc(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.calcImc();

    }

    public void calcImc(){
        imcResult = this.weight / Math.pow(this.height, 2);
        

        if (imcResult < 18.5){
            this.message = "Você está abaixo do peso";
        } else if (imcResult >= 18.5 && imcResult <= 24.9) {
            this.message = "Você está no Peso ideal (parabéns)";
        }else if (imcResult >= 25.0 && imcResult <= 29.9) {
            this.message = "Você está levemente acima do peso";
        }else if (imcResult >= 30.0 && imcResult <= 34.9) {
            this.message = "Você tem Obesidade grau I";
        }else if (imcResult >= 35.0 && imcResult <= 39.9) {
            this.message = "Você tem Obesidade grau II (severa)";
        }else {
            this.message = "Você tem Obesidade grau III (mórbida)";
        }


    }

    @Override
    public String toString() {
        return
                "Peso = " + weight +
                ", Altura = " + height +
                ", IMC = " + imcResult +
                ", Resultado = '" + message;
    }
}
