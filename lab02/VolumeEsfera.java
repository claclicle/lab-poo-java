public class  VolumeEsfera{

    public static void main(String[] args) {
        var r = Float.parseFloat(args[0]);
        var volume = Math.PI * Math.pow(r, 3) * 4 / 3;
        System.out.println("O volume da esfera é: " + volume);

    }

}