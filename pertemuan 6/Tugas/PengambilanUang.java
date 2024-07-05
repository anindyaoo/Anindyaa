class PengambilanUang {

    private Tabungan tabungan;

    public PengambilanUang(double saldoAwal, double saldoProteksi) {
        tabungan = new Tabungan(saldoAwal, saldoProteksi);
    }

    public boolean ambilUang(double nominal) {
        return tabungan.ambilUang(nominal);
    }

    public double getSaldo() {
        return tabungan.getSaldo();
    }

}
