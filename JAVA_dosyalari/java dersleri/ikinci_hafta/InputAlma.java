package ikinci_hafta;

import java.util.Scanner;

public class InputAlma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir a ve b değeri giriniz: ");
        int a,b;
        //a = Integer.valueOf(scan.next()); //typecasting (tür dönüşümü)
        a = scan.nextInt();
        b = scan.nextInt();
        
        
        
        System.out.println("yapmak istediğiniz islem (to, ci, ca, bo): ");
        String islem = scan.next();
        
        if(islem.equals("to")){ // == kullanamadım. equals kullandım onun yerine.
            System.out.println("a + b = " + (a + b));
        }
        else if(islem.equals("ci")){
            System.out.println("a - b = " + (a - b));
        }
        else if(islem.equals("ca")){
            System.out.println("a * b = " + (a * b));
        }
        else if(islem.equals("bo")){
            System.out.println("a / b = " + (a / b));
        }
        else{
            System.out.println("Yanlış değer girdiniz!!!");
        }

        

        
        
        






        scan.close(); // yaparak scanner kapatabiliriz
    }
}
