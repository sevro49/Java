package yedinci_hafta.uygulama_dersi;

public class Ogrenci extends Insan {
    public Ogrenci(int t, String a) {
        
        super(t, a);
    }

    @Override
    public String calis() {
        
        //return super.calis();
        return " ders çalışır.";
    }

    @Override
    public String konus() {
        
        //return super.konus();
        return " dersle ilgili konuşur.";
    }

    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci(12345, "Emre");
        System.out.println(ogrenci.calis());
    }
}
