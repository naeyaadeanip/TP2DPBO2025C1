//jenis, bahan, warna

#include <iostream>
#include <string>
#include "PetShop.cpp"

using namespace std;

class Aksesoris : public PetShop{
    private:
        string jenis;
        string bahan;
        string warna;
    
    public:
        Aksesoris(){
            setID("");
            setNama("");
            setHarga("");
            setStok("");
            jenis = "";
            bahan = "";
            warna = "";
        };

        Aksesoris(string ID, string Nama, string Harga, string Stok, string Jenis, string Bahan, string Warna){
            setID(ID);
            setNama(Nama);
            setHarga(Harga);
            setStok(Stok);
            jenis = Jenis;
            bahan = Bahan;
            warna = Warna;
        };

        void setJenis(string Jenis){
            jenis = Jenis;
        };

        void setBahan(string Bahan){
            bahan = Bahan;
        };

        void setWarna(string Warna){
            warna = Warna;
        };

        string getJenis(){
            return jenis;
        };

        string getBahan(){
            return bahan;
        };

        string getWarna(){
            return warna;
        };

        ~Aksesoris(){
        }
};