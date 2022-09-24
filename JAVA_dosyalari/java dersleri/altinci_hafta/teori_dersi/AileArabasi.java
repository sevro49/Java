package altinci_hafta.teori_dersi;

// daha önce var olan Motor sınıfından nesne üretmeye kompozisyon denir.

public class AileArabasi {

    // başka sınıftan bir nesne olduğu için direkt olarak kullanamıyoruz.
    private Motor m = new Motor(); // Motor sınıfına ait private m nesnesi üretildi.

    public void hareketEt() {
        m.calis();
        System.out.println("Aile arabası harekete geçti.");
    }

    public void dur() {
        m.dur();
        System.out.println("Aile arabası durdu.");
    }

    public void bilgileriGoster() {
        m.bilgileriGoster();
    }

    public static void main(String[] args) {
        AileArabasi aa = new AileArabasi();
        aa.hareketEt();
        aa.dur();
        aa.bilgileriGoster();

    }

}
