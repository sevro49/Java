package yedinci_hafta.uygulama_dersi;

public class Ogretmen extends Insan {
    
    public Ogretmen(int t, String a) {
        super(t, a);
        
    }

    @Override
    public String calis() {
        
        //return super.calis();
        return " ders anlatır.";
    }

    @Override
    public String konus() {
        //return super.konus();
        return " dersle ilgili konuşur.";
    }
}
