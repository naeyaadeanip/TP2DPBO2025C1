<?php
include "Aksesoris.php";
class Baju extends Aksesoris{
    private $untuk = "";
    private $size = "";
    private $merk = "";
    function __construct($id, $nama, $harga, $stok, $foto, $jenis, $bahan, $warna, $untuk, $size, $merk){
        $this->setID($id);
        $this->setNamaProduk($nama);
        $this->setHargaProduk($harga);
        $this->setStokProduk($stok);
        $this->setFotoProduk($foto);
        $this->setJenis($jenis);
        $this->setBahan($bahan);
        $this->setWarna($warna);
        $this->untuk = $untuk;
        $this->size = $size;
        $this->merk = $merk;
    }
    function setUntuk($untuk){
        $this->untuk = $untuk;
    }
    function setSize($size){
        $this->size = $size;
    }
    function setMerk($merk){
        $this->merk = $merk;
    }
    function getUntuk(){
        return $this->untuk;
    }
    function getSize(){
        return $this->size;
    }
    function getMerk(){
        return $this->merk;
    }
}
?>