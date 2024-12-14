public class assign2 {
    public static void main(String[] args) {
        Person p = new Person();
        // p.rollNumber = 123;
        // p.schoolName = "adf";
        p.name = "asdf";
        p.weight = 23;
        System.out.println(p.name);
        System.out.println(p.weight);
    }
}

class Person{
    String name;
    int weight;
}

class Student extends Person{
    int rollNumber;
    String schoolName;
}
