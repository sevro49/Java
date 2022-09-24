package onuncu_hafta.uygulama_dersi;

abstract class Language {

    public void display(){
        System.out.println("This is java Programming");
    }
    
}

class LanguageMain extends Language{
    public static void main(String[] args) {
        LanguageMain obj = new LanguageMain();

        obj.display();
    }
}
