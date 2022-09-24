package ucuncu_hafta.teori_dersi;

public class Yumurta {

    int yumurtaSayisi = 0;

    Yumurta sepeteKoy(){
        yumurtaSayisi++;
        return this;
    }

    void goster(){
        System.out.println("Toplam yumurta sayısı: " + yumurtaSayisi);
    }

    public static void main(String[] args) {
        Yumurta y = new Yumurta();
        y.sepeteKoy();
        y.goster();
        y.sepeteKoy().sepeteKoy().sepeteKoy().goster(); //methotları art arda kullanabiliyoruz.
        
    }
    
}
