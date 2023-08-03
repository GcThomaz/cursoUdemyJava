package controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota Invalida.");

        }else  if (nota >= 8.1) {
            System.out.println("Nota Conceito A");
        }else if (nota >= 6.1) {
            System.out.println("Nota Conceito B");
        }else if (nota >= 4.1) {
            System.out.println("Nota Conceito C");
        }else if (nota >= 2.1) {
            System.out.println("Nota Conceito D");
        }else{
            System.out.println("Nota Conceito E");
        }


        entrada.close();

    }
}
