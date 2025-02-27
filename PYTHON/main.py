from Baju import Baju

exit = 0
menu = 0

id = 0; nama = ""; harga = 0; stok = 0; jenis = ""; bahan = ""; warna = ""; untuk = ""; size = ""; merk = ""

# Data pertama
temp = Baju()
temp.setId("1")
temp.setNama("Max")
temp.setHarga(20000000)
temp.setStok(4)
temp.setJenis("Baju")
temp.setBahan("Katun")
temp.setWarna("Hitam")
temp.setUntuk("Anjing")
temp.setSize("M")
temp.setMerk("H&M")
listBaju = [temp]

# Data kedua
temp = Baju()
temp.setId("2")
temp.setNama("Whiskers")
temp.setHarga(150000)
temp.setStok(10)
temp.setJenis("Baju")
temp.setBahan("Poliester")
temp.setWarna("Putih")
temp.setUntuk("Kucing")
temp.setSize("S")
temp.setMerk("Uniqlo")
listBaju.append(temp)

# Data ketiga
temp = Baju()
temp.setId("3")
temp.setNama("Tweety")
temp.setHarga(300000)
temp.setStok(7)
temp.setJenis("Baju")
temp.setBahan("Wol")
temp.setWarna("Kuning")
temp.setUntuk("Burung")
temp.setSize("L")
temp.setMerk("Zara")
listBaju.append(temp)

# Data keempat
temp = Baju()
temp.setId("4")
temp.setNama("Speedy")
temp.setHarga(500000)
temp.setStok(5)
temp.setJenis("Baju")
temp.setBahan("Linen")
temp.setWarna("Hijau")
temp.setUntuk("Kura-kura")
temp.setSize("XL")
temp.setMerk("Gucci")
listBaju.append(temp)

# Data kelima
temp = Baju()
temp.setId("5")
temp.setNama("Bubbles")
temp.setHarga(250000)
temp.setStok(8)
temp.setJenis("Baju")
temp.setBahan("Denim")
temp.setWarna("Biru")
temp.setUntuk("Ikan")
temp.setSize("M")
temp.setMerk("Levi's")
listBaju.append(temp)

