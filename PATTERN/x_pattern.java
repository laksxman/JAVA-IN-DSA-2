public class x_pattern {
    public static void main(String[] args) {
        int n=5;
        if(n%2==0){
            System.out.println("Please enter odd digit: ");
        }
        else{
            for(int row=0; row<n; row++){
                for(int col=0; col<n; col++){
                    if(row==col || row+col==n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
    
            }
        }
        
    }
}
