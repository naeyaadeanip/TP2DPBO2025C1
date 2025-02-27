import java.util.Scanner;
import java.util.ArrayList;

class main {
    public static void main(String[] args) {
        int exit = 0;
        int menu = 0;

        String id, nama, jenis, bahan, warna, untuk, size, merk;
        int harga, stok;
        ArrayList<Baju> listBaju = new ArrayList<>();

        Baju baju1 = new Baju("1", "Max", 20000000, 4, "Baju", "Katun", "Hitam", "Anjing", "M", "H&M");
        listBaju.add(baju1);

        Baju baju2 = new Baju("2", "Whiskers", 150000, 10, "Baju", "Poliester", "Putih", "Kucing", "S", "Uniqlo");
        listBaju.add(baju2);

        Baju baju3 = new Baju("3", "Tweety", 300000, 7, "Baju", "Wol", "Kuning", "Burung", "L", "Zara");
        listBaju.add(baju3);

        Baju baju4 = new Baju("4", "Speedy", 500000, 5, "Baju", "Linen", "Hijau", "Kura-kura", "XL", "Gucci");
        listBaju.add(baju4);

        Baju baju5 = new Baju("5", "Bubbles", 250000, 8, "Baju", "Denim", "Biru", "Ikan", "M", "Levi's");
        listBaju.add(baju5);
        
        String newline = System.lineSeparator();
        Scanner scan = new Scanner(System.in);

        while (exit == 0) { // looping menu
            menu = 0;
            System.out.println("Pilih Menu:" + newline);
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Keluar");
            menu = scan.nextInt();

            if (menu == 1) {
                System.out.println("Masukkan ID: ");
                id = scan.next();

                System.out.println("Masukkan Nama Produk: ");
                nama = scan.next();

                System.out.println("Masukkan Harga Produk: ");
                harga = scan.nextInt();

                System.out.println("Masukkan Stok Produk: ");
                stok = scan.nextInt();

                System.out.println("Masukkan Jenis: ");
                jenis = scan.next();

                System.out.println("Masukkan Bahan: ");
                bahan = scan.next();

                System.out.println("Masukkan Warna: ");
                warna = scan.next();

                System.out.println("Masukkan Untuk: ");
                untuk = scan.next();

                System.out.println("Masukkan Size: ");
                size = scan.next();

                System.out.println("Masukkan Merk: ");
                merk = scan.next();

                Baju temp = new Baju();
                temp.setID(id);
                temp.setNama(nama);
                temp.setHarga(harga);
                temp.setStok(stok);
                temp.setJenis(jenis);
                temp.setBahan(bahan);
                temp.setWarna(warna);
                temp.setUntuk(untuk);
                temp.setSize(size);
                temp.setMerk(merk);

                listBaju.add(temp);
                System.out.println("Data Berhasil Ditambahkan" + newline);
            } else if (menu == 2) {
                if (listBaju.size() == 0) {
                    System.out.println(newline + "Data Kosong" + newline);
                } else {
                    System.out.println(newline + "Data Produk" + newline);
                    int[] panjang = {2, 11, 12, 11, 5, 5, 5, 5, 4, 4};

                    for (Baju baju : listBaju) {
                        if (panjang[0] < baju.getID().length()) panjang[0] = baju.getID().length();
                        if (panjang[1] < baju.getNama().length()) panjang[1] = baju.getNama().length();
                        if (panjang[2] < String.valueOf(baju.getHarga()).length()) panjang[2] = String.valueOf(baju.getHarga()).length();
                        if (panjang[3] < String.valueOf(baju.getStok()).length()) panjang[3] = String.valueOf(baju.getStok()).length();
                        if (panjang[4] < baju.getJenis().length()) panjang[4] = baju.getJenis().length();
                        if (panjang[5] < baju.getBahan().length()) panjang[5] = baju.getBahan().length();
                        if (panjang[6] < baju.getWarna().length()) panjang[6] = baju.getWarna().length();
                        if (panjang[7] < baju.getUntuk().length()) panjang[7] = baju.getUntuk().length();
                        if (panjang[8] < baju.getSize().length()) panjang[8] = baju.getSize().length();
                        if (panjang[9] < baju.getMerk().length()) panjang[9] = baju.getMerk().length();
                    }

                    System.out.print("+");
                    for (int i = 0; i < panjang[0] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[1] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[2] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[3] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[4] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[5] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[6] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[7] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[8] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[9] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.println("+");

                    System.out.print("| ID");
                    for (int i = 0; i < panjang[0] - 1; i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Nama Produk");
                    for (int i = 0; i < panjang[1] - 10; i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Harga Produk");
                    for (int i = 0; i < panjang[2] - 11; i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Stok Produk");
                    for (int i = 0; i < panjang[3] - 10; i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Jenis");
                    for (int i = 0; i < panjang[4] - 4; i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Bahan");
                    for (int i = 0; i < panjang[5] - 4; i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Warna");
                    for (int i = 0; i < panjang[6] - 4; i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Untuk");
                    for (int i = 0; i < panjang[7] - 4; i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Size");
                    for (int i = 0; i < panjang[8] - 3; i++) {
                        System.out.print(" ");
                    }
                    System.out.print("| Merk");
                    for (int i = 0; i < panjang[9] - 3; i++) {
                        System.out.print(" ");
                    }
                    System.out.println("|");

                    // Garis tengah
                    System.out.print("+");
                    for (int i = 0; i < panjang[0] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[1] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[2] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[3] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[4] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[5] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[6] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[7] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[8] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[9] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.println("+");

                    for (Baju baju : listBaju) {
                        System.out.print("| " + baju.getID());
                        for (int i = 0; i < panjang[0] + 1 - baju.getID().length(); i++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + baju.getNama());
                        for (int i = 0; i < panjang[1] + 1 - baju.getNama().length(); i++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + baju.getHarga());
                        for (int i = 0; i < panjang[2] + 1 - String.valueOf(baju.getHarga()).length(); i++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + baju.getStok());
                        for (int i = 0; i < panjang[3] + 1 - String.valueOf(baju.getStok()).length(); i++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + baju.getJenis());
                        for (int i = 0; i < panjang[4] + 1 - baju.getJenis().length(); i++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + baju.getBahan());
                        for (int i = 0; i < panjang[5] + 1 - baju.getBahan().length(); i++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + baju.getWarna());
                        for (int i = 0; i < panjang[6] + 1 - baju.getWarna().length(); i++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + baju.getUntuk());
                        for (int i = 0; i < panjang[7] + 1 - baju.getUntuk().length(); i++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + baju.getSize());
                        for (int i = 0; i < panjang[8] + 1 - baju.getSize().length(); i++) {
                            System.out.print(" ");
                        }
                        System.out.print("| " + baju.getMerk());
                        for (int i = 0; i < panjang[9] + 1 - baju.getMerk().length(); i++) {
                            System.out.print(" ");
                        }
                        System.out.println("|");
                    }

                    // Garis bawah
                    System.out.print("+");
                    for (int i = 0; i < panjang[0] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[1] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[2] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[3] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[4] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[5] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[6] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[7] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[8] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.print("+");
                    for (int i = 0; i < panjang[9] + 2; i++) {
                        System.out.print("-");
                    }
                    System.out.println("+");
                }
            } else if (menu == 3) {
                exit = 1;
            } else {
                System.out.println(newline + "Menu Tidak Tersedia" + newline);
            }
        }
        scan.close();
    }
}