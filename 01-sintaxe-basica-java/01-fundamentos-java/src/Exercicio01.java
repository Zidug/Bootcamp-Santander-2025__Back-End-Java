import java.util.Scanner;

public class Exercicio01 {

    //Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
    public static void main (String[] args){

        var scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.printf("Olá %s, você tem %s anos", name, age);

    }
}
