class Pembayaran extends Transaksi {

    public double hitungDiskon() {
        return hitungTotal() * 0.1;
    }

    public double hitungPajak() {
        return hitungTotal() * 0.05;
    }

    public double hitungTotalBayar() {
        return hitungTotal() - hitungDiskon() + hitungPajak();
    }
}