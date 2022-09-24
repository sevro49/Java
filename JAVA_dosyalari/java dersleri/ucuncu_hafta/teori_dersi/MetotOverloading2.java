package ucuncu_hafta.teori_dersi;

public class MetotOverloading2 {

    public int toplamaYap(int a, int b){
        int sonuc = a + b;
        System.out.println("sonuc-1 " +sonuc);
        return sonuc;
    }

    public void toplamaYap(int a, double b){
        double sonuc = a + b;
        System.out.println("sonuc-2 " + sonuc);
    }

    public double toplamaYap(double a, int b){
        double sonuc = a + b;
        System.out.println("sonuc-3 " + sonuc);
        return sonuc;
    }

    public static void main(String[] args) {
        MetotOverloading2 mod3 = new MetotOverloading2();
        mod3.toplamaYap(10, 10);
        mod3.toplamaYap(10, 10.9);
        mod3.toplamaYap(10.5, 10);
    }    
}
