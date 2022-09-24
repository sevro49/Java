package altinci_hafta.uygulama_dersi;

public class Dizi3 {

    public static void main(String[] args) {
        
        int[] sayilar = {1,-2,323,-4,35,-76,71,8,19,10};
        int toplam = 0;
        double ort = 0;

        for(int i : sayilar){
            toplam += i;
        }

        ort = (double)toplam / (double)sayilar.length;

        System.out.println("Toplam = " + toplam);
        System.out.println("Ortalama = " + ort);



    }//main
}
