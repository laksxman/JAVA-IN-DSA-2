public class logical {
    public static void main(String[] args) {
        System.out.println((3>2) && (5>1));  // True
        System.out.println((3>2) && (5>11));  // False
        System.out.println((3>12) && (5>11));  // False
        System.out.println((3>12) && (7>1));  // False



        System.out.println((3>12) || (7>1));  // True
        System.out.println((33>12) || (7<11));  // True
        System.out.println((33>12) || (7<11));  // True
        System.out.println((33>112) || (70<11));  // False


    }
}
