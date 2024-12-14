import java.util.Scanner;

public class starDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}
