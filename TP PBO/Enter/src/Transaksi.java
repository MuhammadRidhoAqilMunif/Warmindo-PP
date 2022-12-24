public class Transaksi implements GenerateKodePesan{
    int kode;

    public Transaksi(int kode) {
        this.kode = kode;
    }

    @Override
    public int getKodeTransaksi() {
       return kodeTransaksi - this.kode;
    }
}
