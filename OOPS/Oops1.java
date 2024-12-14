public class Oops1 {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);

        StuDent s1 = new StuDent();
        s1.calPercentage(45, 56, 67);
        System.out.println(s1.percentage);

        p1.color = "yellow";
        System.out.println(p1.color);
        p1.setColor("red");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc= new BankAccount();
        myAcc.username = "Lakshman";
        System.out.println(myAcc.username);

        myAcc.setPassword("asdfasdf");
        System.out.println(myAcc.password);

        


    }
}

class BankAccount{
    public String username;
    protected String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;

    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class StuDent{
    String name;
    int age;
    float percentage;

    void calPercentage(int math, int phy, int chem){
        percentage = (math+ chem+phy)/3;
    }
}