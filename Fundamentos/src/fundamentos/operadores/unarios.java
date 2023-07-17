package fundamentos.operadores;

public class unarios {
    public static void main(String[] args) {
        
        int a = 1;
        int b = 2;

        a++;// a = a + 1; Variavel a vai receber o valor de a + 1.
        a--;// a = a - 1; Variavel a vai receber o valor de a - 1.

        ++b;// b = b + 1;
        --b;// b = b - 1;

        System.out.println(a);
        System.out.println(b);

        //System.out.println(a++ == b--);
        System.out.println(++a == b--); /*Java considera a ordem para fazer a comparacao. 
        Primeiro ele soma 1 na variavel a (++a) e depois ele compara a variavel a com a 
        variavel b (b) e pra finalizar ele subtrai 1 da variavel b (--b). Por isso que quando
        roda essa comparacao o resultado é TRUE, porque ao adicionar 1 a variavel a ela armazena
        o valor 2, depois disso compara com a variavel b que tambem armazena o valor 2. */
        System.out.println(a == b);


    }
}
