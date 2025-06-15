import java.util.Scanner;

public class ContaTerminal {

    public static void main (String[] args){

        //TODO: Conhecer e importar a classe Scanner.
        Scanner scanner = new Scanner(System.in);

        //TODO: Exibir as mensagens para nosso usuário.
        System.out.println("Olá, para continuarmos precisamos de algumas informações.");

        //TODO: Obter pelo scanner os valores digitados no terminal.
        System.out.print("Conta: ");
        int conta = scanner.nextInt();
        System.out.print("Agência: ");
        String agencia = scanner.next();
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Saldo: ");
        float saldo = scanner.nextFloat();

        //TODO: Exibir a mensagem de conta criada.
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f ja está disponivel.\n", nome, agencia, conta, saldo);
    }

}
