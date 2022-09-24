package dorduncu_hafta.uygulama_dersi;

public class Telefon {
    
    String marka;
    String model;
    int ram;
    int hafiza;
    double kamera;

    public void bilgiGoster(){
        System.out.println("****************");
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Ram: " + ram + " GB");
        System.out.println("Hafıza: " + hafiza + " GB");
        System.out.println("Kamera: " + kamera + " mp");
    }
    public static void main(String[] args) {
        Telefon tel1 = new Telefon();
        Telefon tel2 = new Telefon();
        Telefon tel3 = new Telefon();

        tel1.marka = "Samsung";
        tel1.model = "A71";
        tel1.ram = 8;
        tel1.hafiza = 256;
        tel1.kamera = 48;

        tel1.bilgiGoster();

        tel2.marka = "Iphone";
        tel2.model = "13";
        tel2.ram = 8;
        tel2.hafiza = 128;
        tel2.kamera = 48;

        tel2.bilgiGoster();

        tel3.marka = "Xiaomi";
        tel3.model = "Redmi note 10";
        tel3.ram = 16;
        tel3.hafiza = 128;
        tel3.kamera = 9999;

        tel3.bilgiGoster();
        
    }
}
