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

    void sortingDSC08() {
        for (int i = 0; i < idx08 - 1; i++) {
            int maxIdx08 = i;
            for (int j = i + 1; j < idx08; j++) {
                if (dataDosen08[j].usia08 > dataDosen08[maxIdx08].usia08) {
                    maxIdx08 = j;
                }
            }
            Dosen08 temp08 = dataDosen08[maxIdx08];
            dataDosen08[maxIdx08] = dataDosen08[i];
            dataDosen08[i] = temp08;
        }
        System.out.println("Data berhasil diurutkan (DSC).");
    }

    void insertionSort08() {
        for (int i = 1; i < idx08; i++) {
            Dosen08 temp08 = dataDosen08[i];
            int j = i;
            while (j > 0 && dataDosen08[j - 1].usia08 < temp08.usia08) {
                dataDosen08[j] = dataDosen08[j - 1];
                j--;
            }
            dataDosen08[j] = temp08;
        }
        System.out.println("Data berhasil diurutkan menggunakan Insertion Sort (DSC).");
    }
}

