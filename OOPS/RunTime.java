public class RunTime {
    public static void main(String[] args) {
        Deer dobby = new Deer();
        dobby.eats();
    }
}

class Animal{
    void eats(){
        System.out.println("animal eat");
    }
}

class Deer extends Animal{
    void eats(){
        System.out.println("dog also eat");
    }
}