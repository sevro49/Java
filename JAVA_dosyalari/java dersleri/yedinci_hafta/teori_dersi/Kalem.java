package yedinci_hafta.teori_dersi;

public class Kalem {
    
}

class A{
    public final void ekranaYaz(){ //final methotlar override edilemez.
        System.out.println("A.ekranaYaz()");
    }
}

/** 
class B extends A{
    public void ekranaYaz(){

    }
}
*/

class Polis{
    /*private final void sucluYakala(){
        System.out.println("Polis.sucluYakala()");
    } */
}

class SivilPolis extends Polis{
    public void sucluYakala(){
        System.out.println("SivilPolis.sucluYakala()");
    }
}