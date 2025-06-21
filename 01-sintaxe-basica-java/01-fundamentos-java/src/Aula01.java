public class Aula01 {

    private final static String WELCOME_MESSAGE = "Olá, informe seu nome";

    public static void main (String[] args){
        var scanner = new Scanner(System.in); //essa opção "var" veio apartir do java 11
        System.out.println(WELCOME_MESSAGE);
        var name = scanner.next(); //esse metodo de criar a variavel só funciona pq a tipagemn vem logo em seguida com o "next"
        System.out.println("Informe sua idade");
        var age = scanner.nextInt(); //esse metodo de criar a variavel só funciona pq a tipagemn vem logo em seguida com o "nextInt"
        //System.out.println("Olá " + name + " sua idade é " + age);
        System.out.printf("Olá %s sua idade é %s \n", name, age);

    }

}
