import java.util.Scanner;

public class SIAKAD17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();
        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai untuk mahasiswa ke-" + (i + 1));
            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n===========================");
        for (int i = 0; i < jumlahSiswa; i++) {
            double totalPerSiswa = 0;
            for (int j = 0; j < jumlahMataKuliah; j++) {
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + (totalPerSiswa / jumlahMataKuliah));
        }
        System.out.println("\n===========================");
        System.out.println("Rata-rata nilai per mata kuliah: ");
        for (int j = 0; j < jumlahMataKuliah; j++) {
            double totalMatkul = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                totalMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + ": " + (totalMatkul / jumlahSiswa));
        }
    }
}
