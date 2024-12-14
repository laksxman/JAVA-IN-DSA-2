public class Leftbottomupdown {
    public static void main(String[] args) {
        int n=5;
        // for(int row=1; row<=n; row++){
        //     for(int col=1; col<=n; col++){
        //         if(row-col>=0){
        //             System.out.print("*");
        //         }
        //     }
        // System.out.println();

        // }

// Reverse of it

        for(int row=n; row>=1; row--){
            for(int col=1; col<=n; col++){
                if(row-col>=0){
                    System.out.print("*");
                }
            }
        System.out.println();

        }
    }
}
