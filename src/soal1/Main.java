package soal1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        classB perusahaan = new classB();
        Scanner input = new Scanner(System.in);

        boolean status = true;
        while (status) {
            System.out.println("=== SISTEM MANAJEMEN KARYAWAN ===");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Hapus Karyawan");
            System.out.println("3. Ubah Posisi");
            System.out.println("4. Ubah Gaji");
            System.out.println("5. Tampilkan Karyawan");
            System.out.println("6. Cari Karyawan");
            System.out.println("7. Keluar");
            System.out.println("Masukkan pilihan Anda : ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    perusahaan.tambahKaryawan();
                    break;
                case 2:
                    perusahaan.hapusKaryawan();
                    break;
                case 3:
                    perusahaan.ubahPosisi();
                    break;
                case 4:
                    perusahaan.ubahGaji();
                    break;
                case 5:
                    perusahaan.tampilkanKaryawan();
                    break;
                case 6:
                    perusahaan.cariKaryawan();
                    break;
                default:
                    System.out.println("Terima Kasih telah mengunjungi");
                    status = false;
                    break;
            }
        }

    }
}
