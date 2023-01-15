package controle;

import java.util.Scanner;

public class desafioDiaSemana {
    public static void main(String[] args) {

      /* String domingo = "Domingo";
        String segunda = "Segunda";
        String terca = "Terca";
        String quarta = "Quarta";
        String quinta = "Quinta";
        String sexta = "Sexta";
        String sabado = "Sabado";
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String dia = entrada.next();

        if (domingo.equals(dia)) {
            System.out.println("Dia 01.");            
        }else if (segunda.equals(dia)) {
            System.out.println("Dia 02.");
        }else if (terca.equals(dia)) {
            System.out.println("Dia 03.");
        }else if (quarta.equals(dia)) {
            System.out.println("Dia 04.");
        }else if (quinta.equals(dia)) {
            System.out.println("Dia 05.");
        }else if (sexta.equals(dia)) {
            System.out.println("Dia 06.");
        }else if (sabado.equals(dia)) {
            System.out.println("Dia 07.");
        }
        entrada.close();*/

        //RESPOSTA 01 DO PROFESSOR || ANSWER 01

        /*Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o dia da semana: ");
        String dia = entrada.next();

        if (dia.equalsIgnoreCase("domingo")) {
            System.out.println("01");
        }else if (dia.equalsIgnoreCase("segunda")) {
            System.out.println("02");
        }else if (dia.equalsIgnoreCase("terca")) {
            System.out.println("03");
        }else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println("04");
        }else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println("05");
        }else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println("06");
        }else if (dia.equalsIgnoreCase("sabado") ||
                    dia.equalsIgnoreCase("sàbado")) {
            System.out.println("07");
        }else{
            System.out.println("Dia Invalido.");
        }
        entrada.close();*/

        //RESPOSTA 02 DO PROFESSOR || ANSWER 02

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o dia da semana: ");
        String dia = entrada.next();

        if ("domingo".equalsIgnoreCase(dia)) {
            System.out.println("01");
        }else if ("segunda".equalsIgnoreCase(dia)) {
            System.out.println("02");
        }else if ("terca".equalsIgnoreCase(dia) || 
        "terça".equalsIgnoreCase(dia)) {
            System.out.println("03");
        }else if ("quarta".equalsIgnoreCase(dia)) {
            System.out.println("04");
        }else if ("quinta".equalsIgnoreCase(dia)) {
            System.out.println("05");
        }else if ("sexta".equalsIgnoreCase(dia)) {
            System.out.println("06");
        }else if ("sabado".equalsIgnoreCase(dia) ||
                    "sàbado".equalsIgnoreCase(dia)) {
            System.out.println("07");
        }else{
            System.out.println("Dia Invalido.");
        }
        entrada.close();


    }
}