while exit == 0:
    index = 0
    print("\nPilih Menu")
    print("1. Tambah Data")
    print("2. Tampilkan Data")
    print("3. Keluar")
    menu = input()

    if int(menu) == 1:
        temp = Baju()
        print("Masukkan ID : ")
        id = input()
        print("Masukkan Nama Produk : ")
        nama = input()
        print("Masukkan Harga Produk : ")
        harga = input()
        print("Masukkan Stok Produk : ")
        stok = input()
        print("Masukkan Jenis : ")
        jenis = input()
        print("Masukkan Bahan : ")
        bahan = input()
        print("Masukkan Warna : ")
        warna = input()
        print("Masukkan Untuk : ")
        untuk = input()
        print("Masukkan Size : ")
        size = input()
        print("Masukkan Merk : ")
        merk = input()

        temp.setId(id)
        temp.setNama(nama)
        temp.setHarga(harga)
        temp.setStok(stok)
        temp.setJenis(jenis)
        temp.setBahan(bahan)
        temp.setWarna(warna)
        temp.setUntuk(untuk)
        temp.setSize(size)
        temp.setMerk(merk)

        listBaju.append(temp)
        print("\n Data Berhasil Ditambahkan \n")
    elif int(menu) == 2:
        if len(listBaju) == 0:
            print("\n Data Kosong \n")
        else:
            print("\n Data Baju \n")
            panjang = [2, 11, 12, 11, 5, 5, 5, 5, 4, 4]
            for shop in listBaju:
                if len(shop.getId()) > panjang[0]:
                    panjang[0] = len(shop.getId())
                if len(shop.getNama()) > panjang[1]:
                    panjang[1] = len(shop.getNama())
                if len(str(shop.getHarga())) > panjang[2]:
                    panjang[2] = len(str(shop.getHarga()))
                if len(str(shop.getStok())) > panjang[3]:
                    panjang[3] = len(str(shop.getStok()))
                if len(shop.getJenis()) > panjang[4]:
                    panjang[4] = len(shop.getJenis())
                if len(shop.getBahan()) > panjang[5]:
                    panjang[5] = len(shop.getBahan())
                if len(shop.getWarna()) > panjang[6]:
                    panjang[6] = len(shop.getWarna())
                if len(shop.getUntuk()) > panjang[7]:
                    panjang[7] = len(shop.getUntuk())
                if len(shop.getSize()) > panjang[8]:
                    panjang[8] = len(shop.getSize())
                if len(shop.getMerk()) > panjang[9]:
                    panjang[9] = len(shop.getMerk())

            #bigian atas(header)
            print("+", end = "")
            for i in range(panjang[0] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[1] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[2] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[3] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[4] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[5] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[6] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[7] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[8] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[9] + 2):
                print("-", end = "")
            print("+")

            #bagian tengah
            print("| ID", end = "")
            for i in range(panjang[0] - 1):
                print(" ", end = "")
            print("| Nama Produk", end = "")
            for i in range(panjang[1] - 10):
                print(" ", end = "")
            print("| Harga Produk", end = "")
            for i in range(panjang[2] - 11):
                print(" ", end = "")
            print("| Stok Produk", end = "")
            for i in range(panjang[3] - 10):
                print(" ", end = "")
            print("| Jenis", end = "")
            for i in range(panjang[4] - 4):
                print(" ", end = "")
            print("| Bahan", end = "")
            for i in range(panjang[5] - 4):
                print(" ", end = "")
            print("| Warna", end = "")
            for i in range(panjang[6] - 4):
                print(" ", end = "")
            print("| Untuk", end = "")
            for i in range(panjang[7] - 4):
                print(" ", end = "")
            print("| Size", end = "")
            for i in range(panjang[8] - 3):
                print(" ", end = "")
            print("| Merk", end = "")
            for i in range(panjang[9] - 3):
                print(" ", end = "")
            print("|")

            #bagian bawah
            print("+", end = "")
            for i in range(panjang[0] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[1] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[2] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[3] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[4] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[5] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[6] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[7] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[8] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[9] + 2):
                print("-", end = "")
            print("+")

            #output data
            i = 1
            for shop in listBaju:
                print(f"| {shop.getId()}", end = "")
                for i in range(panjang[0] - len(shop.getId()) + 1):
                    print(" ", end = "")
                print(f"| {shop.getNama()}", end = "")
                for i in range(panjang[1] - len(shop.getNama()) + 1):
                    print(" ", end = "")
                print(f"| {shop.getHarga()}", end = "")
                for i in range(panjang[2] - len(str(shop.getHarga())) + 1):
                    print(" ", end = "")
                print(f"| {shop.getStok()}", end = "")
                for i in range(panjang[3] - len(str(shop.getStok())) + 1):
                    print(" ", end = "")
                print(f"| {shop.getJenis()}", end = "")
                for i in range(panjang[4] - len(shop.getJenis()) + 1):
                    print(" ", end = "")
                print(f"| {shop.getBahan()}", end = "")
                for i in range(panjang[5] - len(shop.getBahan()) + 1):
                    print(" ", end = "")
                print(f"| {shop.getWarna()}", end = "")
                for i in range(panjang[6] - len(shop.getWarna()) + 1):
                    print(" ", end = "")
                print(f"| {shop.getUntuk()}", end = "")
                for i in range(panjang[7] - len(shop.getUntuk()) + 1):
                    print(" ", end = "")
                print(f"| {shop.getSize()}", end = "")
                for i in range(panjang[8] - len(shop.getSize()) + 1):
                    print(" ", end = "")
                print(f"| {shop.getMerk()}", end = "")
                for i in range(panjang[9] - len(shop.getMerk()) + 1):
                    print(" ", end = "")
                print("|")
                i += 1

            #output footer    
            print("+", end = "")
            for i in range(panjang[0] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[1] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[2] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[3] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[4] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[5] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[6] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[7] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[8] + 2):
                print("-", end = "")
            print("+", end = "")
            for i in range(panjang[9] + 2):
                print("-", end = "")
            print("+")
    elif int(menu) == 3:
        exit = 1
    else:
        print("\n Menu Tidak Ada \n")
