package altinci_hafta.uygulama_dersi;

public class Dizi {

    public static void main(String[] args) {
        String[] otomobil = { "Volvo", "BMW", "Ford", "Mazda" };
        
        System.out.println(otomobil[0]);
        System.out.println(otomobil[1]);

        System.out.println("Dizi boyutu: " + otomobil.length);

        otomobil[0] = "Opel";
        otomobil[1] = "Mustang";

        System.out.println(otomobil[0]);
        System.out.println(otomobil[1]);

        System.out.println("******DÖNGÜ******");

        for (int i = 0; i < otomobil.length; i++){
            System.out.println(otomobil[i]);
        }

        System.out.println("*****FOREACH*****");

        for(String i : otomobil){
            System.out.println(i);

        }
        

    }

}
