package besinci_hafta.uygulama_dersi;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kenar değeri giriniz: ");
        int line = scan.nextInt();

        int cube = Islem.cube(line); // başka bir classtan fonksiyon çağırma. Aynı classtan cağırmadan bir farkı
                                     // yoktur.
        System.out.println(cube);

        scan.close();
    }

}

class Islem {

    static int cube(int x) {
        return x * x * x;
    }

}
