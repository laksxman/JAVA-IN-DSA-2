import java.util.Scanner;

// print number in reverse order

public class print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        for(int line=n; line>=1; line--){
            for(int number=1; number<=line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
