package poo.intellij.cachorro;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        //
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();


        while (true) {

            if (idade > 0) {
                if (idade >= 18 && idade <= 70){
                    System.out.println("Pode entrar safado!");
                    break;
                }else{
                    System.out.println("Entrada somente para maiores de 18 anos e no máximo 70 anos!");
                    System.out.println("Digite sua idade: ");
                    idade = entrada.nextInt();
                }
            }else{
                System.out.println("Idade errada, favor informar idade certa!");
                idade = entrada.nextInt();
            }
        }
    }
}
