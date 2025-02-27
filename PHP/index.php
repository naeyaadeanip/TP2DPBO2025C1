<?php
include "Baju.php";

//membuat objek
$list = [];
$list[0] = new Baju('1', 'Max', '20000000', '4', 'golden.jpg', 'Baju', 'Katun', 'Hitam', 'Anjing', 'M', 'H&M');
$list[1] = new Baju('2', 'Whiskers', '150000', '10', 'golden.jpg', 'Baju', 'Poliester', 'Putih', 'Kucing', 'S', 'Uniqlo');
$list[2] = new Baju('3', 'Tweety', '300000', '7', 'golden.jpg', 'Baju', 'Wol', 'Kuning', 'Burung', 'L', 'Zara');
$list[3] = new Baju('4', 'Speedy', '500000', '5', 'golden.jpg', 'Baju', 'Linen', 'Hijau', 'Kura - Kura', 'XL', 'Gucci');
$list[4] = new Baju('5', 'Bubbles', '250000', '8', 'golden.jpg', 'Baju', 'Denim', 'Biru', 'Anjing', 'M', 'Levi\'s');

?>
<table border="1px" style="border-collapse: collapse; width: 100%; text-align: center;">
    <tr>
        <th style="min-width: 50px;">ID</th>
        <th style="min-width: 150px;">Nama Produk</th>
        <th style="min-width: 100px;">Harga Produk</th>
        <th style="min-width: 80px;">Stok Produk</th>
        <th style="min-width: 120px;">Foto Produk</th>
        <th style="min-width: 100px;">Jenis</th>
        <th style="min-width: 100px;">Bahan</th>
        <th style="min-width: 100px;">Warna</th>
        <th style="min-width: 100px;">Untuk</th>
        <th style="min-width: 100px;">Size</th>
        <th style="min-width: 100px;">Merk</th>
    </tr>
    <?php
    //menampilkan data
    echo "Data Awal";
    echo "<br>";
    echo "<br>";
        foreach ($list as $item){
    ?>
        <tr>
            <td><?= $item->getID() ?></td>
            <td><?= $item->getNamaProduk() ?></td>
            <td><?= $item->getHargaProduk() ?></td>
            <td><?= $item->getStokProduk() ?></td>
            <td><img width="50px" src="<?= $item->getFotoProduk() ?>" alt="foto" style="display: block; margin: auto;"></td>
            <td><?= $item->getJenis() ?></td>
            <td><?= $item->getBahan() ?></td>
            <td><?= $item->getWarna() ?></td>
            <td><?= $item->getUntuk() ?></td>
            <td><?= $item->getSize() ?></td>
            <td><?= $item->getMerk() ?></td>
        </tr>
    <?php
        }
    ?>
</table>

<br>
<br>
<br>

<?php
//menambahkan data
echo "Berhasil Menambahkan Data";
echo "<br>";
$list[5] = new Baju('6', 'Rocky', '750000', '12', 'golden.jpg', 'Baju', 'Sutra', 'Merah', 'Anjing', 'L', 'Versace');
$list[6] = new Baju('7', 'Luna', '950000', '6', 'golden.jpg', 'Baju', 'Rayon', 'Abu-abu', 'Kucing', 'S', 'Prada');
?>

<br>

<table border="1px" style="border-collapse: collapse; width: 100%; text-align: center;">
    <tr>
        <th style="min-width: 50px;">ID</th>
        <th style="min-width: 150px;">Nama Produk</th>
        <th style="min-width: 100px;">Harga Produk</th>
        <th style="min-width: 80px;">Stok Produk</th>
        <th style="min-width: 120px;">Foto Produk</th>
        <th style="min-width: 100px;">Jenis</th>
        <th style="min-width: 100px;">Bahan</th>
        <th style="min-width: 100px;">Warna</th>
        <th style="min-width: 100px;">Untuk</th>
        <th style="min-width: 100px;">Size</th>
        <th style="min-width: 100px;">Merk</th>
    </tr>
    <?php
        foreach ($list as $item){
    ?>
        <tr>
            <td><?= $item->getID() ?></td>
            <td><?= $item->getNamaProduk() ?></td>
            <td><?= $item->getHargaProduk() ?></td>
            <td><?= $item->getStokProduk() ?></td>
            <td><img width="50px" src="<?= $item->getFotoProduk() ?>" alt="foto" style="display: block; margin: auto;"></td>
            <td><?= $item->getJenis() ?></td>
            <td><?= $item->getBahan() ?></td>
            <td><?= $item->getWarna() ?></td>
            <td><?= $item->getUntuk() ?></td>
            <td><?= $item->getSize() ?></td>
            <td><?= $item->getMerk() ?></td>
        </tr>
    <?php
        }
    ?>
</table>