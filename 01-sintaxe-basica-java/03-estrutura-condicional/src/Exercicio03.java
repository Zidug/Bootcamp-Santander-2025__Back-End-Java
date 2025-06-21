import java.util.Scanner;

public class Exercicio03 {
    /*
        Escreva um código que o usuário entre com um primeiro número, um segundo número e escolhe entre a opção par e impar,
        com isso o código deve informar todos os númeors pares ou impares (de acodo com a seleção inicial) no intervalo de númeors
        informados, incluindo os numeros informados em ordem decrescente
     */

    public static void main (String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.println("Contagem de Impares ou Contagem de Pares");
        System.out.println("=====================================================");

        System.out.print("Informe o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Informe o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Escolha: ");
        System.out.println("[1] Par      [2] Impar ");
        int escolha = scanner.nextInt();



        switch (escolha) {
            case 1 :
                if (num1 > num2) {
                    System.out.println("=====================================================");
                    System.out.println("Iniciando contagem decrescente de pares");
                    System.out.println("=====================================================");
                    for (var i = num1; i >= num2; i--) {
                        if (i % 2 == 0) System.out.println(i);
                    }
                } else {
                    System.out.println("=====================================================");
                    System.out.println("Iniciando contagem crescente de pares");
                    System.out.println("=====================================================");
                    for (var i = num1; i <= num2; i++)
                        if (i % 2 == 0) System.out.println(i);
                }
                break;

            case 2 :
                if (num1 > num2) {
                    System.out.println("=====================================================");
                    System.out.println("Iniciando contagem decresente de impares");
                    System.out.println("=====================================================");
                    for (var i = num1; i >= num2; i--) {
                        if (i % 2 != 0) System.out.println(i);
                    }
                } else {
                    System.out.println("=====================================================");
                    System.out.println("Iniciando contagem crescente de impares");
                    System.out.println("=====================================================");
                    for (var i = num1; i <= num2; i++)
                        if (i % 2 != 0) System.out.println(i);
                }
                break;

            default:
                System.out.println("Erro");
                break;

        }

        System.out.println("=====================================================");

    }
}
