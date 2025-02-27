//id, nama_produk, harga_produk, stok_produk, foto_produk

class PetShop{
    private String id;
    private String nama_produk;
    private int harga_produk;
    private int stok_produk;

    PetShop(){
        this.id = "";
        this.nama_produk = "";
        this.harga_produk = 0;
        this.stok_produk = 0;
    };

    PetShop(String ID, String Nama, int Harga, int Stok){
        this.id = ID;
        this.nama_produk = Nama;
        this.harga_produk = Harga;
        this.stok_produk = Stok;
    }

    void setID(String ID){
        this.id = ID;
    }
    void setNama(String Nama){
        this.nama_produk = Nama;
    }
    void setHarga(int Harga){
        this.harga_produk = Harga;
    }
    void setStok(int Stok){
        this.stok_produk = Stok;
    }

    String getID(){
        return this.id;
    }
    String getNama(){
        return this.nama_produk;
    }
    int getHarga(){
        return this.harga_produk;
    }
    int getStok(){
        return this.stok_produk;
    }
};