public class Constructor_ex {
    public static void main(String[] args) {
        Student stu1 = new Student("Lakshman", 79);
        Student stu2 = new Student(stu1);
        System.out.println(stu2.name);
        System.out.println(stu1.name);
        System.out.println(stu1.rollNo);
    }
}

class Student{
    String name;
    int rollNo;

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    Student(Student obj){
        this.name = obj.name;
        this.rollNo = obj.rollNo;
    }
}

