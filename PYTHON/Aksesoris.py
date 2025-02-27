#jenis, bahan, warna

from PetShop import PetShop

class Aksesoris(PetShop):
    __jenis = ""
    __bahan = ""
    __warna = ""

    def __init__(self):
        self.__id = ""
        self.__nama_produk = ""
        self.__harga_produk = 0
        self.__stok_produk = 0
        self.__jenis = ""
        self.__bahan = ""
        self.__warna = ""

    def setJenis(self, jenis):
        self.__jenis = jenis
    def setBahan(self, bahan):
        self.__bahan = bahan
    def setWarna(self, warna):
        self.__warna = warna

    def getJenis(self):
        return self.__jenis
    def getBahan(self):
        return self.__bahan
    def getWarna(self):
        return self.__warna