package ucuncu_hafta.uygulama_dersi;

public class ornek6 {
    /**
     * iç içe for döngüsü kullanarak bir çarpım tablosu oluşturun.
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            System.out.println("**********************");
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
    }
}
