package ucuncu_hafta.teori_dersi;

class KahveFincani {
    public KahveFincani(){//constructor
        System.out.println("Bir kahve fincanı");
    }
}

class YeniKahveFincani{
    public YeniKahveFincani(int adet){
        System.out.println(adet + " adet YeniKahveFincanı");
    }
}

public class ConstructorGiris {

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            new KahveFincani();
        }

        for(int i = 0; i< 5; i++){
            new YeniKahveFincani(i);
        }
    }

    
}
