package fundamentos.exercicios;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        
        //Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um numero inteiro.");
        double numero = entrada.nextInt();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);

        System.out.printf("O quadrado do numero é %.2f e o cubo é %.2f.", quadrado, cubo);

        entrada.close();


    }
}
