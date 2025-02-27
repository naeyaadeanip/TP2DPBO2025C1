//id, nama_produk, harga_produk, stok_produk, foto_produk

#include <iostream>
#include <string>

using namespace std;

class PetShop{
    private:
        string id;
        string nama_produk;
        string harga_produk;
        string stok_produk;

    public:
        PetShop(){
            id = "";
            nama_produk = "";
            harga_produk = "";
            stok_produk = "";
        };

        PetShop(string ID, string Nama, string Harga, string Stok){
            id = ID;
            nama_produk = Nama;
            harga_produk = Harga;
            stok_produk = Stok;
        };

        void setID(string ID){
            id = ID;
        };
        void setNama(string Nama){
            nama_produk = Nama;
        };
        void setHarga(string Harga){
            harga_produk = Harga;
        };
        void setStok(string Stok){
            stok_produk = Stok;
        };

        string getID(){
            return id;
        };
        string getNama(){
            return nama_produk;
        };
        string getHarga(){
            return harga_produk;
        };
        string getStok(){
            return stok_produk;
        }
        ~PetShop(){
        }
};