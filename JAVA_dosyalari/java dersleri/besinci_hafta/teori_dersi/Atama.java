package besinci_hafta.teori_dersi;

public class Atama {

    public static void main(String[] args) {
        short[] a = {8,7,6,5};
        int[] b = {2,3,345345,4,1};
        System.out.println(b[2]);
        a[3] = (short)b[2]; //typecasting
        System.out.println(b[2]);
    }
    
}
