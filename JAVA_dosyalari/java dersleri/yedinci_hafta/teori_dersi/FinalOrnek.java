package yedinci_hafta.teori_dersi;

class Kutu{
    int i = 0;
}
public class FinalOrnek {
    final int X_SABIT_DEGER = 34;
    final static int Y_SABIT_DEGER = 35;

    final int A_SABIT_DEGER = (int)(Math.random()*50);
    final Kutu k = new Kutu();

    public static void main(String[] args) {
        FinalOrnek fo = new FinalOrnek();
        fo.k.i = 35;
        System.out.println("X_SABIT_DEGER= " + fo.X_SABIT_DEGER);
        //System.out.println("Y_SABIT_DEGER= " + fo.Y_SABIT_DEGER);
        System.out.println("A_SABIT_DEGER= " + fo.A_SABIT_DEGER);
        System.out.println("fo.k.i= " + fo.k.i);


    }

    
}
