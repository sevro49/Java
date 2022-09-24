package onucuncu_hafta.uygulama_dersi;

public abstract class Sekil {

    public abstract void ciz();
}

class Ucgen extends Sekil {

    @Override
    public void ciz() {
        System.out.println("Üçgen çiziyorum");
    }
}

class Kare extends Sekil {

    @Override
    public void ciz() {

        System.out.println("Kare çiziyorum");
    }
}

class SekilMain {

    public static void main(String[] args) {

        Sekil s1 = new Ucgen(); // upcasting
        Sekil s2 = new Kare(); // upcasting

        Ucgen u = (Ucgen) s1; // downcasting. Downcasting için upcasting şart
        s1.ciz();
        s2.ciz();
        u.ciz();

    }
}
