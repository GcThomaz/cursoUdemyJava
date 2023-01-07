package fundamentos.operadores;

import java.util.Scanner;

public class desafioLogico {
    public static void main(String[] args) {
        
        //Trabalho na terça (V OU F)
        //Trabalho na quinta (V OU F)

        //DESAFIO TIPOS lOGICOS

        /*Scanner entrada = new Scanner(System.in);
        System.out.println("O trabalho da terça deu certo? (true ou false)");
        //String trabalho1 = entrada.next().replaceAll(trabalho1, "true");
        Boolean trabalho1 = Boolean.parseBoolean(entrada.next());
        System.out.println("O trabalho da quinta deu certo? (true ou false");
        Boolean trabalho2 = Boolean.parseBoolean(entrada.next());        
        entrada.close();
*/

        //RESPOSTA
        
//OPERADORES BINARIOS
        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean tv50 = trabalho1 && trabalho2;
        System.out.println("Vamos comprar a tv de 50\"? " + tv50);
        
        boolean tv32 = trabalho1 ^ trabalho2;
        System.out.println("Vamos comprar a tv de 32\"? " + tv32);

        boolean sorvete = trabalho1 || trabalho2;
        System.out.println("Vamos comprar sorvete? " + sorvete); 

//OPERADOR UNARIO
        boolean saudavel = !sorvete;
        System.out.println("Vamos ficar saudaveis? " + saudavel);



    }
}
