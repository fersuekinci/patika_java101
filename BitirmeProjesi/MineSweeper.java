import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
    int r;
    int c;
    String[][] setBoard;
    String[][] setMine;
    boolean isWin;
    int countAll;

    MineSweeper(int r,int c){
        this.r = r;
        this.c = c;
        this.setBoard= setBoard();
        this.setMine =setMine();
        this.isWin = false;
        this.countAll = ((this.r * this.c) - ((this.r * this.c) / 4));
        printMine();
    }

    void init(){
        Scanner input = new Scanner(System.in);
        boolean gameover = false;

        while (!gameover && !this.isWin) {
            System.out.print("satır giriniz : ");
            int x = input.nextInt();

            System.out.print("sütun giriniz : ");
            int y = input.nextInt();

            if(y>this.c || x>this.r){
                System.out.println("boyut dışında sayı giridiniz. Tekrar deneyiniz.");
            }
            else{
                if(this.setMine[x][y].equals("*")){
                    gameover = true;
                    printMine();
                    System.out.println("kaybettiniz");
                }
                else{
                    this.setBoard[x][y]= String.valueOf(check(x,y));
                    printBoard();
                    if(this.isWin){
                        System.out.println("kazandınız");
                        printMine();
                    }
                }
            }
            System.out.println("=================================");
        }
    }

    String[][] setBoard() {
        String[][] board = new String[this.r][this.c];
        for (int i = 0; i < this.r; i++) {
            for (int j = 0; j < this.c; j++) {
                board[i][j] = "-";
            }
        }
        return board;
    }

    void printBoard() {
        for(int i = 0; i < this.r; i++){
            for( int j = 0; j < this.c; j++){
                System.out.print(this.setBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    String[][] setMine() {
        int mineCount = ((r * c) / 4);
        String[][] mine = new String[this.r][this.c];
        Random random = new Random();

        for(int i = 0 ; i<this.r;i++) {
            for(int j = 0 ; j<this.c;j++) {
                mine[i][j] = "-";
            }
        }
        for (int i = 0; i < mineCount; i++) {
            int mineRow = random.nextInt(this.r);
            int mineColumn = random.nextInt(this.c);

            mine[mineRow][mineColumn] = "*";
        }
        return mine;
    }

    void printMine(){
        for (int i = 0; i < this.r; i++) {
            for (int j = 0; j < this.c; j++) {
                System.out.print(this.setMine[i][j] + " ");
            }
            System.out.println();
        }
    }

    int check(int r, int c){
        int countMine=0;
        if(r == 0){
            if(c == 0) {
                if (setMine[r][c + 1].equals("*")) countMine++;
                if (setMine[r + 1][c + 1].equals("*")) countMine++;
                if (setMine[r + 1][c].equals("*")) countMine++;
            }
            else if (c == this.c - 1){
                if (setMine[r + 1][c].equals("*")) countMine++;
                if (setMine[r + 1][c - 1].equals("*")) countMine++;
                if (setMine[r][c - 1].equals("*")) countMine++;
            }
            else{
                if (setMine[r][c + 1].equals("*")) countMine++;
                if (setMine[r + 1][c + 1].equals("*")) countMine++;
                if (setMine[r + 1][c].equals("*")) countMine++;
                if (setMine[r + 1][c - 1].equals("*")) countMine++;
                if (setMine[r][c - 1].equals("*")) countMine++;
            }
        }
        else if(r == this.r - 1){
            if(c == 0){
                if (setMine[r - 1][c].equals("*")) countMine++;
                if (setMine[r - 1][c + 1].equals("*")) countMine++;
                if (setMine[r][c + 1].equals("*")) countMine++;
            }
            else if (c == this.c - 1){
                if (setMine[r - 1][c].equals("*")) countMine++;
                if (setMine[r - 1][c - 1].equals("*")) countMine++;
                if (setMine[r][c - 1].equals("*")) countMine++;
            }
            else{
                if (setMine[r][c - 1].equals("*")) countMine++;
                if (setMine[r - 1][c - 1].equals("*")) countMine++;
                if (setMine[r - 1][c].equals("*")) countMine++;
                if (setMine[r - 1][c + 1].equals("*")) countMine++;
                if (setMine[r][c + 1].equals("*")) countMine++;
            }
        }
        else{
            if(c == 0){
                if (setMine[r - 1][c].equals("*")) countMine++;
                if (setMine[r - 1][c + 1].equals("*")) countMine++;
                if (setMine[r][c + 1].equals("*")) countMine++;
                if (setMine[r + 1][c + 1].equals("*")) countMine++;
                if (setMine[r + 1][c].equals("*")) countMine++;
            }
            else if(c == this.c - 1){
                if (setMine[r - 1][c].equals("*")) countMine++;
                if (setMine[r - 1][c - 1].equals("*")) countMine++;
                if (setMine[r][c - 1].equals("*")) countMine++;
                if (setMine[r + 1][c - 1].equals("*")) countMine++;
                if (setMine[r + 1][c].equals("*")) countMine++;
            }
            else{
                if (setMine[r - 1][c].equals("*")) countMine++;
                if (setMine[r - 1][c + 1].equals("*")) countMine++;
                if (setMine[r][c + 1].equals("*")) countMine++;
                if (setMine[r + 1][c + 1].equals("*")) countMine++;
                if (setMine[r + 1][c].equals("*")) countMine++;
                if (setMine[r + 1][c - 1].equals("*")) countMine++;
                if (setMine[r][c - 1].equals("*")) countMine++;
                if (setMine[r - 1][c - 1].equals("*")) countMine++;
            }
        }
        countAll--;
        if(countAll == 0) this.isWin = true;

        return countMine;
    }
}
