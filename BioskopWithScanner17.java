import java.util.Scanner;

public class BioskopWithScanner17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String next;
        int pilihan;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("Menu 1: Input data penonton");
            System.out.println("Menu 2: Tampilkan daftar penonton");
            System.out.println("Menu 3: Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    boolean validInput = false;
                    while (!validInput) {
                        System.out.print("Masukkan nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan baris: ");
                        int baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        int kolom = sc.nextInt();
                        sc.nextLine();
                        if (baris > 0 && baris <= penonton.length && kolom > 0 && kolom <= penonton[0].length) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Data penonton berhasil dimasukkan.");
                                validInput = true;
                            } else {
                                System.out.println("Kursi sudah terisi! Silakan pilih kursi lain.");
                            }
                        } else {
                            System.out.println("Baris atau kolom tidak valid! Silakan coba lagi.");
                        }
                    }
                    break;
                    case 2:
                    System.out.println("\n=== Daftar Penonton ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": *** (Kosong)");
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            }
                        }
                    }
                    break;
                    case 3:
                    // Exit
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu yang tersedia.");
                    break;
            }
        } while (pilihan != 3);

        sc.close();
       
    }
}