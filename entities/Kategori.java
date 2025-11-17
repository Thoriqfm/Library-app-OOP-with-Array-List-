package entities;

public class Kategori {

    private String nameKategori; // Data : nama kategori (Teknolgi, Filsafat, dll)

    public Kategori(String nameKategori) {
        this.nameKategori = nameKategori;
    }

    public String getNameKategori() {
        return nameKategori;
    }
}
