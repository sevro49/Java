package ucuncu_hafta.uygulama_dersi;

import java.util.Scanner;

/**
 * if...else ifadesini kullanarak bir sayının çift mi yoksa tek mi olduğunu
 * kontrol edelim
 */

public class ornek1 {

    public static void main(String[] args) {

        System.out.println("Lütfen bir sayı giriniz: ");
        Scanner deger = new Scanner(System.in); // deger adında, Scanner sınıfından nesne üretiyoruz.
        int sayi = deger.nextInt();

        if (sayi % 2 == 0) {
            System.out.println(sayi + " cifttir.");
        } else {
            System.out.println(sayi + " tektir.");
        }

        deger.close();
    }
}