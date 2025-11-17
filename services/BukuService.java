package services;

import entities.*;
import java.util.List;
import repository.BukuRepository;

public class BukuService {

    // Depedency : repository untuk akses data
    private BukuRepository bukuRepository;

    // Constructor
    public BukuService(BukuRepository bukuRepository) {
        this.bukuRepository = bukuRepository;
    }

    // Method logic : tambah buku (1 penulis)
    public void tambahBuku(String isbn, String judul, String penulis, int tahunTerbit, Kategori kategori) {
        // Buat objek baru -> simpan ke repository
        Buku buku = new Buku(isbn, judul, penulis, tahunTerbit, kategori);
        bukuRepository.addBuku(buku);
    }

    // Method logic : tambah buku (2 penulis)
    public void tambahBukuDuaPenulis(String isbn, String judul, String penulis1, String penulis2, int tahunTerbit, Kategori kategori) {
        // Buat objek baru -> simpan ke repository
        Buku buku = new Buku(isbn, judul, penulis1, penulis2, tahunTerbit, kategori);
        bukuRepository.addBuku(buku);
    }

    // Method : ambil semua buku 
    public List<Buku> getAllBuku() {
        return bukuRepository.getAllBuku();
    }

    // Method : ambil buku by kategori
    public List<Buku> getBukuByKategori(String nameKategori) {
        return bukuRepository.getBukuByKategori(nameKategori);
    }

    // Method logic : tampilkan buku per kategori
    public void tampilkanBukuPerKategori(String nameKategori) {
        // 1. Ambil data dari repository
        List<Buku> bukuList = getBukuByKategori(nameKategori);
        // 2. Header
        System.out.println("Kategori : " + nameKategori);
        // 3. Loop dan tampilkan setiap buku 
        for (Buku buku : bukuList) { // mengambil data dari bukulist
            System.out.println("- " + buku.getIsbn() + " (" + buku.getJudul() + ") - " + buku.getPenulis() + " " + buku.getTahunTerbit());
        }
        System.out.println(); // baris kosong tiap kategori
    }
}
