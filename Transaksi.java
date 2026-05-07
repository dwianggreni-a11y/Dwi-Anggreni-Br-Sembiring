 //Dwi Anggreni_2515101034 import java.util.ArrayList;

public class Transaksi {
    protected ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku b){
        daftarBuku.add(b);
    }

     public void tampilBuku() {
        for (Buku b : daftarBuku) {
            System.out.println(b.getnama() + " x " + b.getjumlah());
        }
    }

    public double hitungTotal() {
        double total = 0;
        for (Buku b : daftarBuku) {
            total += b.hitungSubtotal();
        }
        return total;
    }

    
    }

    

