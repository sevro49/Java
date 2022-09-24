package altinci_hafta.teori_dersi;

public class Kedi {

    //boş bırakınca da aynı paket içinden erişilebilir
    protected int ayakSayisi = 4; // protected, bu sınıf içinden ve bu sınıftan extends ile türetilen sınıflardan
                                  // erişilebilir

    public void yakalaAv() {
        System.out.println("Kedi sınıfı av yakaladı");
    }

    public static void main(String[] args) {
        Kedi kd = new Kedi();
        kd.yakalaAv();
    }

}
