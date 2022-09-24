package onuncu_hafta.uygulama_dersi;

public class Desen {
    
    public static void goster(){
        for(int i = 0; i< 10; i++){
            System.out.print("*");
        }
    }

    // * Metot overloading
    public static void goster(char c){
        for(int i = 0; i < 10; i++){
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        goster();
        System.out.println();
        goster('#');
    }
}
