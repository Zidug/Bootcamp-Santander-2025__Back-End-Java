package EstruturaCondicional;

import java.util.Scanner;

public class Aula02 {
    //switch case

    public static void main (String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Informe um numero de 1 a 7");
        var option = scanner.nextInt();

        /* Metodo convencional
        switch (option){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção invalida.");
                break;
         */

        /* arrow function
        switch (option){
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-Feira");
            case 3 -> System.out.println("Terça-Feira");
            case 4 -> System.out.println("Quarta-Feira");
            case 5 -> System.out.println("Quinta-Feira");
            case 6 -> System.out.println("Sexta-Feira");
            case 7 -> System.out.println("Sabado");
            default -> System.out.println("Opção invalida");
        }
         */

        //Arrow function com retorno.
        var message = switch (option){
            case 1, 7 -> { //Juntando mais de um caso e fazendo mais de uma linha de codigo no case
                var day = option ==1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, bom fim de semana.\n", day);// só funciona apartir do Java 14
            }
            case 2 -> "Segunda-Feira";
            case 3 -> "Terça-Feira";
            case 4 -> "Quarta-Feira";
            case 5 -> "Quinta-Feira";
            case 6 -> "Sexta-Feira";
            default -> "Opção inválida";
        };

        System.out.println(message);
    }
}
