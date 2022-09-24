package onuncu_hafta.uygulama_dersi;

public class ProgrammingLanguage {
    public void display() {
        System.out.println("I am programming language");
    }
}

class Java extends ProgrammingLanguage {

    @Override
    public void display() {
        System.out.println("I am java language");
    }
}

class PLMain {

    public static void main(String[] args) {

        // declare an object variable
        ProgrammingLanguage pl;

        // create object of ProgrammingLanguage
        pl = new ProgrammingLanguage();
        pl.display();
        
        // create object of Java class
        pl = new Java();
        pl.display();

        // Java j = new Java(); // hata vermez
        //Java j1 = (new) ProgrammingLanguage(); // hata verir
        

    

    }

    public void display() {
    }
}
