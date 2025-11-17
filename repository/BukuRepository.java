package repository;

import entities.*;
import java.util.ArrayList;
import java.util.List;

public class BukuRepository {

    // Database : Menyimpan semua buku 
    private List<Buku> daftarBuku = new ArrayList<>();

    // Method : ambil semua buku (Return Copy)
    public List<Buku> getAllBuku() {
        return new ArrayList<>(daftarBuku);
    }

    // Method : cari buku berdasarkan kategori
    public List<Buku> getBukuByKategori(String namaKategori) {
        List<Buku> result = new ArrayList<>();
        for (Buku buku : daftarBuku) { // Mengambil data dari daftarBuku
            if (buku.getKategori().getNameKategori().equalsIgnoreCase(namaKategori)) {
                result.add(buku);
            }
        }
        return result;
    }

    // Method : Tambah buku ke database
    public void addBuku(Buku buku) {
        daftarBuku.add(buku);
    }
}
