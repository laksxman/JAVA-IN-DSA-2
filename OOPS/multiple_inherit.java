public class multiple_inherit {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.veg();
        b.meet();
    }
}

interface Herbivore{
    void veg();
}

interface Carnivore{
    void meet();
}

class Bear implements Herbivore, Carnivore {
    public void veg(){
        System.out.println("bear eat veg ");
    }

    public void  meet(){
        System.out.println("Bear eat meet also....");
    }
}