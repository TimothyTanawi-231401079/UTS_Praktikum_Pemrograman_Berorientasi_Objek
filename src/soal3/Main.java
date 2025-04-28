package soal3;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        classA elot = new classA();
        Scanner input = new Scanner(System.in);

        elot.generateBoard();
        System.out.println("Selamat Datang di E-lottery Gosok");
        elot.displayBoard();
        System.out.println();
        while (!elot.isGameOver()){
            System.out.print("Masukkan tebakan Anda (baris dan kolom) : ");
            int row = input.nextInt();
            int col = input.nextInt();

            if(row > 3 || row < 0 || col > 4 || col < 0){
                System.out.println("Input tidak valid");
                System.out.println("Silakan coba sekali lagi");
            }
            else{
                if(elot.getRevealed(row, col)){
                    System.out.println("Kotak telah dibuka sebelumnya!");
                }
                else {
                    if(elot.guess(row, col)){
                        if(elot.isGameOver()){
                            System.out.println("Selamat Anda menang");
                        }
                        else{
                            System.out.println("Kotak Aman");
                        }
                    }
                    else{
                        System.out.println("BOOM! Anda menemukan bom! Permainan berakhir.");
                    }
                }
                elot.displayBoard();
            }
        }

    }
}
