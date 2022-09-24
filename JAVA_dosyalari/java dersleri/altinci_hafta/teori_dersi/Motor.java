package altinci_hafta.teori_dersi;

//önceden oluşturulmuş sınıflardan nesne üretmeye kompozisyon denir.

public class Motor {

    //private static int moto_gucu = 3600;
    public static String marka = "Mustang";
    public static int model = 2022;

    public void calis() {
        System.out.println("Motor çalışıyor.");
    }

    public void dur() {
        System.out.println("Motor durdu.");
    }

    public void bilgileriGoster(){
        System.out.println("Marka: " + marka + "\nModel: " + model);
    }

    public static void main(String[] args) {

    }

}
