public class numbertriangle {
    public static void main(String[] args) {
        // int n=5;
        // for(int row=1; row<=n; row++){
        //     for(int col=1; col<=n; col++){
        //         if(row-col>=0){
        //             System.out.print(row+" ");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        // System.out.println();

        // }


// number incresing

        int n=5;
        for(int row=1; row<=n; row++){
            int val = row;
            for(int col=1; col<=n; col++){
                if(row-col>=0){
                    System.out.print(val+" ");
                    val++;
                }else{
                    System.out.print(" ");
            }
        }
        System.out.println();


        }


    }
}
