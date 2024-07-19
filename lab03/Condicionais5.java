import java.util.Scanner;

public class Condicionais5 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.println("Digite o conceito que vossa senhoria quer converter: ");
        var bixo = sc.next();
        switch (bixo) {
            case "a" -> System.out.println("convertido para: 100");
            case "b" -> System.out.println("convertido para: 90");
            case "c" -> System.out.println("convertido para: 80");
            case "d" -> System.out.println("convertido para: 70");
            case "e" -> System.out.println("convertido para: 60");
            case "f" -> System.out.println("convertido para: 50");
            default -> System.out.println("conceito inválido");

        }
        sc.close();
    }
}