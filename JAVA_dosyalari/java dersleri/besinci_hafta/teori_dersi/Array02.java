package besinci_hafta.teori_dersi;

public class Array02 {

    public static void main(String[] args) {

        int[] carpan = new int[10];

        for (int i = 6; i < 10; i++) {
            carpan[i] = i * i;
        }

        for(int i = 0; i<10; i++){
            System.out.println(carpan[i]);
            System.out.println("\t");
        }

    }

}
