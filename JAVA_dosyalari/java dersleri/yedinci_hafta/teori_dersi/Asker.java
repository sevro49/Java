package yedinci_hafta.teori_dersi;

public class Asker {
    public void selamVer() {
        System.out.println("Asker selam verdi.");
    }

}

class Er extends Asker {
    public void selamVer() {
        System.out.println("Er selam verdi.");
    }
}

class Yuzbasi extends Asker {
    public void selamVer() {
        System.out.println("Yüzbaşı selam verdi.");
    }
}

class PolimorfizmOrnekBir {
    public static void hazirOl(Asker a) {
        a.selamVer();
    }

    public static void main(String[] args) {
        Asker a = new Asker();
        Er e = new Er();
        Yuzbasi y = new Yuzbasi();
        e.selamVer();
        y.selamVer();
        a.selamVer();
        hazirOl(a);
        hazirOl(e); // her er de bir askerdir. Asker, Er sınıfının super sınıfıdır.
    }
}
