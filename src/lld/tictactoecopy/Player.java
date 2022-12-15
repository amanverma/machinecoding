package lld.tictactoecopy;

public class Player {
    private String name;
    private String piece;

    public String getName() {
        return name;
    }

    public String getPiece() {
        return piece;
    }

    public Player(String name, String piece){
        this.name = name;
        this.piece = piece;
    }
}