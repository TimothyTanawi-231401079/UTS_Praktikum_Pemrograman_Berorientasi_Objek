package soal2;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        classA parkir = new classA();
        Scanner input = new Scanner(System.in);

        boolean status = true;
        int count = 0;
        System.out.println("====== Selamat Datang di ParkingChan ======");
        System.out.println();

        while (status) {
            System.out.print("Masukkan jenis kendaraan (Mobil/Motor/Truk) : ");
            String jenis = input.nextLine();
            if(Objects.equals(jenis, "Mobil") || Objects.equals(jenis, "Motor") || Objects.equals(jenis, "Truk")) {
                count++;
                System.out.print("Masukkan Lama Parkir (Manual/Waktu) : ");
                String pilihan = input.nextLine();
                if (Objects.equals(pilihan, "Manual")) {
                    System.out.print("Masukkan Lama Parkir (dalam jam) : ");
                    int lama = Integer.parseInt(input.nextLine());
                    System.out.println();
                    parkir.setLama(lama);
                    parkir.bayar(jenis);
                } else {
                    System.out.print("Masukkan Jam Masuk   : ");
                    int jam_masuk = Integer.parseInt(input.nextLine());
                    System.out.print("Masukkan Jam Keluar  : ");
                    int jam_keluar = Integer.parseInt(input.nextLine());
                    System.out.println();
                    parkir.bayar(jenis, jam_masuk, jam_keluar);
                }
                System.out.println();
            }
            else {
                System.out.println("Jenis Kendaraan tidak valid");
            }
            System.out.print("Ingin menambahkan kendaraan? (y/n):");
            String yn = input.nextLine();
            if(!Objects.equals(yn, "y")){
                status = false;
            }
        }
        System.out.println();
        parkir.totalParkir(count);
    }
}
