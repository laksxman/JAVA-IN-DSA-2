public class InterFace {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, dowm, left, right, diagonal(in all four direction)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, dowm, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, dowm, left, right, diagonal(1 step only)");
    }
}
