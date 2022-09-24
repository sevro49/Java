package onbirinci_hafta.uygulama_Dersi;

public abstract class Bisiklet {
    
    public abstract void Fren();
}

class DagBisikleti extends Bisiklet{

    @Override
    public void Fren() {
        // TODO Auto-generated method stub
        System.out.println("Dağ bisikleti fren yapar");
        
    }

}

class SporBisikleti extends Bisiklet{

    @Override
    public void Fren() {
        // TODO Auto-generated method stub
        System.out.println("Spor bisikleti fren yapar");
        
    }
}

class BisikletMain{
    public static void main(String[] args) {
        Bisiklet b = new Bisiklet() {

            @Override
            public void Fren() {
                // TODO Auto-generated method stub
                System.out.println("Bisiklet fren yapar");
                
            }
            
        };

        DagBisikleti db = new DagBisikleti();
        SporBisikleti sb = new SporBisikleti();
        
        b.Fren();
        db.Fren();
        sb.Fren();
    }
}


