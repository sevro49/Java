package ucuncu_hafta.teori_dersi;

public class MutluAdam {

    private String ruh_hali = "Mutluyum";

    public void ruhHaliniYansit(){
        System.out.println("Ben " + ruh_hali);
    }

    public void tokatAt(){
        if(ruh_hali.equals("Mutluyum")){
            ruh_hali = "Sinirlendim";
        }
    }

    public void kucakla(){
        if(ruh_hali.equals("Sinirlendim")){
            ruh_hali = "Mutluyum";
        }
    }

    public static void main(String[] args) {
        MutluAdam ma = new MutluAdam();
        MutluAdam ma2 = new MutluAdam();
        
        ma.ruhHaliniYansit();
        ma.tokatAt();
        ma.ruhHaliniYansit();
        ma.kucakla();
        ma.ruhHaliniYansit();
        ma2.ruhHaliniYansit();
        
    }
    
}
