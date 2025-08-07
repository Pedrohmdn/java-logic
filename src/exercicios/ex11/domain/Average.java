package exercicios.ex11.domain;

public class Average {
    private String name;
    private double value1;
    private double value2;
    private double value3;
    private double value4;
    private double avarage;

    public Average(String name, double value1, double value2, double value3, double value4) {
        this.name = name;
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
    }

    public void calcAverage(){
        this.avarage = (value1 + value2 + value3 + 4) / 4;
        String message = "";

        if (avarage >= 7){
            message = "O aluno " + name + " Tem a média " + avarage + " e ele está aprovado";
        }
        else {
            message = "O aluno " + name + "Tem a média" + avarage + "e ele está reprovado";

        }
        System.out.println(message);
    }
}
