package dokuzuncu_hafta.uygulama_dersi.ornek1;

public class Main {

    public static void main(String[] args) {
        Kedi vankedisi = new Kedi("Karabaş");
        vankedisi.goster();
        vankedisi.su();
        Hayvan hayvan = new Hayvan("köepk");
        vankedisi.bilgiGoster();
        hayvan.bilgiGoster();
        hayvan.su();
    }
    
}
