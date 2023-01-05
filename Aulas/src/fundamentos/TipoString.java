package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        
        System.out.println("Ola, pessoal".charAt(2));//.charAt(0) mostra qual o caractere esta na posiçao zero da string.
    
        String s = "Boa Tarde";
        System.out.println(s);
        System.out.println(s.concat("!!!"));//.concat() concatena alguma informacao no resultado final.
        System.out.println(s.startsWith("Boa"));//.startsWith () [tipo booleano] Compara se a primeira palavra da string é igual a informaçao que voce colocou.
        System.out.println(s.toLowerCase());//transforma os caracteres em minusculos.
        System.out.println(s.length());//mostra quantos caracteres tem a string.
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Gustavo";
        var sobrenome = "Thomaz";
        var idade = 23;
        var salario = 00.0;
        System.out.printf("O senhor: %s %s tem %d anos e ganha %.2f dinheiros.", nome, sobrenome, idade, salario);
        //%s variavel string, %d inteiros, %f reais, %.2f coloca so duas casas decimais depois da virgula.

        String frase = String.format("\nO senhor: %s %s tem %d anos e ganha %.2f dinheiros.", nome, sobrenome, idade, salario);
        System.out.println(frase);

    
    
    
    
    
    }
}
