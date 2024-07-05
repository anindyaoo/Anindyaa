PenyimpananUang {

    protected double saldo;
    protected double tingkatBunga;

    public PenyimpananUang(double saldoAwal, double tingkatBunga) {
        this.saldo = saldoAwal;
        this.tingkatBunga = tingkatBunga;
    }

    public double hitungBunga() {
        return saldo * tingkatBunga;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTingkatBunga() {
        return tingkatBunga;
    }

    public void setTingkatBunga(double tingkatBunga) {
        this.tingkatBunga = tingkatBunga;
    }

}
