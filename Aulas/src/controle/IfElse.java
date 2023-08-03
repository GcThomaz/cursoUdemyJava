package controle;

import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {
        
        String valor = JOptionPane.showInputDialog("Informe o numero: ");
        Integer numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.println("O numero é par!");
        }
        if (numero % 2 == 1) {
            System.out.println("O numero é impar!");
        }

        //UTILIZANDO IF/ELSE

        if (numero % 2 == 0) {
            System.out.println("O numero é par!");
        } else {
            System.out.println("O numero é impar!");
        }
    }
}
