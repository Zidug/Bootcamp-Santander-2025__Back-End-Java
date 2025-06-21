public class Aula03 {

    public static void main (String[] args){

        /* Loop infinito com comando de parada
        var scanner = new Scanner(System.in);

        for (;;){
            System.out.println("Digite um nome");
            String name = scanner.next();

            if (name.equalsIgnoreCase("exit")){
                System.out.println("Fim da execução");
                break;
            };
        }
         */

        /* Contador de 1 a 100 mostrando apenas os pares
        for (int i = 1; i <= 100; i++){
            if (i % 2 != 0) continue;
            System.out.println(i);
        }
         */

        //Passando os itens de um vetor
        String [] frutas = {"Banana", "Uva", "Maça", "Pera", "Jaca", "Melão", "Melancia"};
        for (var i = 0; i < frutas.length; i++){
            System.out.println(frutas[i]);
        }





    }
}
