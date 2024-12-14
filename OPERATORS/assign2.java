public class assign2 {
    public static void main(String[] args) {
        int x, y, z;
        x = y= z = 2;
        x+= y;    // x = x+y = 2+2 = 4
        y-=z;     // y = y-z = 2-2 = 0  
        z /= (x+y); // x = 4, y = 0, z = z/(4+0) = 2/4 = 0(in integer)
        System.out.println(x+ " " + y + " " + z);
    }
}
