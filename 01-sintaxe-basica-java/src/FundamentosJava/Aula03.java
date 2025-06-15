package FundamentosJava;

import java.util.Scanner;

public class Aula03 {

    /*
        Operadores de atribuição e logicos
        =    atribui valor
        ==   Compara se o valor é o mesmo
        !=   Compara se o valor é diferente
        >    Compara se  valor é maior
        >=   Comapra se o valor é maior ou igual
        <    Compara se o valor é menor
        <=   Compara se o valor é menor ou igual
        ||   Conpara dois valores podendo um deles ser true
        &&   Compara dois valores mas ambos tem que ser true
    */

    public static void main (String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || (isEmancipated && age >= 16);

        System.out.printf("Você pode dirigir? (%s) \n", canDrive);
    }
}
