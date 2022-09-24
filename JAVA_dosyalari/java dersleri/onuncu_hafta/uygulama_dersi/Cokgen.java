package onuncu_hafta.uygulama_dersi;

public class Cokgen {
    
    public void alan(){
        System.out.println("Çokgenin alanı hesaplanır");
    }
}

class Kare extends Cokgen{

    @Override
    public void alan(){
        int alan = 0, kenar = 5;
        alan = kenar * kenar;
        System.out.println("Kare alanı = " + alan);
    }
}

class Dikdortgen extends Cokgen{

    @Override
    public void alan(){
        int alan = 0, kenar1 = 5, kenar2 = 3;
        alan = kenar1 * kenar2;
        System.out.println("Dikdörtgen alanı = " + alan);
    }
}

class CokgenMain{

    public static void main(String[] args) {
        Cokgen c = new Cokgen();
        Kare k = new Kare();
        Dikdortgen d = new Dikdortgen();

        c.alan();
        k.alan();
        d.alan();
    }
}
