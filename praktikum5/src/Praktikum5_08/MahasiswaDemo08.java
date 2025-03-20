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

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (ASC) menggunakan Selection Sort: ");
        list.selectionSort();
        list.tampil();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC) menggunakan Insertion Sort: ");
        list.insertionSort();
        list.tampil();

        input.close();
    }
}
