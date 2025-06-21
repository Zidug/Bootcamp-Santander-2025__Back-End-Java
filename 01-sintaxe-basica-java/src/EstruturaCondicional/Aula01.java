package EstruturaCondicional;

import java.util.Scanner;

public class Aula01 {

    public static void main (String[] args){
        var scanner = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        var name = scanner.next();
        System.out.print("Informe sua idade: ");
        var age = scanner.nextInt();

        boolean isEmancipated = false;

        if (age < 18){
        System.out.print("Você é emancipado? (s/n) ");
        isEmancipated = scanner.next().equalsIgnoreCase("s");
        }

        /* Possibilidade tradicional
        if (age >= 18){
            System.out.printf("%s, você tem %s anos e pode dirigir.\n", name, age);
        } else if (age >= 16 && isEmancipated) {
            System.out.printf("%s, você tem %s anos e é emancipado. Você pode dirigir.\n", name, age);
        } else {
            System.out.printf("%s, você tem %s anos e não é emancipado. Você não pode dirigir.\n", name, age);
        }
        */

        /* Possibilidade alternativa
        var canDrive = (age >= 18)||(age >= 16 && isEmancipated);

        if (canDrive){
            System.out.printf("%s, você pode dirigir.\n", name);
        } else {
            System.out.printf("%s, você não pode dirigir.\n", name);
        }
         */

        /* Elvis operator||operador ternario - Fucniona apenas com atribuição de variavel
        var message = canDrive ? name + ", você pode dirigir." : name + ", você não pode dirigir";
         */

        //Possibilidade escolhida

        if ((age >= 18)||(age >= 16 && isEmancipated)){
            System.out.printf("%s, você pode dirigir.\n", name);
        } else {
            System.out.printf("%s, você não pode dirigir.\n", name);
        }
    }
}
