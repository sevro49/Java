package altinci_hafta.teori_dersi;

//burada kompozisyon yoktur.

class Kafa{
    void etrafaBak(){}
}

class Govde{
    void tumBirimlereUyariGonder(){}
    void benzinTankKontrolEt(){}
}

class SolBacak{
    void maviLazerSilahiAtesle(){}
}

class SagBacak{
    void kirmiziLazerSilahiAtesle(){}
}

class SolKol{
    void gucKaynagiKontrolEt(){}
}

class SagKol{
    void gucKaynaginiDoldur(){}
}

public class Voltran {
    Govde gv = new Govde();
    SolBacak slB = new SolBacak();
    SagBacak sgB = new SagBacak();
    SolKol slK = new SolKol();
    SagKol sgK = new SagKol();
    Kafa k = new Kafa();

    public static void main(String[] args) {
        Voltran vr = new Voltran();
        vr.k.etrafaBak(); //vr nesnesi, kafa nesnesi, etrafaBak() fonksiyonu
    }
    
}
