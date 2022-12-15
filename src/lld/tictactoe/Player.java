package lld.tictactoe;


public class Player {
    public String getPlayerName() {
        return playerName;
    }

    private String playerName;
    private int playerId;
    private String address;
    private int ranking;

    public char getPlayerSymbol() {
        return playerSymbol;
    }

    private char playerSymbol;//X or O
}
