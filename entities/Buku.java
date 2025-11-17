package entities;

public class Buku {

    private String isbn;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private Kategori kategori;

    // Constructor untuk 1 penulis
    public Buku(String isbn, String judul, String penulis, int tahunTerbit, Kategori kategori) {
        this.isbn = isbn;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
    }

    // Constructor untuk 2 penulis
    public Buku(String isbn, String judul, String penulis1, String penulis2, int tahunTerbit, Kategori kategori) {
        this.isbn = isbn;
        this.judul = judul;
        this.penulis = penulis1 + " & " + penulis2;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
    }

    // Getter method : akses data buku
    public String getIsbn() {
        return isbn;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public Kategori getKategori() {
        return kategori;
    }

}
