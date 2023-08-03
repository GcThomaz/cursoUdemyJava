package controle;

import java.util.Scanner;

public class desafioWhile {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.println("Informe a nota: ");
            nota = entrada.nextDouble();

            if (nota <=10 && nota >=0) {
                total += nota;
            quantidadeDeNotas++;
            }
        }

        double media = nota / quantidadeDeNotas;
        System.out.println("A media é: " + media);
        entrada.close();
    }
}
