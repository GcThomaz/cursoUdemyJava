package fundamentos;

import java.util.Scanner;


public class desafioConversao {
    public static void main(String[] args) {
        //CRIAR UM SCANNER (MECANISMO DE ENTRADA)
        //3 STRINGS USANDO NEXTLINE
        //AS STRINGS VAO RECEBER OS ULTIMOS 3 SALARIOS DE UM FUNCIONARIO
        //O USUARIO PODE FAZER FUNCIONAR UTILIZANDO PONTO OU VIRGULA (3.2 ; 3,2)
        

        /*EXEMPLO
        Scanner salario1 = new Scanner(System.in);
        String sal1 = salario1.next();
        System.out.println(sal1);



        //String salario1 = JOptionPane.showInputDialog("Informe seu ultimo salario: ");
        //String salario2 = JOptionPane.showInputDialog("Informe o seu penultimo salario: ");
        //String salario3 = JOptionPane.showInputDialog("Informe o seu antepenultimo salario");

        //System.out.println("O ultimo salario foi de: " + salario1);
        //System.out.println("O penultimo salario foi de: " + salario2);
        //System.out.println("O antepenultimo salario foi de: " + salario3);
        */


        //RESOLUÇAO

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro salario: ");
        String valor1 = entrada.next().replace(",", ".");

        System.out.println("Informe o segundo salario: ");
        String valor2 = entrada.next().replace(",", ".");

        System.out.println("Informe o terceiro salario: ");
        String valor3 = entrada.next().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("A media dos salarios foi de: " + media + ".");

        entrada.close();

    }
}
