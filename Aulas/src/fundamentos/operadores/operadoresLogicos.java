package fundamentos.operadores;

public class operadoresLogicos {
    public static void main(String[] args) {
        
        //OPERADORES LOGICOS

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2);//E: todas os parametros precisam ser verdadeiros para o resultado ser verdadeiro;
        System.out.println(condicao1 || condicao2);//OU: pelo menos um dos parametros precisam ser verdadeiros para o resultado ser verdadeiro;
        System.out.println(condicao1 ^ condicao2);//XOU: o resultado vai ser verdadeiro se e somente se um parametro for verdadeiro.
        System.out.println(!condicao1);//O ponto de exclamacao serve para gerar um resultado contrario ao que ia ser gerado originalmente.
        System.out.println(!!condicao2);//Posso usar uma dupla negacao para inverter o resultado duas vezes

        //TABELA VERDADE E (AND)

        System.out.println(true && true);
        System.out.println(true && false);
    //    System.out.println(false && true);
    //    System.out.println(false && false);

        //TABELA VERDADE OU (OR)

    //    System.out.println(true || true);
    //    System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //TABELA VERDADE XOU (XOR)

        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        //TABELA VERDADE NEGACAO (NOT)

        System.out.println(!true);
        System.out.println(!false);

         
    }
}
