package ucuncu_hafta.uygulama_dersi;

import java.util.Scanner;

public class hesapMakinesi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*******************\n");
        String islemler = "1. Toplama işlemi\n"
                + "2. Çıkarma işlemi\n"
                + "3. Çarpma işlemi\n"
                + "4. Bölme işlemi\n";
        System.out.println(islemler);
        System.out.println("*******************");

        System.out.println("Yapmak istediğiniz işlemi seçin: ");
        String islem = scanner.next();

        int a;
        int b;

        switch (islem) {
            case "1":
                System.out.println("Birinci sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen değerlerin toplamı: " + (a + b));
                break;

            case "2":
                System.out.println("Birinci sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen değerlerin farkı: " + (a - b));
                break;
            case "3":
                System.out.println("Birinci sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen değerlerin çarpımı: " + (a * b));
                break;
            case "4":
                System.out.println("Birinci sayı: ");
                a = scanner.nextInt();
                System.out.println("İkinci sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen değerlerin oranı: " + (a / b));
                break;

            default:
                System.out.println("Geçersiz işlem");
        }
        scanner.close();

    }//main

}
