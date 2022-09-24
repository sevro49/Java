package altinci_hafta.uygulama_dersi;

import java.util.Scanner;

public class Dizi2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String arr[] = new String[3];

        System.out.println("Dizi elemanlarını giriniz: ");

        for (int i = 0; i<arr.length; i++){
            arr[i] = scan.nextLine();
        }

        System.out.println("***foreach***");
        for (String string : arr) {
            System.out.println(string);
        }

        scan.close();


    }//main
    
}
