package ucuncu_hafta.uygulama_dersi;

import java.util.Scanner;

public class ornek3 {
    /**
     * 1'den girilen sayıya kadar olan sayıları toplayın
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sum = 0;
        int a = scan.nextInt();

        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println("Girdiğiniz sayıya kadar olan sayıların toplamı = " + sum);

        scan.close();
    }
}
