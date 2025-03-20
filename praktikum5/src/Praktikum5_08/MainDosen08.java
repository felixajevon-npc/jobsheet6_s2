package Praktikum5_08;

import java.util.Scanner;

public class MainDosen08 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        DataDosen08 listDosen08 = new DataDosen08();
        int pilihan08;

        do {
            System.out.println("\n===== MENU DATA DOSEN =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Sorting ASC (Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Tertua ke Termuda - Selection Sort)");
            System.out.println("5. Sorting DSC (Tertua ke Termuda - Insertion Sort)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan08 = sc08.nextInt();
            sc08.nextLine();

            switch (pilihan08) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode08 = sc08.nextLine();
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama08 = sc08.nextLine();
                    System.out.print("Masukkan Jenis Kelamin (Laki-laki = true, Perempuan = false): ");
                    boolean jk08 = sc08.nextBoolean();
                    System.out.print("Masukkan Usia: ");
                    int usia08 = sc08.nextInt();
                    listDosen08.tambah08(new Dosen08(kode08, nama08, jk08, usia08));
                    break;

                case 2:
                    listDosen08.tampil08();
                    break;

                case 3:
                    listDosen08.sortingASC08();
                    listDosen08.tampil08();
                    break;

                case 4:
                    listDosen08.sortingDSC08();
                    listDosen08.tampil08();
                    break;

                case 5:
                    listDosen08.insertionSort08();
                    listDosen08.tampil08();
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan08 != 0);

        sc08.close();
    }
}
