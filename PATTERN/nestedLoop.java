import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lineNumber = sc.nextInt();

        for(int line= 1; line<=lineNumber; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}