class Tabungan {

    private double saldo;
    private double saldoProteksi;

    public Tabungan(double saldoAwal, double saldoProteksi) {
        this.saldo = saldoAwal;
        this.saldoProteksi = saldoProteksi;
    }

    public boolean ambilUang(double nominal) {
        if (nominal <= saldo - saldoProteksi) {
            saldo -= nominal;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoProteksi() {
        return saldoProteksi;
    }

    public void setSaldoProteksi(double saldoProteksi) {
        this.saldoProteksi = saldoProteksi;
    }

}

