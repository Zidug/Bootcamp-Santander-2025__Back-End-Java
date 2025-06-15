package FundamentosJava;

import java.util.Scanner;

public class Exercicio04 {

    //Escreva um mcódigo que receba o nome e a idade de duas pessoas, imprima a diferença de idade entre elas
    public static void main (String[] args){

        var scanner = new Scanner(System.in);

        System.out.println("Informe os dados da primeira pessoa.");
        System.out.print("Nome:");
        var name1 = scanner.next();
        System.out.print("Idade:");
        var age1 = scanner.nextInt();

        System.out.println("====================================================================================");

        System.out.println("Informe os dados da segunda pessoa.");
        System.out.print("Nome:");
        var name2 = scanner.next();
        System.out.print("Idade:");
        var age2 = scanner.nextInt();

        var range = age1 - age2;

        System.out.printf("\nA diferença de idade entre %s e %s é de %s ano(s)\n", name1, name2, range);
    }
}
