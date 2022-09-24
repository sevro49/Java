package ucuncu_hafta.uygulama_dersi;

public class ornek8 {
    /**
     * 1'den 100'e kadar olan asal sayıları yazdırma
     * 
     * @param args
     */
    public static void main(String[] args) {
        asal();
    }// main

    public static void asal() {
        int i = 2, j = 1, count;

        while (i <= 100) {
            count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(i + " ");
            }
            i++;
        }
    }
}
