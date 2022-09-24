package onbirinci_hafta.uygulama_Dersi;



//aynı tipler extends edilir, farklı tipler implements edilir.
//abstract methodları gruplamak için yeni bir abstract class üretmişler, ona da interface demişler.
public interface Imeyve {
    void meyveAdı();

    void alinanKg(double n);

    double fiyat();

}

class Cilek implements Imeyve {

    double n;
    double kgFiyat = 9.99;

    @Override
    public void meyveAdı() {
        // TODO Auto-generated method stub
        System.out.println("Çilek");
    }

    @Override
    public void alinanKg(double n) {
        // TODO Auto-generated method stub
        this.n = n;
    }

    @Override
    public double fiyat() {
        // TODO Auto-generated method stub
        return n * kgFiyat;
    }

}

class Armut implements Imeyve{

    @Override
    public void meyveAdı() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void alinanKg(double n) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public double fiyat() {
        // TODO Auto-generated method stub
        return 0;
    }


}


