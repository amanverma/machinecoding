package lld.tictactoe;

import java.util.Queue;
import java.util.Scanner;

public class Board {
    char [][] board;
    int boardSize;
    Queue<Player> playerQueue;

    Scanner input;

    public Board(int boardSize, Player[] players){
        this.boardSize = boardSize;
        this.board = new char[2*boardSize-1][2*boardSize-1];
        playerQueue.offer(players[0]);
        playerQueue.offer(players[1]);
        initializeBoard(board);
        printBoard();
    }

    private void initializeBoard(char[][] board) {
        for(int i = 0 ; i < board.length; i++){
            for(int j = 0 ; j < board[0].length;j++){
                if(i%2==0 && j%2!=0) board[i][j] = '|';
                if(i%2!=0 && j%2==0) board[i][j] = '-';
                if(i%2!=0 && j%2!=0) board[i][j] = '+';
            }
        }
    }

    private void printBoard(){
        for(char[] row: board){
            System.out.println(row);

        }
    }

    public void play(){
        //game end condition
        // no more moves left or a player has won (horizontal , vertical and diagonal)
        int count = 0 ;
        while(true){
            count++;
            if(count== (boardSize*boardSize+1)){
                System.out.println("Game is Draw!");
                break;
            }
            Player player = playerQueue.poll();
            int userInput = getUserInput(player);
            int row = 1; //fn(userInput)
            int column = 1; //fn(userInput)
            board[row][column] = player.getPlayerSymbol();
            printBoard();
            //check if game has ended
            if(count>=boardSize && checkGameEnded(player,row, column)) break;
            playerQueue.offer(player);

        }


    }

    private boolean checkGameEnded(Player player, int row, int column) {
        //code to check for three directions - H, V, D
        return false;
    }

    private int getUserInput(Player player) {
        printBoard();
        System.out.println(player.getPlayerName() +" Please enter a position between 1 - " +boardSize*boardSize);
        int val = input.nextInt();
        while(!validateInput(val)){
            printBoard();
            System.out.println("Wrong position " + player.getPlayerName() +" Please enter a position between 1 - " +boardSize*boardSize);
            val = input.nextInt();
        }
        return val;
    }

    private boolean validateInput(int val) {
        if(val<1|| val > boardSize*boardSize) return false;
        //[1-9]
        //row = ? and column = ?
        //if(board[row][column]!=0) return false;
        return false;
    }
}
