//untuk, size, merk

class Baju extends Aksesoris{
    private String untuk;
    private String size;
    private String merk;

    Baju(){
        this.untuk = "";
        this.size = "";
        this.merk = "";
    };

    Baju(String id, String nama, int harga, int stok, String Jenis, String Bahan, String Warna, String Untuk, String Size, String Merk){
        setID(id);
        setNama(nama);
        setHarga(harga);
        setStok(stok);
        setJenis(Jenis);
        setBahan(Bahan);
        setWarna(Warna);
        this.untuk = Untuk;
        this.size = Size;
        this.merk = Merk;
    }

    void setUntuk(String Untuk){
        this.untuk = Untuk;
    }
    void setSize(String Size){
        this.size = Size;
    }
    void setMerk(String Merk){
        this.merk = Merk;
    }

    String getUntuk(){
        return this.untuk;
    }
    String getSize(){
        return this.size;
    }
    String getMerk(){
        return this.merk;
    }
};