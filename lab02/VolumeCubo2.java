import java.util.Scanner;


public class  VolumeCubo2{

    public static void main(String[] args) {
        System.out.println(" Informe o lado:");
        var sc = new Scanner(System.in);
        var lado = sc.nextInt();
        var volume = Math.pow(lado, 3);

        System.out.println("o volume do cubo é: " + volume);

        sc.close();

    }

}