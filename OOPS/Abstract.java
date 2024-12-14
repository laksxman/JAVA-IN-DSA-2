import javax.sound.sampled.SourceDataLine;

public class Abstract {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // Cat c = new Cat();
        // c.eat();
        // c.walk();

        // System.out.println(h.color);

        Mustang myHorse = new Mustang();

        
    }
}

abstract class Animal{
    String color;

    Animal(){
        // color = "brown";
        System.out.println("animal constructor is called..");
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}
class  Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called...");
    }
    void changeColor(){
        color = "Blue";
    }
    void walk(){
        System.out.println("walks on 4 legs...");
    }
}

class Mustang extends Horse {
    Mustang(){
    System.out.println("Mustang constructor is called...");

    }
}

class Cat extends Animal{
    void changeColor(){
        color = "Red";
    }
    void walk(){
        System.out.println("walks on 2 legs...");
    }
}
