package ucuncu_hafta.uygulama_dersi;

public class ornek4 {
    /**
     * Javada while döngüsü kullanarak sayıyı ters çevirme
     * 
     * @param args
     */
    public static void main(String[] args) {

        int sayi = 1234, yeniSayi = 0, kalan;

        System.out.println("ilk sayi = " + sayi);

        while (sayi != 0) {
            kalan = sayi % 10;
            yeniSayi = yeniSayi * 10 + kalan;
            sayi /= 10;
        }

        System.out.println("Son hali = " + yeniSayi);
    }
}
