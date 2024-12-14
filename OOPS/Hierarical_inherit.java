public class Hierarical_inherit {
    public static void main(String[] args) {
        Mammal m1 = new Mammal();
        m1.eat();
        m1.breathe();
        fly f1 = new fly();
        f1.eat();
        f1.breathe();
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
    }
}

//base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

//Derived class 
class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}

class fly extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
