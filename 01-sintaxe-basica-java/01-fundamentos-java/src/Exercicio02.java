import java.util.Scanner;

public class Exercicio02 {

    //Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
    //Fórmula: área = lado X lado
    public static void main (String[] args){

        var scanner = new Scanner(System.in);

        System.out.println("~ Calculo de área do quadrado ~");
        System.out.println("Informe o tamanho de um lado:");
        var lado = scanner.nextFloat();
        var area = lado * lado;
        System.out.printf("A área do seu quadrado é %s\n", area);

    }

}
