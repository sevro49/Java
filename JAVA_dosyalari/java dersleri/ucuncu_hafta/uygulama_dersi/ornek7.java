package ucuncu_hafta.uygulama_dersi;

import java.util.Scanner;

public class ornek7 {

    /**
     * Kullanıcıdan Vize1, Vize2 ve Final notunu alarak bir harf hesaplama sistemi
     * yapmaya çalışın.
     * Ayrıca kullanıcıdan okuldaki genel ortalamasını alarak,
     * DD alma ve 2.50’nin altında olma koşuluna göre ekrana bir tavsiye mesajı
     * yazdırın.
     * Vize1 toplam notun %30'una etki edecek.
     * Vize2 toplam notun %30'una etki edecek.
     * Final toplam notun %40'ına etki edecek.
     * 
     * Toplam Not >= 90 ----- AA
     * Toplam Not >= 85 ----- BA
     * Toplam Not >= 80 ----- BB
     * 
     * Toplam Not >= 75 ----- CB
     * Toplam Not >= 70 ----- CC
     * Toplam Not >= 65 ----- DC
     * Toplam Not >= 60 ----- DD
     * Toplam Not >= 55 ----- FD
     * Toplam Not < 55 ----- FF
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Sırasıyla Vize1, Vize2 ve Final notlarınızı giriniz: ");

        float vize1 = scan.nextFloat();
        float vize2 = scan.nextFloat();
        float finall = scan.nextFloat();

        float ortalama = vize1 * 0.3f + vize2 * 0.3f + finall * 0.4f;
        System.out.println("Ortalamanız = " + ortalama);

        if (ortalama >= 90) {
            System.out.println("AA");
        } else if (ortalama >= 85) {
            System.out.println("BA");
        } else if (ortalama >= 80) {
            System.out.println("BB");
        } else if (ortalama >= 75) {
            System.out.println("CB");
        } else if (ortalama >= 70) {
            System.out.println("CC");
        } else if (ortalama >= 65) {
            System.out.println("DC");
        } else if (ortalama >= 60) {
            System.out.println("DD");
        } else if (ortalama >= 55) {
            System.out.println("FD");
        } else if (ortalama < 55) {
            System.out.println("FF");
        }

        scan.close();
    }
}
