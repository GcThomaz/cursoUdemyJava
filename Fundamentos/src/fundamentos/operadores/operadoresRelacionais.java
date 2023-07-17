package fundamentos.operadores;

public class operadoresRelacionais {
    public static void main(String[] args) {


        System.out.println(2 == 3);
        System.out.println(2 > 3);
        System.out.println(2 >= 3);
        System.out.println(2 < 3);
        System.out.println(2 <= 3);
        System.out.println(2 != 3);

        //EXEMPLO

        double nota = 7.3;
        boolean bomAluno = true;
        boolean temMedia = nota >= 7;
        boolean jeitinhoBrasileiro = bomAluno && temMedia;

        System.out.println("O aluno tem desconto? " + jeitinhoBrasileiro);

    }
}
