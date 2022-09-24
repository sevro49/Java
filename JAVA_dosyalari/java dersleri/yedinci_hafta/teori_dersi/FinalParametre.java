package yedinci_hafta.teori_dersi;

public class FinalParametre {

    public static int topla(final int a, final int b) {

        return a + b;
    }

    public static void main(String[] args) {
        if ((args.length != 2)) {
            System.out.println("Eksik veri girildi.");
            System.exit(-1); // mainden çıkmak için exit verdik.
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sonuc = FinalParametre.topla(a, b);
        System.out.println("Sonuc = " + sonuc);
    }

}
