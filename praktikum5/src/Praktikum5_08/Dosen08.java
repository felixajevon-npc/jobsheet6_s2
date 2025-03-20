package Praktikum5_08;

class Dosen08 {
    String kode08;
    String nama08;
    boolean jenisKelamin08;
    int usia08;

    Dosen08(String kd08, String name08, boolean jk08, int age08) {
        this.kode08 = kd08;
        this.nama08 = name08;
        this.jenisKelamin08 = jk08;
        this.usia08 = age08;
    }

    void tampil08() {
        System.out.println("Kode Dosen   : " + kode08);
        System.out.println("Nama Dosen   : " + nama08);
        System.out.println("Jenis Kelamin: " + (jenisKelamin08 ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia         : " + usia08 + " tahun");
        System.out.println("------------------------------------");
    }
}
