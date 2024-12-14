public class Lakshman {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1("askhman");
        Student1 s3 = new Student1(123);
    }
}

class Student1 {
    String name;
    int roll;

    Student1() {
        System.out.println("constructor is called....");
    }

    Student1(String name){
        this.name = name;
        System.out.println("Student name: "+ this.name);
    }

    Student1(int roll){
        this.roll = roll;
        System.out.println("Student roll: "+ this.roll);

    }
}
