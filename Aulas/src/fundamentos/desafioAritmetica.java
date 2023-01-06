package fundamentos;

public class desafioAritmetica {
    public static void main(String[] args) {
        int a = 3 * 4 - 10;
        int b = (int) Math.pow(a, 3);//é necessario fazer um cast, porque a funcao Math.pow() retorna um valor double.
        System.out.println(b);


        //DESAFIO 

       /* int numerador1 = 6 * (3 + 2);
        double num1 = Math.pow(numerador1, 2);
        double res1 = num1 / (3 * 2);
        System.out.println(res1);

        int numerador2 = (1 - 5) * (2 - 7) / 2;
        double res2 = Math.pow(numerador2, 2);
        System.out.println(res2);

        double sub = res1 - res2;
        System.out.println(sub);

        double numerador = Math.pow(sub, 3);
        System.out.println(numerador);

        double denominador = Math.pow(10, 3);
        System.out.println(denominador);
        
        double resultado = numerador / denominador;
        System.out.println(resultado);
        */

        //RESOLUÇAO COM INT

        int numerador1 = 6 * (3 + 2);
        int num1 = (int) Math.pow(numerador1, 2);
        int res1 = num1 / (3 * 2);
        System.out.println(res1);

        int numerador2 = (1 - 5) * (2 - 7) / 2;
        int res2 = (int) Math.pow(numerador2, 2);
        System.out.println(res2);

        int sub = res1 - res2;
        System.out.println(sub);

        int numerador = (int) Math.pow(sub, 3);
        System.out.println(numerador);

        int denominador = (int) Math.pow(10, 3);
        System.out.println(denominador);
        
        int resultado = numerador / denominador;
        System.out.println(resultado);
        

    }
}
