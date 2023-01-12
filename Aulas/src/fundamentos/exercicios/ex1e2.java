package fundamentos.exercicios;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class ex1e2 {
    public static void main(String[] args) {
        
    //Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
    //(f-"32")*5/9 = c

    /*double farenheit = 52;
    double celsius = (farenheit - 32) * 5 / 9;

    System.out.println(celsius);
    */

    //UTILIZANDO final PARA VALORES CONSTANTES

    /*double farenheit = 64;
    final double el1 = 5;
    final double el2 = 9;
    final double el3 = 32;
    double celsius = (farenheit - el3) * el1 / el2;

    System.out.printf("%.2f ", celsius);
    */

    //METODO SCANNER

    /* Scanner entrada = new Scanner(System.in);

    System.out.print("Digite a temperatura em Farenheit: ");
    double f = entrada.nextDouble();

    double c = (f - 32) * 5 / 9;

    System.out.printf("%.2f" + " graus Farenheit é igual a: " + "%.2f" + " graus Celsius.", f, c);

    entrada.close();
    */

    String escolha = JOptionPane.showInputDialog("O que quer converter? (F = Farenheit ou C = Celsius) ");

    String escolha2 = "F".equals(escolha) ? "Farenheit" : "Celsius";


    String temperatura = JOptionPane.showInputDialog("Digite a temperatura em " + escolha2 + ": ");
    Double temperatura2 = Double.parseDouble(temperatura);

    double resultado = "F".equals(escolha) ? (temperatura2 - 32) * 5 / 9 : (temperatura2 * 9 / 5) + 32;

    JOptionPane.showMessageDialog(null, resultado);




    




    }
}
