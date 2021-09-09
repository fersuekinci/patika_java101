import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("mayın tarlası oyununa hoşgeldiniz");
        System.out.print("lütfen satır sayısı giriniz : ");
        int r = input.nextInt();
        System.out.print("lütfen sütun sayısı giriniz : ");
        int c = input.nextInt();

        MineSweeper mineSweeper = new MineSweeper(r,c);
        mineSweeper.init();
    }
}
