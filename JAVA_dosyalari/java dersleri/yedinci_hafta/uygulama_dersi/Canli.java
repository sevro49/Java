package yedinci_hafta.uygulama_dersi;

public class Canli {
    
    public void sesCikar(){
        System.out.println("Engeli olmayan her canlı ses çıkararak iletişim kurar");
    }

}

class Kedi extends Canli{

    @Override
    public void sesCikar() {
        
        System.out.println("Kediler miyavlar");
        //super.sesCikar(); // üst classtaki sesCikar() metodunu kullanır
    } 
    public static void main(String[] args) {
        Kedi kedi = new Kedi();
        kedi.sesCikar();
    }
}
