
import entities.Kategori;
import repository.BukuRepository;
import services.BukuService;

public class Main {

    public static void main(String[] args) {
        // Initialize repository & service
        BukuRepository bukuRepository = new BukuRepository();
        BukuService bukuService = new BukuService(bukuRepository);
        // Initialize categories object
        Kategori kategoriTeknologi = new Kategori("Teknologi");
        Kategori kategoriFilsafat = new Kategori("Filsafat");
        Kategori kategoriSejarah = new Kategori("Sejarah");
        Kategori kategoriAgama = new Kategori("Agama");
        Kategori kategoriPsikologi = new Kategori("Psikologi");
        Kategori kategoriPolitik = new Kategori("Politik");
        Kategori kategoriFiksi = new Kategori("Fiksi");
        // Teknologi
        bukuService.tambahBuku("B-001", "Intoducing to Java", "Thoriq Farrel M", 2020, kategoriTeknologi);
        bukuService.tambahBukuDuaPenulis("B-002", "Tutorial SQL", "Thoriq Farrel M", "Budi Wicaksono", 2023, kategoriTeknologi);
        bukuService.tambahBuku("B-003", "How to Compile My Golang?", "Scarya Haldis", 2021, kategoriTeknologi);
        bukuService.tambahBukuDuaPenulis("B-004", "Backend Tutorial for Beginner", "Thoriq Farrel M", "James Bond", 2019, kategoriTeknologi);
        bukuService.tambahBuku("B-005", "Node JS Tutorial", "Xavier Jase", 2018, kategoriTeknologi);
        // Filsafat
        bukuService.tambahBuku("B-006", "Filsafat Barat Klasik", "Budi Wicaksono", 2022, kategoriFilsafat);
        bukuService.tambahBuku("B-007", "Etika dan Moral", "Scarya Haldis", 2018, kategoriFilsafat);
        bukuService.tambahBukuDuaPenulis("B-008", "Pemikiran Modern", "James Bond", "Xavier Jase", 2025, kategoriFilsafat);
        bukuService.tambahBuku("B-009", "Madilog", "Tan Malaka", 1980, kategoriFilsafat);
        bukuService.tambahBuku("B-010", "Logika Filosofis", "Budi Wicaksono", 2020, kategoriFilsafat);
        // Sejarah
        bukuService.tambahBuku("B-011", "Sejarah Indonesia Kuno", "Bortotelo Xavier", 1998, kategoriSejarah);
        bukuService.tambahBuku("B-012", "Mein Kampf", "Adolf Hitler", 1925, kategoriSejarah);
        bukuService.tambahBuku("B-013", "The History of Sumatra", "William Marsden", 1810, kategoriSejarah);
        bukuService.tambahBukuDuaPenulis("B-014", "The Jakarta Method", "Vincent", "Bevins", 2020, kategoriSejarah);
        bukuService.tambahBuku("B-015", "Sejarah Asia Tenggara", "Pedri Jose", 2007, kategoriSejarah);
        // Agama
        bukuService.tambahBuku("B-016", "Studi Al-Quran", "Davina Berlianne", 1990, kategoriAgama);
        bukuService.tambahBukuDuaPenulis("B-017", "Filsafat Agama", "Aldeba Azka", "Nawira", 2020, kategoriAgama);
        bukuService.tambahBukuDuaPenulis("B-018", "Etika dalam Agama", "Ascarya Haldis", "James Bond", 2019, kategoriAgama);
        bukuService.tambahBuku("B-019", "Sejarah Peradaban Islam", "Mark Jarvis", 2019, kategoriAgama);
        bukuService.tambahBuku("B-020", "Tasawuf Modern", "Aldeba Azka", 2018, kategoriAgama);
        // Psikologi
        bukuService.tambahBuku("B-021", "Aku Gila, Aku Bahagia", "Davina Berlianne", 2007, kategoriPsikologi);
        bukuService.tambahBuku("B-022", "Bernegoisasi Seolah Nyawa Anda Taruhannya", "Chris Voss", 2020, kategoriPsikologi);
        bukuService.tambahBukuDuaPenulis("B-023", "Psikologi Perkembangan", "Xavier Jase", "Mark Jarvis", 2017, kategoriPsikologi);
        bukuService.tambahBuku("B-024", "Psikologi Kognitif, Gila!", "Davina Berlianner", 2012, kategoriPsikologi);
        bukuService.tambahBuku("B-025", "Ini Mentalku", "Haldist Muhammad", 2016, kategoriPsikologi);
        // Politik
        bukuService.tambahBuku("B-026", "Politik Indonesia", "Bortotelo Xavi", 2020, kategoriPolitik);
        bukuService.tambahBukuDuaPenulis("B-027", "Sejarah Gelap Java", "Ascarya Haldis", "Davina Berlianne", 2014, kategoriPolitik);
        bukuService.tambahBukuDuaPenulis("B-028", "Sejarah PKI", "Max Xavier", "Muhammad aitd", 2015, kategoriPolitik);
        bukuService.tambahBuku("B-029", "Hubungan Politik", "Pedri Pororo", 2020, kategoriPolitik);
        bukuService.tambahBukuDuaPenulis("B-030", "Politik Bagimu,Ku", "Zaki Alfiansya", "Loet Santoso", 2017, kategoriPolitik);
        // Fiksi
        bukuService.tambahBuku("B-031", "About You", "Tere Liye", 2016, kategoriFiksi);
        bukuService.tambahBuku("B-032", "HELLO", "Tere Liye", 2023, kategoriFiksi);
        bukuService.tambahBuku("B-033", "Bumi Manusia", "Pramoedya Ananta Toer", 1980, kategoriFiksi);
        bukuService.tambahBuku("B-034", "Sabariah", "Abdul Malik", 2020, kategoriFiksi);
        bukuService.tambahBukuDuaPenulis("B-035", "The Alchemist", "Paulo Coelho", "Coelho", 2019, kategoriFiksi);

        // Display by Category
        System.out.println("\nDAFTAR BUKU PERPUSTAKAAN");
        bukuService.tampilkanBukuPerKategori("Teknologi");
        bukuService.tampilkanBukuPerKategori("Filsafat");
        bukuService.tampilkanBukuPerKategori("Sejarah");
        bukuService.tampilkanBukuPerKategori("Agama");
        bukuService.tampilkanBukuPerKategori("Psikologi");
        bukuService.tampilkanBukuPerKategori("Politik");
        bukuService.tampilkanBukuPerKategori("Fiksi");

    }
}
