public class CompileTime {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(2,4 ));
        System.out.println(cal.sum((float)2.2,(float)4.4 ));
        System.out.println(cal.sum(2,4,6 ));
    }
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    double sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}
