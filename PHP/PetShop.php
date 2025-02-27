<?php
class PetShop{
    private $id;
    private $nama_produk;
    private $harga_produk;
    private $stok_produk;
    private $foto_produk;

    public function __construct($id, $nama, $harga, $stok, $foto){
        $this->id = $id;
        $this->nama_produk = $nama;
        $this->harga_produk = $harga;
        $this->stok_produk = $stok;
        $this->foto_produk = $foto;
    }

    function setID($id){
        $this->id = $id;
    }
    function setNamaProduk($nama){
        $this->nama_produk = $nama;
    }
    function setHargaProduk($harga){
        $this->harga_produk = $harga;
    }
    function setStokProduk($stok){
        $this->stok_produk = $stok;
    }
    function setFotoProduk($foto){
        $this->foto_produk = $foto;
    }

    function getID(){
        return $this->id;
    }
    function getNamaProduk(){
        return $this->nama_produk;
    }
    function getHargaProduk(){
        return $this->harga_produk;
    }
    function getStokProduk(){
        return $this->stok_produk;
    }
    function getFotoProduk(){
        return $this->foto_produk;
    }
}
?>