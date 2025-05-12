package com.juaracoding;

import java.util.Scanner;

public class FilmBioskop {
    public static void main(String[] args) {


    }

    private static class filmBioskop {
        static Scanner input = new Scanner(System.in);
        static String[] daftarFilm = new String[10];
        static int jumlahFilm = 0;

        public static void main(String[] args) {
            // Proses login
            while (!login()) {
                System.out.println("Username atau password salah. Coba lagi.\n");
            }

            int pilihan;
            do {
                tampilkanMenu();
                System.out.print("Pilih: ");
                pilihan = input.nextInt();
                input.nextLine(); // membersihkan buffer

                switch (pilihan) {
                    case 1:
                        tampilkanFilm();
                        break;
                    case 2:
                        inputFilm();
                        break;
                    case 3:
                        cariFilm();
                        break;
                    case 4:
                        System.out.println("Terima kasih telah menggunakan aplikasi.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } while (pilihan != 4);
        }

        // Method login
        static boolean login() {
            System.out.println("=== Login ===");
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();

            if (username.equals("admin") && password.equals("12345")) {
                System.out.println("Login berhasil!\n");
                return true;
            } else {
                return false;
            }
        }

        // Method menu
        static void tampilkanMenu() {
            System.out.println("=== Menu Utama ===");
            System.out.println("1. Tampilkan Daftar Film");
            System.out.println("2. Input Data Film");
            System.out.println("3. Cari Film");
            System.out.println("4. Keluar");
        }

        // Method input film
        static void inputFilm() {
            System.out.print("Masukkan jumlah film: ");
            int jumlah = input.nextInt();
            input.nextLine(); // membersihkan newline

            if (jumlahFilm + jumlah > 10) {
                System.out.println("Kapasitas film melebihi batas (maksimal 10).");
                return;
            }

            for (int i = 0; i < jumlah; i++) {
                System.out.println("Film ke-" + (i + 1));
                System.out.print("Judul: ");
                String judul = input.nextLine();
                daftarFilm[jumlahFilm] = judul;
                jumlahFilm++;
            }
        }

        // Method tampilkan semua film
        static void tampilkanFilm() {
            if (jumlahFilm == 0) {
                System.out.println("Belum ada film yang dimasukkan.");
            } else {
                System.out.println("=== Daftar Film ===");
                for (int i = 0; i < jumlahFilm; i++) {
                    System.out.println((i + 1) + ". " + daftarFilm[i]);
                }
            }
            System.out.println();
        }

        // Method cari film
        static void cariFilm() {
            System.out.print("Masukkan judul film yang dicari: ");
            String keyword = input.nextLine();
            boolean ditemukan = false;

            for (int i = 0; i < jumlahFilm; i++) {
                if (daftarFilm[i].equalsIgnoreCase(keyword)) {
                    System.out.println("Film ditemukan: " + daftarFilm[i]);
                    ditemukan = true;
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Film dengan judul tersebut tidak ditemukan.");
            }
            System.out.println();
        }
    }
}
