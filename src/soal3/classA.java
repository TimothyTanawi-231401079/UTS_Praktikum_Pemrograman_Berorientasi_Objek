package soal3;

import java.util.Random;
public class classA {
    private char[][] board = new char[4][5];
    private boolean[][] revealed = new boolean[4][5];
    private int[][] data = new int[4][5];
    private int count;

    Random rand = new Random();

    public boolean getRevealed(int row, int col) {
        return revealed[row][col];
    }
    public int getCount(){
        return count;
    }

    public void generateBoard(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = '*';
                revealed[i][j] = false;
                data[i][j] = 0;
            }
        }
        for (int i = 0; i < 2; i++) {
            int i1 = rand.nextInt(4);
            int i2 = rand.nextInt(5);
            data[i1][i2] = 1;
        }

    }
    public void displayBoard(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }

    }
    public boolean guess(int row, int col){
        if(data[row][col] == 0){
            board[row][col] = '0';
            revealed[row][col] = true;
            return true;
        }
        else {
            board[row][col] = 'X';
            revealed[row][col] = true;
            return false;
        }

    }
    public boolean isGameOver(){
        count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if(board[i][j] == 'X'){
                    return true;
                } else if (board[i][j] == '0') {
                    count++;
                }
            }
        }
        return count == 18;
    }

}
