package fundamentos;

public class aritmeticos {
    public static void main(String[] args) {
        System.out.println(2 + 3);

        var x = 34.56;
        double y = 2.2;

        System.out.println(x + y);//adiçao
        System.out.println(x - y);//subtraçao
        System.out.println(x * y);//multiplicaçao
        System.out.println(x / y);//divisao
        System.out.println(x % y);//modulo

        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);//As operaçoes de numeros inteiros vao gerar como resultado um numero inteiro. 
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println(a / (double) b);//Converte a variavel int em double. Assim o resultado vai aparecer como um numero real.

        
        


    }
}
