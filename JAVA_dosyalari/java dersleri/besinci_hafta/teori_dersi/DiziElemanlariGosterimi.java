package besinci_hafta.teori_dersi;

public class DiziElemanlariGosterimi {

    double[] d;
    String[] s;

    public DiziElemanlariGosterimi() {

        d = new double[5];
        d[0] = 2.1;
        d[1] = 3.4;
        d[2] = 4.6;
        d[3] = 1.1;
        d[4] = 0.11;

        s = new String[3];
        s[0] = "Zeynep";
        s[1] = "Atar";
        s[2] = "Emre";
        
    }

    public void ekranaBas() {
        for (int i = 0; i < d.length; i++) {
            System.out.println("d[" + i + "] = " + d[i]);
        }

        System.out.println("**************");

        for (int i = 0; i < s.length; i++) {
            System.out.println("s[" + i + "] = " + s[i]);
        }

    }

    public static void main(String[] args) {
        DiziElemanlariGosterimi a = new DiziElemanlariGosterimi();
        a.ekranaBas();
    }

}
