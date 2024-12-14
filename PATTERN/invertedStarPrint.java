// import java.util.Scanner;

import java.util.Scanner;

public class invertedStarPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int line=1; line<=n; line++){
            for(int star=1; star<=(n-line+1); star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


// You can write your code also like below

// import java.util.Scanner;

// public class InvertedRightAngledTriangle {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int n = scanner.nextInt();

//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
