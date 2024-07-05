import java.util.Map;  
import java.util.HashMap;

class MultiTabungan {

    // saldo disimpan dalam IDR
    private int saldo;

    // Konstruktor
    public MultiTabungan(int initsaldo) {
        this.saldo = initsaldo;
    }

    // Mendapatkan saldo dalam IDR
    public int getSaldo() {
        return saldo;
    }

    // Menyimpan jumlah dalam mata uang yang dipilih
    public void simpanUang(String mataUang, int jumlah) {
        if (mataUang.equalsIgnoreCase("USD")) {
            saldo += 9000 * jumlah;
        } else if (mataUang.equalsIgnoreCase("AUD")) {
            saldo += 10000 * jumlah;
        } else if (mataUang.equalsIgnoreCase("IDR")) {
            saldo += jumlah;
        } else {
            System.out.println("Mata uang tidak valid.");
        }
    }

    // Menarik jumlah dalam mata uang yang dipilih
    public boolean ambilUang(String mataUang, int jumlah) {
        int jumlahIDR = 0;
        if (mataUang.equalsIgnoreCase("USD")) {
            jumlahIDR = 9000 * jumlah;
        } else if (mataUang.equalsIgnoreCase("AUD")) {
            jumlahIDR = 10000 * jumlah;
        } else if (mataUang.equalsIgnoreCase("IDR")) {
            jumlahIDR = jumlah;
        } else {
            System.out.println("Mata uang tidak valid.");
            return false;
        }

        if (saldo >= jumlahIDR) {
            saldo -= jumlahIDR;
            return true;
        } else {
            System.out.println("Saldo tidak cukup.");
            return false;
        }
    }

    // This is the main method, the entry point of your program (optional for compilation, but required to run)
    public static void main(String[] args) {
        MultiTabungan rekening = new MultiTabungan(1000000);

        rekening.simpanUang("AUD", 10);

        System.out.println("Saldo: " + rekening.getSaldo() + " IDR");

        if (rekening.ambilUang("IDR", 1000000)) {
            System.out.println("Penarikan berhasil.");
        }

        rekening.simpanUang("USD", 10);

        System.out.println("Saldo: " + rekening.getSaldo() + " IDR");

        if (rekening.ambilUang("USD", 10)) {
            System.out.println("Penarikan berhasil.");
        }
    }
}
