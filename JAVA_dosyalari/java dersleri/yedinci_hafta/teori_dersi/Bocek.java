package yedinci_hafta.teori_dersi;

public class Bocek {
    int a = 10;
    int b;

    Bocek() {
        ekranaBas("a =" + a + " b = " + b);
        b = 17;
    }

    static int x1 = ekranaBas("static Bocek.x1 ilk değer verildi");

    static int ekranaBas(String s) {
        System.out.println(s);
        return 10;
    }
}

class Bocekcik extends Bocek {
    int k = ekranaBas("Bocekcik.k ilk deger verildi");

    Bocekcik() {
        ekranaBas("k=" + k);
        ekranaBas("b= " + b);
    }

    static int x2 = ekranaBas("Static Bocekcik.x2 ilk deger verili");

    public static void main(String[] args) {
        ekranaBas("Bocekcik-basla");
        //Bocekcik b = new Bocekcik();
    }
}
