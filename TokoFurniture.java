package com.mycompany.tokofurniture;

import java.util.ArrayList;
import java.util.Scanner;
import entitas.Barang;

public final class TokoFurniture {
    private static int kodeBarang = 1;
    public final static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("====================");
            System.out.println("TOKO FURNITURE JAYA");
            System.out.println("====================");
            System.out.println("MENU");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Data Barang");
            System.out.println("3. Hapus Barang");
            System.out.println("4. Edit Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Untuk membersihkan karakter newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama barang: ");
                    String namaBarang = scanner.nextLine();
                    System.out.print("Masukkan harga barang: ");
                    double hargaBarang = scanner.nextDouble();
                    daftarBarang.add(new Barang(kodeBarang++, namaBarang, hargaBarang));
                    break;
                case 2:
                    System.out.println("Daftar Barang:");
                    for (Barang barang : daftarBarang) {
                        System.out.println("Nama: " + barang.getNama() + ", Harga: " + barang.getHarga());
                    }
                    break;
                    
                case 3:
                    System.out.print("Masukkan nama barang yang akan dihapus: ");
                    String namaHapus = scanner.nextLine();
                    Barang barangHapus = null;

                    for (Barang barang : daftarBarang) {
                        if (barang.getNama().equalsIgnoreCase(namaHapus)) {
                            barangHapus = barang;
                            break;
                        }
                    }

                    if (barangHapus != null) {
                        daftarBarang.remove(barangHapus);
                        System.out.println("Barang berhasil dihapus.");
                    } else {
                        System.out.println("Barang tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama barang yang akan diedit: ");
                    String namaEdit = scanner.nextLine();
                    boolean barangDitemukan = false;

                    for (Barang barang : daftarBarang) {
                        if (barang.getNama().equalsIgnoreCase(namaEdit)) {
                            System.out.print("Masukkan nama baru: ");
                            String namaBaru = scanner.nextLine();
                            System.out.print("Masukkan harga baru: ");
                            double hargaBaru = scanner.nextDouble();

                            barang.setNama(namaBaru);
                            barang.setHarga(hargaBaru);
                            barangDitemukan = true;
                            System.out.println("Barang berhasil diubah.");
                            break;
                        }
                    }

                    if (!barangDitemukan) {
                        System.out.println("Barang tidak ditemukan.");
                    }
                    break;

                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        
        
        scanner.close();
    }
}
    
