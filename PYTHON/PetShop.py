#id, nama_produk, harga_produk, stok_produk, foto_produk

class PetShop:
    __id = ""
    __nama_produk = ""
    __harga_produk = 0
    __stok_produk = 0

    def __init__(self):
        self.__id = ""
        self.__nama_produk = ""
        self.__harga_produk = 0
        self.__stok_produk = 0

    def setId(self, id):
        self.__id = id
    def setNama(self, nama):
        self.__nama_produk = nama
    def setHarga(self, harga):
        self.__harga_produk = harga
    def setStok(self, stok):
        self.__stok_produk = stok

    def getId(self):
        return self.__id
    def getNama(self):
        return self.__nama_produk
    def getHarga(self):
        return self.__harga_produk
    def getStok(self):
        return self.__stok_produk