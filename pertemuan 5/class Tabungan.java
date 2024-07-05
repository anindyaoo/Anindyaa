public class MultiTabungan {

    private int saldoIDR;
    private double kursAUD;
    private double kursUSD;

    public MultiTabungan(int initsaldoIDR, double kursAUD, double kursUSD) {
        this.saldoIDR = initsaldoIDR;
        this.kursAUD = kursAUD;
        this.kursUSD = kursUSD;
    }

    public int getSaldoIDR() {
        return saldoIDR;
    }

    public double getSaldoAUD() {
        return saldoIDR / kursAUD;
    }

    public double getSaldoUSD() {
        return saldoIDR / kursUSD;
    }

    public void simpanUangIDR(int jumlah) {
        saldoIDR += jumlah;
    }

    **public void simpanUangAUD(double jumlah) {**
        saldoIDR += (int) (jumlah * kursAUD);
    **}**

    **public void simpanUangUSD(double jumlah) {**
        saldoIDR += (int) (jumlah * kursUSD);
    **}**

    public boolean ambilUangIDR(int jumlah) {
        if (jumlah <= saldoIDR) {
            saldoIDR -= jumlah;
            return true;
        } else {
            return false;
        }
    }

    public boolean ambilUangAUD(double jumlah) {
        int jumlahIDR = (int) (jumlah * kursAUD);
        if (jumlahIDR <= saldoIDR) {
            saldoIDR -= jumlahIDR;
            return true;
        } else {
            return false;
        }
    }

    public boolean ambilUangUSD(double jumlah) {
        int jumlahIDR = (int) (jumlah * kursUSD);
        if (jumlahIDR <= saldoIDR) {
            saldoIDR -= jumlahIDR;
            return true;
        } else {
            return false;
        }
    }

}

**public class UjiMultiTabungan {**

    public static void main(String[] args) {
        MultiTabungan tabungan = new MultiTabungan(1000000, 10000, 9000);

        System.out.println("Saldo awal (IDR): " + tabungan.getSaldoIDR());
        System.out.println("Saldo awal (AUD): " + tabungan.getSaldoAUD());
        System.out.println("Saldo awal (USD): " + tabungan.getSaldoUSD());

        tabungan.simpanUangIDR(500000);
        System.out.println("Saldo setelah simpan IDR: " + tabungan.getSaldoIDR());

        tabungan.simpanUangAUD(100);
        System.out.println("Saldo setelah simpan AUD: " + tabungan.getSaldoIDR());

        tabungan.ambilUangUSD(50);
        System.out.println("Saldo setelah ambil USD: " + tabungan.getSaldoIDR());
    }

}



