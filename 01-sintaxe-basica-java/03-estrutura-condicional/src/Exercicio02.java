import java.util.Scanner;

public class Exercicio02 {
    /*
        2.Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC e seja exibida a mensagem de aconrdo com o resultado:

            - IMC = peso/(altura * altura)
            - Se for menos ou igual a 18,5 "Abaixo do peso"
            - Se for entre 18,6 e 24,9 "Peso ideal"
            - Se for entre 25,0 e 29,9 "Levemente acima do peso"
            - Se for entre 30,0 e 34,9 "Obesidade Grau I"
            - Se for entre 35,0 e 39,9 "Obesidade Grau II"
            Se for mair ou igual 40,0 "Obesidade Grau III (Morbida)"

     */

    public static void main (String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.println("Cálculo de IMC");
        System.out.println("=====================================================");

        System.out.print("Digite sua altura: ");
        float altura = scanner.nextFloat();
        System.out.print("Digite seu peso: ");
        float peso = scanner.nextFloat();

        float result = peso/(altura*altura);

        if (result <= 18.5){
            System.out.printf("IMC = %s. Abaixo do peso\n", result);
        } else if (result <= 24.9) {
            System.out.printf("IMC = %s. Peso ideal\n", result);
        } else if (result <= 29.9) {
            System.out.printf("IMC = %s. Levemente acima do peso\n", result);
        } else if (result <= 34.9) {
            System.out.printf("IMC = %s. Obesidade Grau I\n", result);
        } else if (result <= 39.9) {
            System.out.printf("IMC = %s. Obesidade Grau II\n", result);
        } else {
            System.out.printf("IMC = %s. Obesidade Grau III (Morbida)\n", result);
        }

        System.out.println("=====================================================");

    }



}
