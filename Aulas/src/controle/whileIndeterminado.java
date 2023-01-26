package controle;

import java.util.Scanner;

public class whileIndeterminado {
    public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);

            String valor = "";

            while (!valor.equalsIgnoreCase("Sair")) {
                System.out.println("Voce diz: ");
                valor = entrada.nextLine();
                
            }
            entrada.close();
    }
}
