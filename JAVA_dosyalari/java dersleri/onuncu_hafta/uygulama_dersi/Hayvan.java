package onuncu_hafta.uygulama_dersi;

public class Hayvan {

    public void ses(){
        System.out.println("Hayvanlar ses çıkarır");
    }
    
}

class Kedi extends Hayvan{

    @Override
    public void ses(){
        
        System.out.println("miyav miyav");
    }
}

class Ordek extends Hayvan{
    
    @Override
    public void ses(){

        System.out.println("Vak vak");
    }
    
}

class HayvanMain{

    public static void main(String[] args) {
        Hayvan h = new Hayvan();
        Kedi k = new Kedi();
        Ordek o = new Ordek();

        h.ses();
        k.ses();
        o.ses();
    }
}
