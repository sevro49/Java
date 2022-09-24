package onuncu_hafta.uygulama_dersi;



public class Diller {

    public void bilgiGoster(){
        System.out.println("Türkçe ");
    }

}

class Java extends Diller{

    @Override
    public void bilgiGoster(){
        System.out.println("OOP'yi java ile öğreniyorum");
    }
}

class Python extends Diller{

    @Override
    public void bilgiGoster(){
        System.out.println("OOP'yi python ile öğreniyorum");
    }
}

class DillerMain{
    public static void main(String[] args) {
        Java j = new Java();
        Python p = new Python();
        Diller d = new Diller();

        j.bilgiGoster();
        p.bilgiGoster();
        d.bilgiGoster();
    }
}