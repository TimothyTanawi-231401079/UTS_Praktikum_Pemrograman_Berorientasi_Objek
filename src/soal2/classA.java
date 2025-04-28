package soal2;

import java.util.Objects;

public class classA {
    private String jenis;
    private int lama;

    private int total_penuh = 0;
    public void bayar(String jenis){
        setJenis(jenis);

        int harga;
        System.out.println("---- Pembayaran Parkir ----");
        System.out.println("Jenis Kendaraan :     " + jenis);
        System.out.println("Lama Parkir     :     " + lama);


        if(Objects.equals(jenis, "Mobil")){
            harga = lama * 5000;
        }
        else if(Objects.equals(jenis, "Motor")){
            harga = lama * 2000;
        }
        else{
            harga = lama * 9000;
        }
        if(lama >= 5){
            double total = harga * 0.9;
            harga = (int)total;
        }
        else{
            System.out.println("Biaya Total     :     " + "Rp" + harga + ",0");
            setTotal_penuh(harga);
        }

    }
    public void bayar(String jenis, int jam_masuk, int jam_keluar){
        setJenis(jenis);
        lama = jam_keluar - jam_masuk;
        int harga;
        System.out.println("---- Pembayaran Parkir ----");
        System.out.println("Jenis Kendaraan :     " + jenis);
        System.out.println("Lama Parkir     :     " + lama);


        if(Objects.equals(jenis, "Mobil")){
            harga = lama * 5000;
        }
        else if(Objects.equals(jenis, "Motor")){
            harga = lama * 2000;
        }
        else{
            harga = lama * 9000;
        }
        if(lama >= 5){
            double total = harga * 0.9;
            harga = (int)total;
        }
        else{
            System.out.println("Biaya Total     :     " + "Rp" + harga + ",0");
            setTotal_penuh(harga);
        }
    }
    public void totalParkir(int count){
        System.out.println("====== HASIL AKHIR ======");
        System.out.println("Jumlah Kendaraan         : " + count);
        System.out.println("Total Biaya Parkir       : " + getTotal_penuh() + ".0");
        System.out.println();
        System.out.println("Terima Kasih telah mengunjungi");
    }


    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public int getTotal_penuh() {
        return total_penuh;
    }

    public void setTotal_penuh(int total_penuh) {
        this.total_penuh = this.total_penuh + total_penuh;
    }

    public int getLama() {
        return lama;
    }

    public void setLama(int lama) {
        if(lama >= 0){
            this.lama = lama;
        }
        else{
            System.out.println("Lama parkir tidak boleh negatif");
        }
    }
}
