class Tabungan extends PenyimpananUang {

    public Tabungan(double saldoAwal, double tingkatBunga) {
        super(saldoAwal, tingkatBunga);
    }

    public void setorTunai(double nominal) {
        saldo += nominal;
    }

    public void tarikTunai(double nominal) {
        if (nominal <= saldo) {
            saldo -= nominal;
        } else {
            System.out.println("Saldo tidak cukup!");
        }
    }

}
