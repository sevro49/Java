package onuncu_hafta.uygulama_dersi;

public abstract class Animal {
    abstract void makeSound(); //gövdesi, kıvırcık parantezleri olmayan method

    public void eat(){
        System.out.println("I can eat.");
    }
    
    
}

class Cat extends Animal{

    public void makeSound(){
        System.out.println("meow");
    }

}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("hav hav");
    }
}

class Cow extends Animal{
    public void makeSound(){
        System.out.println("Mooo");
    }
}

class AnimalMain{
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        Cow cow = new Cow();

        c.makeSound();
        c.eat();

        d.makeSound();
        d.eat();

        cow.makeSound();
        cow.eat();
    }
}