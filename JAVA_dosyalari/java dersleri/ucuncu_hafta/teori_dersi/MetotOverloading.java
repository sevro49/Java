package ucuncu_hafta.teori_dersi;

class MuzikDosyasi {
    String m_tur = "Müzik dosyasi";
}

class ResimDosyasi {
    String r_tur = "Resim Dosyasi";
}

class TextDosyasi {
    String t_tur = "Text Dosyasi";
}

public class MetotOverloading {

    public void dosyaAc(MuzikDosyasi md) {
        System.out.println("Tür: " + md.m_tur);
    }

    public void dosyaAc(ResimDosyasi rd) {
        System.out.println("Tür: " + rd.r_tur);
    }

    public static void dosyaAc(TextDosyasi td) { // TextDosyasi sinifina ait parametre alıyor referans olarak.
        System.out.println("Tür: " + td.t_tur);
    }

    public static void main(String[] args) {
        MetotOverloading mod1 = new MetotOverloading();
        MuzikDosyasi md = new MuzikDosyasi();
        ResimDosyasi rd = new ResimDosyasi();
        TextDosyasi td = new TextDosyasi();

        mod1.dosyaAc(md); // md, MüzikDosyasi türünde bir nesnedir.
        /**
         * dosyaAc() metodu; MuzikDosyasi türünde, md adında bir nesne almış.
         * o zaman bu metodu kullanırken içine gireceğimiz değer de MuzikDosyasi türünde
         * olmalı.
         * Bu yüzden MuzikDosyasi classından bir nesne oluşturup kullanıyoruz.
         * 
         * dosyaAc(int a) ile arasında hiçbir fark yok. Mantık aynı
         */
        mod1.dosyaAc(rd);
        dosyaAc(td); // static olduğu için bulunduğu classtan nesne üretmeye gerek yoktur.
        // mod1.dosyaAc(6545); // 6545, Integer türünde bir nesnedir;

    }// main

}
