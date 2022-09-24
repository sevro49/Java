package yedinci_hafta.uygulama_dersi;

public class Insan { //super class, ata sınıf, üst sınıf vb.

    public int tc;
    public String ad;
    public String soyad;

    public void bilgileriGoster(){
        System.out.println("T.C no: " + tc +"\nAd: " + ad + "\nSoyad: " + soyad + "\n");
    }
    
    public Insan(int t, String a){
        this.tc = t;
        this.ad = a;
    }

    public String calis(){
        return "çalışmalıdır";
    }

    public String konus(){
        return "iletişim kurmalıdır.";
    }
}
