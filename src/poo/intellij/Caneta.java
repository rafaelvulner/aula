package poo.intellij;

import java.sql.SQLOutput;

public class Caneta {

    public String modelo;
    public String cor;
    public float ponta;

    //nao encherga
    int carga;

    //nao encherga
    private boolean tampada;

    //nao enxerga
    Integer idade;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada?" + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    public void main(String[] args) {
        this.status();
    }

    public void tampar() {
        this.tampada = false;
    }

    public void destampar() {
        this.tampada = true;
    }

    public void verificarIdade(Integer idade) {

        if (idade >= 18) {
            System.out.printf("Pode entrar");
        } else {
            System.out.printf("Vaza truta");
        }
    }

    public void verificarIdadeCase(String time) {

        switch (time) {
            case "Corinthians":
            case "Palmeiras":
            case "São Paulo":
            case "Santos":
            case "Portuguesa":
                System.out.println("Você é: " + time);
                break;
            default:
                System.out.println("Não torce para time nenhum");
                break;
        }

        if(time.equalsIgnoreCase("Corinthias") ||
                time.equalsIgnoreCase("Palmeiras") ||
                time.equalsIgnoreCase("São Paulo") ||
                time.equalsIgnoreCase("Santos")){

            System.out.println("Você é: " + time);
        }
    }
}
