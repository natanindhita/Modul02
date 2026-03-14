class Buku {
    String judul;
    String sinopsis;
    Penulis penulis;
    
    Buku(String judul, String sinopsis, Penulis penulis) {
        this.judul = judul;
        this.sinopsis = sinopsis;
        this.penulis = penulis;
    }
    
    int hitungJumlahKata() {
        String[] kata = sinopsis.split(" ");
        return kata.length;
    }
    
    int cekKesamaan(Buku bukuLain) {
        int sama = 0;
        int total = 3;
        
        if (this.judul.equals(bukuLain.judul)) {
            sama++;
        }
        
        if (this.sinopsis.equals(bukuLain.sinopsis)) {
            sama++;
        }
        
        if (this.penulis.nama.equals(bukuLain.penulis.nama)) {
            sama++;
        }
        
        return (sama * 100) / total;
    }
    
    Buku copy() {
        return new Buku(this.judul, this.sinopsis, this.penulis);
    }
    
    void tampilkanBuku() {
        System.out.println("judul buku: " + judul);
        System.out.println("penulis: " + penulis.nama);
        System.out.println("sinopsis: " + sinopsis);
        System.out.println("jumlah kata sinopsis: " + hitungJumlahKata());
        System.out.println();
    }
}