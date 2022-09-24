package altinci_hafta.teori_dersi;

public class Hacker extends ZekiInsan {
    public Hacker(int par){
        super(par + 1);
        System.out.println("Hacker constructor " + par);
    }
    
    public static void main(String[] args) {
        //Hacker h = new Hacker(50); //her hacker zekiinsan, her zekiinsan bir insan.
    }
}
