package fundamentos;

import javax.swing.JOptionPane;

public class conversaoTiposPrimitivos {
    public static void main(String[] args) {
        
        double a = 1; //Conversao implicita: Java transforma o tipo inteiro 1 em real 1.0. double>int.
        System.out.println(a);

        float b = 1.0F; //Conversao explicita: colocando F depois do numero.
        System.out.println(b);
        float c = (float) 1.0; // Conversao explicita (cast): colocando entre parenteses o tipo aue voce quer converter.
        System.out.println(c);

        int d = 128;
        byte e = (byte) d; /*essa conversao so funciona se o numero convertido estiver dentro da capacidade 
        de processamento e armazenamento da variavel. A variavel byte consegue entre -128 ate 127, ou seja, 
        se voce colocar um numero fora desse parametro o seu resultado vai dar errado. No caso do byte se 
        o numero convertido ultrapassar o limite de armazenamento da variavel ele vai pegar o proximo valor do 
        comeco da sequencia. Exemplo: Se o resultado da conversao for 128 ele vai gerar um resultado de -127.*/
        System.out.println(e);


        double f = 1;
        int g = (int) f; //conversao explicita (CAST)
        System.out.println(g);

        //CONVERSAO DE NUMERO PARA STRING

        Integer num1 = 10000;
        //System.out.println(num1.toString(num1));
        /*Utilizando o wrapper eu consigo atribuir componentes
        aos numeros utilizando a notacao ponto. Nesse exemplo o numero inteiro 10000 foi convertido para
        "10000" so que em forma de string. Agora que o numero virou uma string eu consigo utilizar a
        notacao ponto para atribuir componentes a minha string. Exemplo: .lenght(), vai me gerar a quantidade
        de caracteres da minha string "10000", ou seja, 5 caracteres.*/
        System.out.println(num1.toString().length());

        Integer num2 = 100000;
        System.out.println(Integer.toString(num2));/*Nesse examplo ao inves de transformar o meu resultado
        de tipo inteiro em string, eu transformei a minha variavel wrapper em tipo string */

        //CONVERSAO DE STRING EM NUMERO

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
        System.out.println(valor1 + valor2);/*Nesse exemplo colocamos a funcao JOptionpane para 
        criar uma interacao com o usuario e receber valores de fora do sistema. O resultado dessa
        sentença gera um resultado string. */

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;
        System.out.println("Soma é: " + soma);
        System.out.println("Media é: " + soma/2);
    }
    }
