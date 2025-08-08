package exercicios.ex13.domain;

public class Age {
    private String name;
    private int age;
    private String message;

    public Age(String name, int age) {
        this.name = name;
        this.age = age;

        if (age >=18){
            message = "Maior de idade";
        }else {
            message = "Menor de idade";
        }
    }

    @Override
    public String toString() {
        return "Nome: " + name
                + "\nIdade: " + age
                + "\nResultado: " + message ;
    }
}
