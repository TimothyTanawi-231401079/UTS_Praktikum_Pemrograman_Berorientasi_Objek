package soal1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class classB {
    ArrayList <classA> daftarKaryawan = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    public void tambahKaryawan(){
        boolean status = true;
        while (status) {
            System.out.print("Masukkan ID : ");
            String id = input.nextLine();
            System.out.print("Masukkan Nama : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Posisi : ");
            String posisi = input.nextLine();
            System.out.print("Masukkan Gaji : ");
            int gaji = Integer.parseInt(input.nextLine());
            System.out.print("Masukkan Tanggal Masuk (dd/mm/yyyy): ");
            String tanggal = input.nextLine();

            if (cariIdKaryawan(id) == null) {
                classA karyawan = new classA(id, nama, posisi, gaji, tanggal);
                daftarKaryawan.add(karyawan);
                System.out.println("Karyawan berhasil ditambahkan.");
            } else {
                System.out.println("ID karyawan sudah tersedia.");

            }
            System.out.print("Ingin menambahkan lagi? (y/n)");
            String yn = input.nextLine();
            if(!Objects.equals(yn, "y")){
                status = false;
            }
        }
    }
    public void hapusKaryawan() {
        System.out.print("Masukkan ID karyawan yang ingin dihapus : ");
        String id = input.nextLine();
        if(cariIdKaryawan(id) == null){
            System.out.println("ID tidak ditemukan");
        }
        else{
            daftarKaryawan.remove(cariIdKaryawan(id));
            System.out.println("Karyawan berhasil dihapus");
        }
    }
    public void ubahPosisi() {
        System.out.print("Masukkan ID karyawan : ");
        String id = input.nextLine();
        if(cariIdKaryawan(id) == null){
            System.out.println("ID tidak ditemukan");
        }
        else{
            System.out.print("Masukkan Posisi baru : ");
            String posisiBaru = input.nextLine();
            cariIdKaryawan(id).setPosisi(posisiBaru);
            System.out.println("Posisi berhasil diubah");
        }
    }
    public void ubahGaji() {
        System.out.print("Masukkan ID karyawan : ");
        String id = input.nextLine();
        if(cariIdKaryawan(id) == null){
            System.out.println("ID tidak ditemukan");
        }
        else{
            System.out.print("Masukkan Gaji baru : ");
            int gajiBaru = input.nextInt();
            cariIdKaryawan(id).setGaji(gajiBaru);
            System.out.println("Gaji berhasil diubah");
        }
    }
    public void tampilkanKaryawan() {
        System.out.println("Daftar Karyawan: ");
        System.out.println();
        for(classA daftar : daftarKaryawan){
            System.out.println("ID : " + daftar.getId() + ", Nama : " + daftar.getNama() + ", Posisi : " + daftar.getPosisi() + ", Gaji : " + daftar.getGaji() + ", Tanggal Masuk : " + daftar.getTanggal());
        }
    }
    public void cariKaryawan() {
        ArrayList <classA> daftar = new ArrayList<>();
        System.out.println("Cari Karyawan berdasarkan : ");
        System.out.println("1. ID");
        System.out.println("2. Nama");
        System.out.println("3. Posisi");
        System.out.println("4. Gaji");
        System.out.println("5. Tanggal Masuk");
        System.out.println();
        System.out.println("Masukkan pilihan : ");
        String pilihan = input.nextLine();
        switch (pilihan){
            case "1":
                System.out.print("Masukkan ID : ");
                String id = input.nextLine();
                if(cariIdKaryawan(id) != null){
                    System.out.println("ID : " + cariIdKaryawan(id).getId() + ", Nama : " + cariIdKaryawan(id).getNama() + ", Posisi : " + cariIdKaryawan(id).getPosisi() + ", Gaji : " + cariIdKaryawan(id).getGaji() + ", Tanggal Masuk : " + cariIdKaryawan(id).getTanggal());
                }
                else{
                    System.out.println("ID tidak ditemukan");
                }
                System.out.println();
                break;
            case "2":
                System.out.print("Masukkan Nama : ");
                String nama = input.nextLine();
                if(cariNamaKaryawan(nama) != null){
                    daftar.add(cariNamaKaryawan(nama));
                    for(classA temp : daftar){
                        System.out.println("ID : " + temp.getId() + ", Nama : " + temp.getNama() + ", Posisi : " + temp.getPosisi() + ", Gaji : " + temp.getGaji() + ", Tanggal Masuk : " + temp.getTanggal());
                    }
                }
                else{
                    System.out.println("Nama tidak ditemukan");
                }
                System.out.println();
                break;
            case "3":
                System.out.print("Masukkan Posisi : ");
                String posisi = input.nextLine();
                if(cariPosisiKaryawan(posisi) != null) {
                    daftar.add(cariPosisiKaryawan(posisi));
                    for (classA temp1 : daftar) {
                        System.out.println("ID : " + temp1.getId() + ", Nama : " + temp1.getNama() + ", Posisi : " + temp1.getPosisi() + ", Gaji : " + temp1.getGaji() + ", Tanggal Masuk : " + temp1.getTanggal());
                    }
                }
                else{
                    System.out.println("Posisi tidak ditemukan");
                }
                System.out.println();
                break;
            case "4":
                System.out.print("Masukkan Gaji : ");
                int gaji = input.nextInt();
                if(cariGajiKaryawan(gaji) != null) {
                    daftar.add(cariGajiKaryawan(gaji));
                    for (classA temp2 : daftar) {
                        System.out.println("ID : " + temp2.getId() + ", Nama : " + temp2.getNama() + ", Posisi : " + temp2.getPosisi() + ", Gaji : " + temp2.getGaji() + ", Tanggal Masuk : " + temp2.getTanggal());
                    }
                }
                else{
                System.out.println("Gaji tidak ditemukan");
                }
                System.out.println();
                break;
            case "5":
                System.out.print("Masukkan Tanggal Masuk : ");
                String tanggal = input.nextLine();
                if(cariTanggalKaryawan(tanggal) != null) {
                    daftar.add(cariTanggalKaryawan(tanggal));
                    for (classA temp3 : daftar) {
                        System.out.println("ID : " + temp3.getId() + ", Nama : " + temp3.getNama() + ", Posisi : " + temp3.getPosisi() + ", Gaji : " + temp3.getGaji() + ", Tanggal Masuk : " + temp3.getTanggal());
                    }
                }
                else{
                    System.out.println("Tanggal Masuk tidak ditemukan");
                }
                System.out.println();
                break;
            case "6":
                System.out.println("Input tidak valid");
                System.out.println();
                break;
        }

    }
    public classA cariIdKaryawan(String id) {
        for (classA k : daftarKaryawan) {
            if (k.getId().equals(id)) {
                return k;
            }
        }
        return null;
    }
    public classA cariNamaKaryawan(String nama) {
        for (classA k : daftarKaryawan) {
            if (k.getNama().equals(nama)) {
                return k;
            }
        }
        return null;
    }
    public classA cariPosisiKaryawan(String posisi) {
        for (classA k : daftarKaryawan) {
            if (k.getPosisi().equals(posisi)) {
                return k;
            }
        }
        return null;
    }
    public classA cariGajiKaryawan(int gaji) {
        for (classA k : daftarKaryawan) {
            if (k.getGaji() == gaji) {
                return k;
            }
        }
        return null;
    }
    public classA cariTanggalKaryawan(String tanggal) {
        for (classA k : daftarKaryawan) {
            if (k.getTanggal().equals(tanggal)) {
                return k;
            }
        }
        return null;
    }
}

