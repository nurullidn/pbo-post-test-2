/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitas;

/**
 *
 * @author Asus
 */
public final class Barang {
    private final int kodeBarang;
    private String nama;
    private double harga;

    public Barang(int kodeBarang, String nama, double harga) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.harga = harga;
    }

    public int getKodeBarang() {
        return kodeBarang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public final void setHarga(double harga) {
        this.harga = harga;
    }
}
