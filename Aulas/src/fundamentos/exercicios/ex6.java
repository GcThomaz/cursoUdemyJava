package fundamentos.exercicios;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        
        //Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor de A:");
        double a = entrada.nextDouble();

        System.out.print("Informe o valor de B:");
        double b = entrada.nextDouble();

        System.out.print("Informe o valor de C:");
        double c = entrada.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        

        System.out.printf("O valor de delta, x1 e x2, respectivamente, é: %.2f %.2f %.2f", delta, x1, x2);

        entrada.close();


    }
}
