
    
class TestNormal{
    public void uyariYap(){ //fonksiyon static olursa kullanmak için fonksiyonun bulunduğu classtan nesne üretmeye gerek yoktur. Direkt fonksiyon adıyla kullanabiliriz.
        System.out.println("Dikkat Dikkat!!");
    }
    
    public static void main(String args[]){
        TestNormal uyari = new TestNormal();
    
        uyari.uyariYap();

        Sayi s1 = new Sayi();
        Sayi s2 = new Sayi();

        s1.i = 10;
        s2.i = 50;

        System.out.println(s2.i + s1.i);
        
    }
    
}

class Sayi
{
    int i;
}

class NesnelerdeAtama{
    public static void main(String args[]){

        Sayi s1 = new Sayi();
        Sayi s2 = new Sayi();

        s1.i = 10;
        s2.i = 50;

        System.out.println(s2.i + s1.i);
        IlkelPas.f(50);
        
    }
}

class IlkelPas{
    static void f(double a){
        System.out.println(a + " Gönderildi");
        a = 10;
        System.out.println("Gönderilen parametrenin değeri 10'a eşitlendi");
        System.out.println(a);


        
    }

    public static void main(String[] args){
        double a = 5;
        f(a);
    }
} 





