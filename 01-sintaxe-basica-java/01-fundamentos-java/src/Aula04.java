import java.util.Scanner;

public class Aula04 {

    /*
        Operadores aritimeticos
        +   Soma
        +=  Soma de forma reduzida
        ++  Incremento
        -   Subtração
        -=  Subtração de forma reduzida
        --  Decremento
        *   Multiplicação
        *=  Multiplicação de forma reduzida
        /   Divisão
        /=  Divisão de forma reduzida
        %   Modulo (sobra da divisão)

    */

    public static void main (String[] args){
        var scanner = new Scanner(System.in);

        //Soma
        System.out.println("Informe o primeiro número: ");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        var value2 = scanner.nextInt();
        //System.out.println(value1 + " + " + value2 + " = " + (value1 + value2)); //Colocar o resultado entre parenteses faz com que seja tratado como uma soma, caso não fosse usado o parenteses, ele trataria como string e ficaria os dois valores ao invés da soma deles
        System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2);

        System.out.println("========================================================================================");

        //Subtração
        System.out.println("Informe o primeiro número: ");
        var value3 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        var value4 = scanner.nextInt();
        System.out.printf("%s - %s = %s\n", value3, value4, value3 - value4);

        System.out.println("========================================================================================");

        //Multiplicação
        System.out.println("Informe o primeiro número: ");
        var value5 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        var value6 = scanner.nextInt();
        System.out.printf("%s * %s = %s\n", value5, value6, value5 * value6);

        System.out.println("========================================================================================");

        //Divisão
        System.out.println("Informe o primeiro número: ");
        var value7 = scanner.nextFloat();
        System.out.println("Informe o segundo número: ");
        var value8 = scanner.nextFloat();
        System.out.printf("%s / %s = %s\n", value7, value8, value7 / value8);

        System.out.println("========================================================================================");

        //Modulo
        System.out.println("Informe o primeiro número: ");
        var value9 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        var value10 = scanner.nextInt();
        System.out.printf("%s %% %s = %s\n", value9, value10, value9 % value10);

        System.out.println("========================================================================================");
        System.out.println("========================================================================================");

        //Soma Simplificada
        var value11 = 5;
        value11 += 12;
        //value11 = value11 + 12; //Forma completa da expressão acima
        System.out.println(value11);

        System.out.println("========================================================================================");

        //Subtração simplificada
        var value12 = 20;
        value11 -= 10;
        //value12 = value12 - 10; //Forma completa da expressão acima
        System.out.println(value12);

        System.out.println("========================================================================================");

        //Multiplicação simplificada
        var value13 = 5;
        value13 *= 5;
        //value13 = value13 + 5; //Forma completa da expressão acima
        System.out.println(value13);

        System.out.println("========================================================================================");

        //Divisão simplificada
        var value14 = 30;
        value14 /= 4;
        //value14 = value14 / 4; //Forma completa da expressão acima
        System.out.println(value14);

        System.out.println("========================================================================================");
        System.out.println("========================================================================================");
        //Metodos complementares

        //Raiz Quadrada
        System.out.println("Informe o número: ");
        var value15 = scanner.nextInt();
        System.out.printf("A raiz quadrada de %s é %s\n", value15, Math.sqrt(value15) );

        System.out.println("========================================================================================");

        //Potência
        System.out.println("Informe um número: ");
        var value16 = scanner.nextInt();
        System.out.println("Informe a potência: ");
        var value17 = scanner.nextInt();
        System.out.printf("A raiz potência de %s é %s\n", value16, Math.pow(value16,value17) );

        System.out.println("========================================================================================");



    }

}
