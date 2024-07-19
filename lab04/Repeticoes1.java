package lab04;

public class Repeticoes1 {
    // java lab04/Repeticoes1.java
    public static void main(String[] args) {
        /**
         * while: Executa um bloco de código enquanto uma condição específica for
         * verdadeira.
         */
        int contador = 0;
        var sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        while (contador < 10) {
            System.out.println(num + "x" + contador);
            System.out.println(num * contador);
            contador += 1;
        }
    }
}
