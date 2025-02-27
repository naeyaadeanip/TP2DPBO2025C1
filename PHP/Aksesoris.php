<?php
include 'PetShop.php';
class Aksesoris extends PetShop{
    private $jenis = "";
    private $bahan = "";
    private $warna = "";
    function __construct($id, $nama, $harga, $stok, $foto, $jenis, $bahan, $warna){
        $this->setID($id);
        $this->setNamaProduk($nama);
        $this->setHargaProduk($harga);
        $this->setStokProduk($stok);
        $this->setFotoProduk($foto);
        $this->jenis = $jenis;
        $this->bahan = $bahan;
        $this->warna = $warna;
    }
    function setJenis($jenis){
        $this->jenis = $jenis;
    }
    function setBahan($bahan){
        $this->bahan = $bahan;
    }
    function setWarna($warna){
        $this->warna = $warna;
    }
    function getJenis(){
        return $this->jenis;
    }
    function getBahan(){
        return $this->bahan;
    }
    function getWarna(){
        return $this->warna;
    }
}
?>