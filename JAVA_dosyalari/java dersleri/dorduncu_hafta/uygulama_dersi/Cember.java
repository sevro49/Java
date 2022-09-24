package dorduncu_hafta.uygulama_dersi;

public class Cember {

    public double yaricap;
    public String renk;

    public Cember(double y, String r) {
        this.yaricap = y;
        this.renk = r;
    }

    public void CevreHesapla() {
        double cevre = 2 * Math.PI * this.yaricap;
        System.out.println("Çember çevresi: " + cevre);
    }

    public void AlanHesapla() {
        double alan = Math.PI * Math.pow(this.yaricap, 2);
        System.out.println("Çember alanı: " + alan);
    }

    public void bilgileriGoster() {
        this.AlanHesapla(); // başka bir fonksiyondan bahsederken "this." koymayı unutma
        this.CevreHesapla();
        System.out.println("Çember rengi: " + this.renk);
    }

    public static void main(String[] args) {
        Cember c1 = new Cember(5, "Kırmızı");
        c1.bilgileriGoster();
        Cember c2 = new Cember(10, "Mavi");
        c2.bilgileriGoster();
    }

}
