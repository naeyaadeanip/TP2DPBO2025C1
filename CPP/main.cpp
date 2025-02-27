#include <bits/stdc++.h>
#include "Baju.cpp"
#include <cstdio>

using namespace std;

int main(){
    int i, fungsi = 0;
    int exit = 0;

    string ID, Nama, Harga, Stok, Jenis, Bahan, Warna, Untuk, Size, Merk;
    Baju temp;

    list<Baju> listBaju{
        Baju("1", "Max", "20000000", "4", "Baju", "Katun", "Hitam", "Anjing", "M", "H&M"),
        Baju("2", "Whiskers", "150000", "10", "Baju", "Poliester", "Putih", "Kucing", "S", "Uniqlo"),
        Baju("3", "Tweety", "300000", "7", "Baju", "Wol", "Kuning", "Burung", "L", "Zara"),
        Baju("4", "Speedy", "500000", "5", "Baju", "Linen", "Hijau", "Kura-kura", "XL", "Gucci"),
        Baju("5", "Bubbles", "250000", "8", "Baju", "Denim", "Biru", "Ikan", "M", "Levi's")
    };

    do{
        cout << "\nPilih Menu: " << endl;
        cout << "1. Tambah Data" << endl;
        cout << "2. Tampilkan Data" << endl;
        cout << "3. Keluar" << endl;

        cout << "Pilih: ";
        cin >> fungsi;

        if(fungsi == 1){
            cout << "Masukan ID: ";
            cin >> ID;
            cout << "Masukan Nama Produk: ";
            cin >> Nama;
            cout << "Masukan Harga Produk: ";
            cin >> Harga;
            cout << "Masukan Stok Produk: ";
            cin >> Stok;
            cout << "Masukan Jenis: ";
            cin >> Jenis;
            cout << "Masukan Bahan: ";
            cin >> Bahan;
            cout << "Masukan Warna: ";
            cin >> Warna;
            cout << "Masukan Untuk: ";
            cin >> Untuk;
            cout << "Masukan Size: ";
            cin >> Size;
            cout << "Masukan Merk: ";
            cin >> Merk;

            temp.setID(ID);
            temp.setNama(Nama);
            temp.setHarga(Harga);
            temp.setStok(Stok);
            temp.setJenis(Jenis);
            temp.setBahan(Bahan);
            temp.setWarna(Warna);
            temp.setUntuk(Untuk);
            temp.setSize(Size);
            temp.setMerk(Merk);

            listBaju.push_back(temp);
        }
        else if(fungsi == 2){
            if(listBaju.empty()){
                cout << "Data Kosong" << endl;
            }else{
                cout << "Data Baju: " << endl;
                int panjang[10] = {2, 11, 12, 11, 5, 5, 5, 5, 4, 4};
                for(list<Baju>::iterator it = listBaju.begin(); it != listBaju.end(); it++){
                    if(it->getID().length() > panjang[0]){
                        panjang[0] = it->getID().length();
                    }
                    if(it->getNama().length() > panjang[1]){
                        panjang[1] = it->getNama().length();
                    }
                    if(it->getHarga().length() > panjang[2]){
                        panjang[2] = it->getHarga().length();
                    }
                    if(it->getStok().length() > panjang[3]){
                        panjang[3] = it->getStok().length();
                    }
                    if(it->getJenis().length() > panjang[4]){
                        panjang[4] = it->getJenis().length();
                    }
                    if(it->getBahan().length() > panjang[5]){
                        panjang[5] = it->getBahan().length();
                    }
                    if(it->getWarna().length() > panjang[6]){
                        panjang[6] = it->getWarna().length();
                    }
                    if(it->getUntuk().length() > panjang[7]){
                        panjang[7] = it->getUntuk().length();
                    }
                    if(it->getSize().length() > panjang[8]){
                        panjang[8] = it->getSize().length();
                    }
                    if(it->getMerk().length() > panjang[9]){
                        panjang[9] = it->getMerk().length();
                    }
                    
                }
                //atas
                cout << "+";
                for(i = 0; i < panjang[0] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[1] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[2] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[3] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[4] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[5] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[6] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[7] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[8] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[9] + 2; i++){
                    cout << "-";
                }
                cout << "+" << endl;

                

                cout << "| ID";
                for(i = 0; i < panjang[0] - 1; i++){
                    cout << " ";
                }
                cout << "| Nama Produk";
                for(i = 0; i < panjang[1] - 10; i++){
                    cout << " ";
                }
                cout << "| Harga Produk";
                for(i = 0; i < panjang[2] - 11; i++){
                    cout << " ";
                }
                cout << "| Stok Produk";
                for(i = 0; i < panjang[3] - 10; i++){
                    cout << " ";
                }
                cout << "| Jenis";
                for(i = 0; i < panjang[4] - 4; i++){
                    cout << " ";
                }
                cout << "| Bahan";
                for(i = 0; i < panjang[5] - 4; i++){
                    cout << " ";
                }
                cout << "| Warna";
                for(i = 0; i < panjang[6] - 4; i++){
                    cout << " ";
                }
                cout << "| Untuk";
                for(i = 0; i < panjang[7] - 4; i++){
                    cout << " ";
                }
                cout << "| Size";
                for(i = 0; i < panjang[8] - 3; i++){
                    cout << " ";
                }
                cout << "| Merk";
                for(i = 0; i < panjang[9] - 3; i++){
                    cout << " ";
                }
                cout << "|";
                
                cout << endl;
                //tengah
                cout << "+";
                for(i = 0; i < panjang[0] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[1] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[2] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[3] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[4] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[5] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[6] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[7] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[8] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[9] + 2; i++){
                    cout << "-";
                }
                cout << "+" << endl;

                for(list<Baju>::iterator it = listBaju.begin(); it != listBaju.end(); it++){
                    cout << "| " << it->getID();
                    for(i = 0; i < panjang[0] - it->getID().length() + 1; i++){
                        cout << " ";
                    }
                    cout << "| " << it->getNama();
                    for(i = 0; i < panjang[1] - it->getNama().length() + 1; i++){
                        cout << " ";
                    }
                    cout << "| " << it->getHarga();
                    for(i = 0; i < panjang[2] - it->getHarga().length() + 1; i++){
                        cout << " ";
                    }
                    cout << "| " << it->getStok();
                    for(i = 0; i < panjang[3] - it->getStok().length() + 1; i++){
                        cout << " ";
                    }
                    cout << "| " << it->getJenis();
                    for(i = 0; i < panjang[4] - it->getJenis().length() + 1; i++){
                        cout << " ";
                    }
                    cout << "| " << it->getBahan();
                    for(i = 0; i < panjang[5] - it->getBahan().length() + 1; i++){
                        cout << " ";
                    }
                    cout << "| " << it->getWarna();
                    for(i = 0; i < panjang[6] - it->getWarna().length() + 1; i++){
                        cout << " ";
                    }
                    cout << "| " << it->getUntuk();
                    for(i = 0; i < panjang[7] - it->getUntuk().length() + 1; i++){
                        cout << " ";
                    }
                    cout << "| " << it->getSize();
                    for(i = 0; i < panjang[8] - it->getSize().length() + 1; i++){
                        cout << " ";
                    }
                    cout << "| " << it->getMerk();
                    for(i = 0; i < panjang[9] - it->getMerk().length() + 1; i++){
                        cout << " ";
                    }
                    cout << "|" << endl;
                }
                
                //bawah
                cout << "+";
                for(i = 0; i < panjang[0] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[1] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[2] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[3] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[4] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[5] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[6] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[7] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[8] + 2; i++){
                    cout << "-";
                }
                cout << "+";
                for(i = 0; i < panjang[9] + 2; i++){
                    cout << "-";
                }
                cout << "+" << endl;
            }
            fflush(stdin);
            getchar();
        }else if(fungsi == 3){
            exit = 1;
        }else{
            cout << "Menu Tidak Tersedia" << endl;
        }
    }while(fungsi != 3);
    return 0;
}