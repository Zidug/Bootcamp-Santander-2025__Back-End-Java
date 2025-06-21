import java.util.Scanner;

public class Exercicio03 {

    //Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela
    //Fórmula: áreal = base X altura
    public static void main (String[] args){

        var scanner = new Scanner(System.in);

        System.out.println("~ Calculo de área do retangulo ~");
        System.out.println("Informe a base do seu retângulo:");
        var base = scanner.nextFloat();
        System.out.println("Informe a altura do retângulo:");
        var altura = scanner.nextFloat();
        var area = base * altura;
        System.out.printf("A área do seu retângulo é %s\n", area);

    }

}
