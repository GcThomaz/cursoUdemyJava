package fundamentos.exercicios;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        
        //Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o seu peso em kg: ");
        double peso = entrada.nextDouble();

        System.out.println("Informe a sua altura em m: ");
        double altura = entrada.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("O seu imc é igual a: " + imc);
        entrada.close();
    }
}
