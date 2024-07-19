import java.util.Scanner;

public class Condicionais5 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.println("Digite o numero que vossa senhoria quer converter: ");
        var num = sc.next();
        
        if (num>= 91 && num <=100) {
            System.out.println("a");
        } else if(num>= 81 && <=90) {
            Systemout.println("b");  
        } else if(num>= 71 && <=80) {
            System.out.println("c");
        } else if(num>= 61 && num <=70) {
            System.out.println("d"); 
        } else if(num>= 51 && num <=60) {
            System.out.println("e");
        } else if(num>= 41 && num <=50) {

        }  else {
            System.out.println("não está no catálogo.");
        }

    }

}