package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);

        entrada.close();

    }
}
