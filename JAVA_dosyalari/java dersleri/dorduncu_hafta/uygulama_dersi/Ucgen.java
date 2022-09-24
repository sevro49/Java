package dorduncu_hafta.uygulama_dersi;

public class Ucgen {

    public double kenar1;
    public double kenar2;
    public double kenar3;

    public Ucgen(double k1, double k2, double k3){
        this.kenar1 = k1;
        this.kenar2 = k2;
        this.kenar3 = k3;
        //UcgenMi();
        
    }

    public void CevreHesapla(){
        System.out.println("**********");
        System.out.println("Üçgen çevresi = " + (this.kenar1 + this.kenar2 + this.kenar3) + " cm");
    }

    public void AlanHesapla(){
        double u = (this.kenar1 + this.kenar2 + this.kenar3) / 2;
        double alan = Math.sqrt(u * (u-this.kenar1)*(u-this.kenar2)*(u-this.kenar3)); 
        System.out.println("**********");
        System.out.println("Üçgen alanı = " + alan + " cm^2");
        
    }

    public boolean UcgenMi(){
        if(Math.abs(this.kenar1 - this.kenar2) < this.kenar3  && (this.kenar1 + this.kenar2) > this.kenar3 ){
            System.out.println("Girdiğiniz kenarlar bir üçgen belirtiyor.");
            return true;
        }

        else if(Math.abs(this.kenar1 - this.kenar3) < this.kenar2  && (this.kenar1 + this.kenar3) > this.kenar2 ){
            System.out.println("Girdiğiniz kenarlar bir üçgen belirtiyor.");
            return true;
        }

        else if(Math.abs(this.kenar2 - this.kenar3) < this.kenar1  && (this.kenar2 + this.kenar3) > this.kenar1 ){
            System.out.println("Girdiğiniz kenarlar bir üçgen belirtiyor.");
            return true;
        }

        else{
            System.out.println("Girdiğiniz kenarlar bir üçgen belirtmiyor");
            return false;
        }
            
    }


    public static void main(String[] args) {
        Ucgen ucgen1 =new Ucgen(3,4,5);
        Ucgen ucgen2 =new Ucgen(7, 24, 25);
        //Ucgen ucgen3 = new Ucgen(2,3,100);

        ucgen1.CevreHesapla();
        ucgen2.CevreHesapla();
        ucgen1.AlanHesapla();
        ucgen2.AlanHesapla();
    }
    
}
