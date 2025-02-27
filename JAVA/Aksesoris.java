//jenis, bahan, warna

class Aksesoris extends PetShop{
    private String jenis;
    private String bahan;
    private String warna;

    Aksesoris(){
        this.jenis = "";
        this.bahan = "";
        this.warna = "";
    };

    Aksesoris(String Jenis, String Bahan, String Warna){
        this.jenis = Jenis;
        this.bahan = Bahan;
        this.warna = Warna;
    }

    void setJenis(String Jenis){
        this.jenis = Jenis;
    }
    void setBahan(String Bahan){
        this.bahan = Bahan;
    }
    void setWarna(String Warna){
        this.warna = Warna;
    }

    String getJenis(){
        return this.jenis;
    }
    String getBahan(){
        return this.bahan;
    }
    String getWarna(){
        return this.warna;
    }
};