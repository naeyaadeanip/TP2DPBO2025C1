#untuk, size, merk

from Aksesoris import Aksesoris

class Baju(Aksesoris):
    __untuk = ""
    __size = ""
    __merk = ""

    def __init__(self):
        self.__id = ""
        self.__nama_produk = ""
        self.__harga_produk = 0
        self.__stok_produk = 0
        self.__jenis = ""
        self.__bahan = ""
        self.__warna = ""
        self.__untuk = ""
        self.__size = ""
        self.__merk = ""

    def setUntuk(self, untuk):
        self.__untuk = untuk
    def setSize(self, size):
        self.__size = size
    def setMerk(self, merk):
        self.__merk = merk

    def getUntuk(self):
        return self.__untuk
    def getSize(self):
        return self.__size
    def getMerk(self):
        return self.__merk