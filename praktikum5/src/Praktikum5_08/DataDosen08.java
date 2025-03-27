package Praktikum5_08;

class DataDosen08 {
    Dosen08[] dataDosen08 = new Dosen08[10];
    int idx08 = 0;

    void tambah08(Dosen08 dsn08) {
        if (idx08 < dataDosen08.length) {
            dataDosen08[idx08] = dsn08;
            idx08++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil08() {
        if (idx08 == 0) {
            System.out.println("Belum ada data dosen.");
        } else {
            System.out.println("\n===== Data Dosen =====");
            for (int i = 0; i < idx08; i++) {
                dataDosen08[i].tampil08();
            }
        }
    }

    void sortingASC08() {
        for (int i = 0; i < idx08 - 1; i++) {
            for (int j = 0; j < idx08 - 1 - i; j++) {
                if (dataDosen08[j].usia08 > dataDosen08[j + 1].usia08) {
                    Dosen08 temp08 = dataDosen08[j];
                    dataDosen08[j] = dataDosen08[j + 1];
                    dataDosen08[j + 1] = temp08;
                }
            }
        }
        System.out.println("Data berhasil diurutkan (ASC).");
    }

    void findSequentialSearchNama(String nama) {
        boolean found = false;
        int count = 0;

        for (int i = 0; i < idx08; i++) {
            if (dataDosen08[i].nama08.equalsIgnoreCase(nama)) {
                dataDosen08[i].tampil08();
                found = true;
                count++;
            }
        }

        if (!found) {
            System.out.println("Data dosen dengan nama '" + nama + "' tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama '" + nama + "'.");
        }
    }

    void findBinarySearchUsia(int usia) {
        int left = 0, right = idx08 - 1;
        boolean found = false;
        int count = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (dataDosen08[mid].usia08 == usia) {
                found = true;

                int i = mid;
                while (i >= 0 && dataDosen08[i].usia08 == usia) {
                    dataDosen08[i].tampil08();
                    count++;
                    i--;
                }

                i = mid + 1;
                while (i < idx08 && dataDosen08[i].usia08 == usia) {
                    dataDosen08[i].tampil08();
                    count++;
                    i++;
                }

                break;
            } else if (dataDosen08[mid].usia08 > usia) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Data dosen dengan usia " + usia + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia " + usia + ".");
        }
    }
}
