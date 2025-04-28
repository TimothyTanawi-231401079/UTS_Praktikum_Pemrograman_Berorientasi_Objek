package soal1;

public class classA {
    private String id;
    private String nama;
    private String posisi;
    private int gaji;
    private String tanggal;

    public classA(String id, String nama, String posisi, int gaji, String tanggal){
        this.id = id;
        this.nama = nama;
        this.posisi = posisi;
        this.tanggal = tanggal;
        setGaji(gaji);

    }

    public String getId() { //Berikan id karyawan
        return id;
    }

    public void setId(String id) { //Masukkan id karyawan
        this.id = id;
    }

    public String getNama() { //Berikan nama karyawan
        return nama;
    }

    public void setNama(String nama) { //Masukkan nama karyawan
        this.nama = nama;
    }

    public String getPosisi() { //Berikan posisi karyawan
        return posisi;
    }

    public void setPosisi(String posisi) { //Masukkan posisi karyawan
        this.posisi = posisi;
    }

    public int getGaji() { //Berikan gaji karyawan
        return gaji;
    }

    public void setGaji(int gaji) { //Masukkan gaji karyawan
        if (gaji > 0) {
            this.gaji = gaji;
        }
        else {
            setId(null);
        }
    }

    public String getTanggal() { //Berikan tanggal masuk karyawan
        return tanggal;
    }

    public void setTanggal(String tanggal) { //Masukkan tanggal masuk karyawan
        this.tanggal = tanggal;
    }

}
