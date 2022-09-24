package ucuncu_hafta.teori_dersi;

class Araba {
    int kapi_sayisi;
    int vites_sayisi;

    public Araba(int adet){//constructor
        kapi_sayisi = adet;
    }

    public Araba(int adet, int sayi){//constructor
        kapi_sayisi = adet;
        vites_sayisi = sayi;
    }
    //constructorlar da birden fazla yazılabilir. (overriding)
}

public class ConstructorGiris2 {

    public static void main(String[] args) {
        //Araba ar = new Araba(); //böyle bir constructor olmadığı için hata verir.
        Araba ar1 = new Araba(2);
        Araba ar2 = new Araba(2,4);
        System.out.println(ar1.kapi_sayisi + " " + ar1.vites_sayisi);
        System.out.println(ar2.kapi_sayisi + " " + ar2.vites_sayisi);

    }
}
