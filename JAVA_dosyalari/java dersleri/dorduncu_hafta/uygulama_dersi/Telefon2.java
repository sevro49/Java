package dorduncu_hafta.uygulama_dersi;

public class Telefon2 {

    String marka;
    String model;
    int ram;
    int hafiza;
    double kamera;
    String s; //default değeri null
    int a; //default değeri 0
    
    public Telefon2(String ma, String mo, int ra, int haf, double kam){ //constructor
        System.out.println("Constructor ile oluşturuldu");
        this.marka = ma;
        this.model = mo;
        this.ram = ra;
        this.hafiza = haf;
        this.kamera = kam; /** constructor içinde verilen parametre ile class
        içinde verilen parametre aynı ise "this." koymak zorundayız. ikisi farklı
        ise sorun yok */
    }

    public void bilgileriGoster(){
        System.out.println("****************");
        System.out.println("Marka: " + this.marka);
        System.out.println("Model: " + this.model);
        System.out.println("Ram: " + this.ram + " GB");
        System.out.println("Hafıza: " + this.hafiza + " GB");
        System.out.println("Kamera: " + this.kamera + " mp");
    }

    public static void main(String[] args) {
       
        Telefon2 tel1 = new Telefon2("Samsung","A71",8,256,48);
        Telefon2 tel2 = new Telefon2("Iphone","13",8,128,48);
        Telefon2 tel3 = new Telefon2("Xiaomi","Redmi note 10",8,256,999);

        
        tel1.bilgileriGoster();
        tel2.bilgileriGoster();
        tel3.bilgileriGoster();
        
    }
}
