public class Mainkapal {
    public static void main(String[] args) {
        Kapalpesiar kps = new Kapalpesiar();
        Kapalselam ksl = new Kapalselam();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Karakteristik Kapal");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Kapal Pesiar");
        kps.Caraberjalan();
        kps.Tampilmerk();
        kps.Tampilwarna();
        System.out.println();
        System.out.println("Kapal Selam");
        ksl.Caraberjalan();
        ksl.Tampilmerk();
        ksl.Tampilwarna();
    }
}
