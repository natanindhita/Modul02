public class Main {
    public static void main(String[] args) {
        
        Penulis writer1 = new Penulis("Chiko");
        Penulis writer2 = new Penulis("Abraham");
        Penulis writer3 = new Penulis("Stella");
        Penulis writer4 = new Penulis("James");
        Penulis writer5 = new Penulis("Carmen");
        
        Buku book1 = new Buku("Artificial Intelligence", writer1);
        Buku book2 = new Buku("Jaringan", writer2);
        Buku book3 = new Buku("Internet of Things", writer3);
        Buku book4 = new Buku("Keamanan Siber", writer4);
        Buku book5 = new Buku("Machine Learning", writer5);
        
        Buku[] bukuTeknologi = {book1, book2, book3, book4, book5};
        
        Buku book6 = new Buku("Filasafat Umum", writer1);
        Buku book7 = new Buku("Stoikisme", writer2);
        Buku book8 = new Buku("Filsafat Ilmu", writer3);
        Buku book9 = new Buku("Filsafat Indonesia", writer4);
        Buku book10 = new Buku("Klasik/Barat", writer5);
        
        Buku[] bukuFilsafat = {book6, book7, book8, book9, book10};
        
        Buku book11 = new Buku("Biografi", writer1);
        Buku book12 = new Buku("Sejarah Naratif", writer2);
        Buku book13 = new Buku("Novel Sejarah", writer3);
        Buku book14 = new Buku("Sejarah Akademik", writer4);
        Buku book15 = new Buku("Sejarah Tematik", writer5);
        
        Buku[] bukuSejarah = {book11, book12, book13, book14, book15};
        
        Buku book16 = new Buku("Pengantar Agama", writer1);
        Buku book17 = new Buku("Etika Agama", writer2);
        Buku book18 = new Buku("Agama dan Kehidupan", writer3);
        Buku book19 = new Buku("Nilai Spiritual", writer4);
        Buku book20 = new Buku("Sejarah Agama", writer5);
        
        Buku[] bukuAgama = {book16, book17, book18, book19, book20};
        
        Buku book21 = new Buku("Psikologi Umum", writer1);
        Buku book22 = new Buku("Psikologi Perkembangan", writer2);
        Buku book23 = new Buku("Kesehatan Mental", writer3);
        Buku book24 = new Buku("Kepribadian", writer4);
        Buku book25 = new Buku("Industri dan Organisasi", writer5);
        
        Buku[] bukuPsikologi = {book21, book22, book23, book24, book25};
        
        Buku book26 = new Buku("Filsafat Politik", writer1);
        Buku book27 = new Buku("Pemerintahan", writer2);
        Buku book28 = new Buku("Biografi Politik", writer3);
        Buku book29 = new Buku("Ekonomi Politik", writer4);
        Buku book30 = new Buku("Fiksi Politik", writer5);
        
        Buku[] bukuPolitik = {book26, book27, book28, book29, book30};
        
        Buku book31 = new Buku("Novel", writer1);
        Buku book32 = new Buku("Cerpen", writer2);
        Buku book33 = new Buku("Dongeng", writer3);
        Buku book34 = new Buku("Komik", writer4);
        Buku book35 = new Buku("Fabel", writer5);
        
        Buku[] bukuFiksi = {book31, book32, book33, book34, book35};
        
        Kategori k1 = new Kategori("Teknologi", bukuTeknologi);
        Kategori k2 = new Kategori("Filsafat", bukuFilsafat);
        Kategori k3 = new Kategori("Sejarah", bukuSejarah);
        Kategori k4 = new Kategori("Agama", bukuAgama);
        Kategori k5 = new Kategori("Psikologi", bukuPsikologi);
        Kategori k6 = new Kategori("Politik", bukuPolitik);
        Kategori k7 = new Kategori("Fiksi", bukuFiksi);
         
        k1.tampilkanKategori();
        k2.tampilkanKategori();
        k3.tampilkanKategori();
        k4.tampilkanKategori();
        k5.tampilkanKategori();
        k6.tampilkanKategori();
        k7.tampilkanKategori();
    }
}