package onucuncu_hafta.uygulama_dersi;

public class Topla {

    public static void toplama(int a, int b){
        System.out.println(a + b);
    }

    //Overloading
    public static void toplama(double a, double b){
        System.out.println(a + b);
    }

    /**
     * 
     * public int toplama(int a, int b){
        System.out.println(a + b);
        }

        metodun dönüş tipi önemli değil. önemli olan aldığı parametrelerdir.
        aynı parametreleri alan biri void biri int toplam 2 method, "method dublicate" hatası verir.
     */

    public static void main(String[] args) {
        toplama(5, 6);
        toplama(5.0, 6.0);
    }
    
}
