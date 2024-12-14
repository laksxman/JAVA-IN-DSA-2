public class hollow_diamond {

    public static void hollowdiamond(int n){
        
        // for upper half
        for(int i=1; i<=n; i++){
            // for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // stars for hollow diamond in upper half
            for(int j=1; j<=(2*i)-1; j++){
                // System.out.print("*");
                if(j==1 || j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // for lower half
        for(int i=n; i>=1; i--){
            // for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // stars for hollow diamond in upper half
            for(int j=1; j<=(2*i)-1; j++){
                // System.out.print("*");
                if(j==1 || j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      hollowdiamond(5);  
    }
}
