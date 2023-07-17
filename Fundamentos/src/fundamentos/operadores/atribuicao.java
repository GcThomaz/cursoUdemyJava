package fundamentos.operadores;

public class atribuicao {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = a + b;

        c += b;//c = c + b;
        c -= a;//c = c - a;
        c *= b;//c = c * b;
        c /= a;//c = c / a;
        c %= 2;//c = c % 2; Resultado = 0 (Par) ou 1 (Impar)

        System.out.println(c);
    }
}
