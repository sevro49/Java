package ucuncu_hafta.teori_dersi;

public class TarihHesaplama{
    int gun, ay, yil;
    public void gunuEkle(int gun){
        this.gun = gun;
    }
    public void gunuEkranaBas(){
        System.out.println("Gün " + gun );
    }

    public static void main(String[] args) {
        TarihHesaplama th = new TarihHesaplama();
        //th.gun = 18;
        th.gunuEkle(18);
        th.gunuEkranaBas();
    }
}


