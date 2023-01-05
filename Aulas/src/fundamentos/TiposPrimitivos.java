package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //tipos numéricos inteiros:
        byte anosDeEmpresa = 23;
        short numeroDEVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_123_845_223L;

        //tipos numéricos reais:
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //tipo booleano:
        boolean estaDeFerias = false; //true

        //Tipo Caractere
        char status = 'A'; //Ativo

        //EXERCICIOS
        //Dias de empresa:
        System.out.println(anosDeEmpresa * 365);

        // Numero de viagens
        System.out.println(numeroDEVoos / 2);

        // Pontos por Real:
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Ferias? " + estaDeFerias);
        System.out.println("Status: " + status);





    }
}
