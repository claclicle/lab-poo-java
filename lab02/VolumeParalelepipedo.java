public class  VolumeParalelepipedo{

    public static void main(String[] args) {
        var a = Float.parseFloat(args[0]);
        var b = Float.parseFloat(args[1]);
        var c = Float.parseFloat(args[2]);

        var volume = (a * b * c);

        System.out.println("a * b * c = " + volume);


    }
}