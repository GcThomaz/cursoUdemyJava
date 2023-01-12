package fundamentos;

public class igualdadeStrings {
    public static void main(String[] args) {

        System.out.println("2" == "2");

        String s = new String("2");
        System.out.println("2" == s);

        System.out.println("2".equals(s));// .equals() vai comparar os conteudos
        
    }
}
