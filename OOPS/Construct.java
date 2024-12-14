public class Construct {
    public static void main(String args[]) {
        Student s1 = new Student("lakshman");
        s1.name = "lakshman";
        System.out.println(s1.name);
        // StuDent s2 = new StuDent();
    }
}

class Student{
    String name;
    int roll;

    Student(String name){
        this.name = name;
    }

    Student(){
        this.name = name;
    }
}
