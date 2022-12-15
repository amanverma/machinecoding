package lld.tictactoecopy;

public class Board {

    int n;
    String[][] board;
    final int MAX_MOVES;
    int moveCount = 0;

    public Board(int n){
        this.n = n;
        this.board = new String[n][n];
        showBoard();
        MAX_MOVES = n*n;
    }

    public boolean isMoveValid(int row, int col){
        return board[row][col]==null;
    }

    public void makeMove(int row, int col, String piece){
        board[row][col] = piece;
        moveCount++;
        showBoard();
    }

    public boolean noValidMovesLeft(){
        return moveCount==MAX_MOVES;
    }

    public boolean hasPlayerWon(int row, int col, String piece){
        return rowCheck(row, piece) || colCheck(col, piece) ||
                posDiagonalCheck(row, col, piece) || negDiagonalCheck(row, col, piece);
    }

    private boolean rowCheck(int row, String piece){
        for(int j=0; j< n; j++){
            if(board[row][j]!=piece){
                return false;
            }
        }
        return true;
    }

    private boolean colCheck(int col, String piece){
        for(int i=0; i< n; i++){
            if(board[i][col]!=piece){
                return false;
            }
        }
        return true;
    }

    private boolean posDiagonalCheck(int row, int col, String piece){
        if(row!=col) return false;
        for(int i=0, j=0; i<n && j<n ; i++, j++){
            if(board[i][j]!=piece){
                return false;
            }
        }
        return true;
    }

    private boolean negDiagonalCheck(int row, int col, String piece){
        if(row+col!=n) return false;
        for(int i=n-1, j=0 ; i>=0 && j<n ; i--, j++){
            if(board[i][j]!=piece){
                return false;
            }
        }
        return true;
    }

    private void showBoard(){
        for(int i=0; i< board.length; i++){
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]==null){
                    System.out.print("- ");
                }else {
                    System.out.print(board[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}