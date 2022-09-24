package onuncu_hafta.uygulama_dersi;

public class DENEME {

    public void display() {
        System.out.println("Ben deneme class");
    }

}

class A extends DENEME{
    
    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Ben A class");
    }
}


class DenemeMain{

    public static void main(String[] args) {
        DENEME d = new DENEME();
        d.display();

        A a = new A();
        a.display();

        DENEME b = new A();
        b.display();

        A c = (A)b;
        c.display();

        /**
         * upcasting
         * DENEME b = new A();
         * 
         * downcasting
         * A c = (A)b;
         * 
         * downcasting yapmak için önce upcasting yapmak zorundayız
         */


    }
}