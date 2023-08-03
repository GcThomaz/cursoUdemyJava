package controle;

public class whileDeterminado {
    public static void main(String[] args) {

        //REPETIR O COMANDO 10 Vezes

        /*System.out.println("Bon Dia!");
        System.out.println("Bon Dia!");
        System.out.println("Bon Dia!");
        System.out.println("Bon Dia!");
        System.out.println("Bon Dia!");
        System.out.println("Bon Dia!");
        System.out.println("Bon Dia!");
        System.out.println("Bon Dia!");
        System.out.println("Bon Dia!");
        System.out.println("Bon Dia!");*/

        //USANDO O WHILE

        int contador = 1;

        while (contador <= 10) {
            System.out.println("Bon Dia!");
            System.out.printf("i = %d\n", contador);
            contador++;
        }
    }
}
