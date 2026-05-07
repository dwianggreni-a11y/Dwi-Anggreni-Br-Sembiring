public class Buku {
    private String nama;
    private double harga;
    private int jumlah;

    public Buku(String nama,double harga,int jumlah){
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    public double hitungSubtotal(){
        return harga * jumlah;
    }

    public String getnama(){
        return nama;
    }

    public int getjumlah(){
        return jumlah;
    }
}
