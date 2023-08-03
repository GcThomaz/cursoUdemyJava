package fundamentos.exercicios;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        
        //Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a altura do triangulo: ");
        double a = entrada.nextDouble();

        System.out.println("Digite a base do trinagulo");
        double b = entrada.nextDouble();

        double area = a * b / 2;

        System.out.printf("A area do triangulo é de: %.2f.", area);
        entrada.close();
    }
}
