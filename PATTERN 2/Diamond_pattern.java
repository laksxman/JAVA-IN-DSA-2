public class Diamond_pattern {
    public static void pattern(int n){
        // for upper half
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // star
            
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        // for lower half
        for(int i=n; i>=1; i--){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // star
            
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
