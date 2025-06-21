import java.util.Scanner;

public class Aula04 {

    public static void main (String[] args){
        var scanner = new Scanner(System.in);
        String name = "";

        while (!name.equalsIgnoreCase("exit")){
            System.out.println("Informe um nome:");
            name = scanner.next();
        }

    }

}
