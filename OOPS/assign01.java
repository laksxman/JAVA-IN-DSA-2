public class assign01 {
    public static void main(String[] args) {
        access obj = new access();
        obj.cal(2, 3);
        // System.out.println(obj.x+" "+obj.y);// we can not use y beacause y is private in the class
    }
}

class access{
    public int x;
    private int y;

    void cal(int a, int b){
        x= a+1;
        y= b;
    }
}
