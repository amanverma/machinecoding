package lld.tictactoecopy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Driver {

    static final int MAX_PLAYERS = 2;
    static final int size = 3;
    static int currentPlayerIndex = 0;
    static boolean playerWon = false;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Player> players = new ArrayList<>(MAX_PLAYERS);
        for(int i=0; i<MAX_PLAYERS; i++){ //instantiation of 2 player objects
            String command = br.readLine();
            String[] commands = command.split(" ");
            players.add(new Player(commands[1], commands[0]));
        }
        Board board = new Board(size);
        while(true){
            String command = br.readLine();
            String[] commands = command.split(" ");
            if(commands[0].equals("exit")){
                break;
            }
            // ignores all moves after a player won or no valid moves left
            if(playerWon==true || board.noValidMovesLeft()==true) continue;
            int row = Integer.parseInt(commands[0]) - 1;
            int col = Integer.parseInt(commands[1]) - 1;

            if(board.isMoveValid(row, col)==true){
                board.makeMove(row, col, players.get(currentPlayerIndex).getPiece());
                if(board.hasPlayerWon(row, col, players.get(currentPlayerIndex).getPiece())){
                    playerWon = true;
                    System.out.println(players.get(currentPlayerIndex).getName()+" won the game");
                }else if(board.noValidMovesLeft()==true){
                    System.out.println("Game Over");
                }
                // change index to next player
                currentPlayerIndex++;
                if(currentPlayerIndex >= MAX_PLAYERS){
                    currentPlayerIndex %= MAX_PLAYERS;
                }

            }else{
                System.out.println("Invalid Move");
            }
        }
    }
}

