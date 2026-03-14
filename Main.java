public class Main {
    public static void main(String[] args) {
        
        Penulis writer3 = new Penulis("Stella");
        
        Buku book3 = new Buku("Internet of Things", "Buku ini membahas tentang IoT", writer3);
        Buku book4 = new Buku("Keamanan Siber", "Buku ini membahas keamanan siber", writer3);
        
        book3.tampilkanBuku();
        
        System.out.println("presentase kesamaan: " + book3.cekKesamaan(book4) + "%");
        
        Buku book5 = book3.copy();
        
        System.out.println("hasil copy buku: ");
        book5.tampilkanBuku();
    }
}
