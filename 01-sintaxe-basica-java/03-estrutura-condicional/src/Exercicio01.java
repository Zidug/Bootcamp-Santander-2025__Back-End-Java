import java.util.Scanner;

public class Exercicio01 {
    /*
        1.Escreva um código onde o usuário entra com umn número e seja gerada a tabuada de 1 até 10 desse número
     */

    public static void main (String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.print("Tabuada do ");
        var number = scanner.nextInt();
        System.out.println("=====================================================");

        int result = 0;

        for (var i = 1 ; i <= 10 ; i++){
            result = number * i;
            System.out.printf("%s X %s = %s\n", i, number, result);
        }

        System.out.println("=====================================================");

    }

}
