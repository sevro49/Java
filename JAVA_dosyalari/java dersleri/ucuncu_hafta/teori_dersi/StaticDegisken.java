package ucuncu_hafta.teori_dersi;

public class StaticDegisken {

    public static int x;
    public int y;

    public static void ekranaBas(StaticDegisken sd) {
        System.out.println("Statik değişkenler: " + x + "," + sd.y); //x static olduğu için sd1 veya sd2 nesnesini kullanarak erişmemize gerek yoktur.
    }

    public static void main(String[] args) {
        //x = 10; // static olduğu için hata vermez
        //y = 50; // static olmadığı için hata verir

        StaticDegisken sd1 = new StaticDegisken();
        StaticDegisken sd2 = new StaticDegisken();
        x = 50;
        sd1.y = 30;
        sd2.y = 20;

        ekranaBas(sd1); //(x, sd1.y)
        ekranaBas(sd2); //(x, sd2.y)

    }

}
