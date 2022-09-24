package onbirinci_hafta.uygulama_Dersi;

public class Parent {

    String name;

    public void Method() {
        System.out.println("Burası Parent class");
    }
}

class Child extends Parent {

    int id;

    @Override
    public void Method() {
        // TODO Auto-generated method stub
        System.out.println("Burası Child class");
    }
}

class TestMain {

    public static void main(String[] args) {

        // upcasting
        Parent p = new Child();

        p.Method();
        p.name = "parent";
        System.out.println(p.name);

        // downcasting
        Child c = (Child) p;
        c.Method();

        /**
         * downcasting yapmak için önce
         * upcasting yapmak gereklidir.
         */

        /**
         * int i = 6;
         * double d= (double) i;
         * gibi typecasting yapıyoruz
         */

        c.Method();

        c.id = 49;
        c.name = "child";
        System.out.println(c.name);
        System.out.println(c.id);
    }

}
