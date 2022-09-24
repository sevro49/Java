package dorduncu_hafta.uygulama_dersi;

public class Student{

    public int id;
    String name;
    public int age;

    public Student(int i, String n){
        this.id = i;
        this.name = n;
    }

    public Student(int i, String n, int a){
        this.id = i;
        this.name = n;
        this.age = a;
    }

    public void Display(){
        System.out.println("id: " + this.id);
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);

    }

    public static void main(String[] args) {
        Student s1 = new Student(321564, "Emre");
        Student s2 = new Student(12323, "Zeynep", 21);
        s1.Display();
        s2.Display();
    }


}