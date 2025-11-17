**📚 Koleksi Buku Perpustakaan - Clean Architecture Implementation**

Sebuah aplikasi manajemen buku perpustakaan yang mengimplementasikan Clean Architecture dengan pemisahan layer yang jelas menggunakan Java.

**🏗️ Struktur Arsitektur**

src/

├── 📦 entities/           # Domain Layer

│   ├── 📄 Buku.java      # Entity Buku

│   └── 📄 Kategori.java  # Entity Kategori

├── 📦 repository/         # Data Access Layer  

│   └── 📄 BukuRepository.java  # Data Storage & Retrieval

├── 📦 services/          # Business Logic Layer

│   └── 📄 BukuService.java     # Business Rules & Use Cases

└── 📄 Main.java          # Presentation Layer

**📋 Diagram Alur Data**

Main (Presentation)
        ↓
BukuService (Business Logic)
        ↓  
BukuRepository (Data Access)
        ↓
Entities (Domain Models)

**🎯 Penjelasan Per Layer**

**1. 🎪 Domain Layer (entities/)**

Layer inti yang berisi business objects dan aturan domain.

Kategori.java

- Menyimpan data kategori buku

- Menjamin immutability dengan hanya menyediakan getter

Buku.java

- Menyimpan semua atribut buku (ISBN, judul, penulis, tahun, kategori)

- Menangani logika concatenation untuk multiple authors

- Menyediakan akses terkontrol melalui getter methods

**2. 💾 Data Access Layer (repository/)**
   
Layer yang bertanggung jawab untuk penyimpanan dan pengambilan data.

BukuRepository.java

- Menyediakan abstraksi data storage

- Mengimplementasikan CRUD operations

- Menjaga data integrity dengan return copy

- Menyediakan query methods berdasarkan kategori

**3. 🎯 Business Logic Layer (services/)**
   
Layer yang berisi use cases dan business rules aplikasi.

BukuService.java

- Mengkoordinasikan flow aplikasi

- Mengimplementasikan use cases

- Melakukan dependency injection

- Menangani presentation logic

**4. 🎨 Presentation Layer (Main.java)**
   
Layer yang berinteraksi dengan user dan mengkoordinasikan aplikasi.

Main.java

- Menginisialisasi dependencies

- Mengkonfigurasi object graph

- Menangani user interaction

- Mengkoordinasikan flow aplikasi

**🔄 Alur Eksekusi Detail
**
**Phase 1: Initialization**

1. Main membuat BukuRepository (data storage)

2. Main inject repository ke BukuService (business logic)

3. Main membuat objek Kategori (domain objects)

**Phase 2: Data Processing**

4. Main memanggil service untuk menambah buku

5. BukuService membuat objek Buku dengan business rules

6. BukuService delegasi penyimpanan ke repository

7. BukuRepository menyimpan buku ke ArrayList

**Phase 3: Data Retrieval & Presentation**

8. Main meminta service untuk menampilkan data

9. BukuService meminta data filtered ke repository

10. BukuRepository melakukan filtering dan return results

11. BukuService memformat dan menampilkan data

