package ucuncu_hafta.uygulama_dersi;

public class ornek2 {

    /**
     * 1'den 50'ye kadar olan sayıları toplayın.
     */
    public static void main(String[] args) {
        
        int num = 50, i = 1, sum = 0;

        while(i <= num){
            sum += i;
            i ++;
        }

        System.out.println("1'den 50'ye kadar olan sayıların toplamı: "+ sum);
        
    }
    
}
