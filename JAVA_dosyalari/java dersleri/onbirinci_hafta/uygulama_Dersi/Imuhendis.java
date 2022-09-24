package onbirinci_hafta.uygulama_Dersi;

public interface Imuhendis {
    
    public void askerlikDurumuSorgula();

    double mezuniyetOrtalamasi(double ort);

    void adliSicilKaydi();

    void isTecrubesi(String[] isT);
}

class BilgisayarMuhendisi implements Imuhendis{

    @Override
    public void askerlikDurumuSorgula() {
        // TODO Auto-generated method stub
        System.out.println("Askerlik durumu: 5 yil tecilli");
    }

    @Override
    public double mezuniyetOrtalamasi(double ort) {
        // TODO Auto-generated method stub
        return ort;
    }

    @Override
    public void adliSicilKaydi() {
        // TODO Auto-generated method stub
        System.out.println("Adli sicil kaydı yok");
    }

    @Override
    public void isTecrubesi(String[] array) {
        // TODO Auto-generated method stub
        
    }
}


class ImuhendisMain {

    public static void main(String[] args) {
        
        // BilgisayarMuhendisi bm = new BilgisayarMuhendisi();
        

    }
}