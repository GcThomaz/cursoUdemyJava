package fundamentos;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class desafioModulo1 {
    public static void main(String[] args) {
        
        //CALCULADORA COM JAVA
        //Usuario digita dois numeros e a operacao que deseja fazer com esses numeros

        /*
        //METODO SCANNER
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = entrada.nextDouble();

        System.out.print("Digite o tipo de operaçao que deseja fazer: (+, -, *, / e %): ");
        String op = entrada.next();

        double resultado = "+".equals(op) ? num1 + num2 : 0;
            resultado = "-".equals(op) ? num1 - num2 : resultado;
            resultado = "*".equals(op) ? num1 * num2 : resultado;
            resultado = "/".equals(op) ? num1 / num2 : resultado;
            resultado = "%".equals(op) ? num1 % num2 : resultado;


        //double resultado = "+".equals(op) ? num1 + num2 : "-".equals(op) ? num1 - num2 : "*".equals(op) ? num1 * num2 : "/".equals(op) ? num1 / num2 : "%".equals(op) ? num1 % num2 : 0;

        System.out.printf("%.2f %s %.2f = %.2f ", num1, op, num2, resultado);

        entrada.close();*/

        //METODO JOptionpane

        String numero1 = JOptionPane.showInputDialog("Informe o primeiro numero: ");
        Double num1 = Double.parseDouble(numero1);

        String numero2 = JOptionPane.showInputDialog("Informe o segundo numero: ");
        Double num2 = Double.parseDouble(numero2);

        String operacao = JOptionPane.showInputDialog("Informe a operaçao: ");
        String op = operacao;

        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;


        JOptionPane.showMessageDialog(null, resultado);

        //System.out.printf("%.2f %s %.2f = %.2f ", num1, op, num2, resultado);


    }
}
