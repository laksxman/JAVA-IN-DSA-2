public class Copy1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "Lakshman";
        s1.roll = 1234;
        s1.password = "asdf";
        s1.marks[0]= 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student1 s2 = new Student1(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
        
    }
}

class Student1 {
    String name;
    int roll;
    String password;
    int marks[];

    //Copy constructor
    // Student1(Student1 s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
        
         // Deep copy of the marks array
        Student1(Student1 s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            for (int i = 0; i < s1.marks.length; i++) {
                this.marks[i] = s1.marks[i];
            }
        }
        
    

    Student1() {
        marks = new int[3];
        System.out.println("constructor is called....");
    }

    Student1(String name){
        marks = new int[3];
        this.name = name;
        System.out.println("Student name: "+ this.name);
    }

    // constructor with rool parameter
    Student1(int roll){
        marks = new int[3];
        this.roll = roll;
        System.out.println("Student roll: "+ this.roll);

    }
}
