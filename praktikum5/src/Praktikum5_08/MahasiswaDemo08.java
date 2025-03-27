package Praktikum5_08;

import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine();

        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08(jumlahMahasiswa);

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            System.out.print("IPK: ");
            double ipk = input.nextDouble();
            input.nextLine();

            Mahasiswa08 m = new Mahasiswa08(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC) menggunakan Bubble Sort: ");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC) menggunakan Insertion Sort: ");
        list.insertionSort();
        list.tampil();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (ASC) menggunakan Selection Sort: ");
        list.selectionSort();
        list.tampil();

        System.out.println("--------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = input.nextDouble();

        System.out.println("Menggunakan sequential searching: ");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("-------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari2 = input.nextDouble();
        System.out.println("-------------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-------------------------------------------------");

        double posisi2 = list.findBinarySearch(cari2, 0, jumlahMahasiswa - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari2, pss2);
        list.tampilDataSearch(cari2, pss2);

        input.close();
    }
}
