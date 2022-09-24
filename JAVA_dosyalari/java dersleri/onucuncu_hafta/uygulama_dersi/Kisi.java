package onucuncu_hafta.uygulama_dersi;

public class Kisi {

    private String ad;
    private String soyad;
    private int yas;

    // Encapsulation
    /** private olduğu için bu variablelara ulaşmak için getter ve setter kullanıyoruz */
    public void setAd(String a) {
        this.ad = a;
    }

    // String dönüş tipinde bir method
    public String getAd() {
        return ad;
    }

    public void setSoyad(String s) {
        this.soyad = s;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setYas(int y) {
        this.yas = y;
    }

    public int getYas() {
        return yas;
    }


}

class KisiMain{

    public static void main(String[] args) {
        Kisi k = new Kisi();
        k.setAd("Emre");
        System.out.println(k.getAd());
    }
}