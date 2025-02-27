//untuk, size, merk

#include <iostream>
#include <string>
#include "Aksesoris.cpp"

using namespace std;

class Baju : public Aksesoris{
    private:
        string untuk;
        string size;
        string merk;
    
    public:
        Baju(){
            setID("");
            setNama("");
            setHarga("");
            setStok("");
            setJenis("");
            setBahan("");
            setWarna("");
            untuk = "";
            size = "";
            merk = "";
        };

        Baju(string ID, string Nama, string Harga, string Stok, string Jenis, string Bahan, string Warna, string Untuk, string Size, string Merk){
            setID(ID);
            setNama(Nama);
            setHarga(Harga);
            setStok(Stok);
            setJenis(Jenis);
            setBahan(Bahan);
            setWarna(Warna);
            untuk = Untuk;
            size = Size;
            merk = Merk;
        };

        void setUntuk(string Untuk){
            untuk = Untuk;
        };

        void setSize(string Size){
            size = Size;
        };

        void setMerk(string Merk){
            merk = Merk;
        };

        string getUntuk(){
            return untuk;
        };

        string getSize(){
            return size;
        };

        string getMerk(){
            return merk;
        };

        ~Baju(){
        }
};