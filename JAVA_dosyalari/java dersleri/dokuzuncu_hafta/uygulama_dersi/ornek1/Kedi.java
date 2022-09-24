package dokuzuncu_hafta.uygulama_dersi.ornek1;

public class Kedi extends Hayvan {

    public Kedi(String a){
        super(a);
    }
    
    public void goster(){
        System.out.println("İsmim "+ isim);
    }

    @Override
    public void bilgiGoster(){
        super.bilgiGoster();
        System.out.println("Ben bir kediyim");
    }


    @Override
    public void su(){
        System.out.println("Kediler su içer");
    }   
}//class
