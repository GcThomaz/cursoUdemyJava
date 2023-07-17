package fundamentos;

public class DesafioTemperatura {
    public static void main(String[] args) {
        //(f-"32")*5/9 = c
        double farenheit = 64;
        final double celsius = (farenheit - 32) * 5/9;

        System.out.println("A temperatura em celsius é: " + celsius + ".");

    }
}
