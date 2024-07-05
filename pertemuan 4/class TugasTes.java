class TesTugas {

    public static void main(String[] args) {
        Bank bank = new Bank();

        // Menambahkan nasabah
        bank.tambahNasabah("Agus", "Daryanto");
        bank.tambahNasabah("Tuti", "Irawan");
        bank.tambahNasabah("Ani", "Ratna");
        bank.tambahNasabah("Bambang", "Darmawan");

        // Menset saldo awal untuk setiap nasabah
        bank.getNasabah(0).setTabungan(new Tabungan(5000));
        bank.getNasabah(1).setTabungan(new Tabungan(7000));
        bank.getNasabah(2).setTabungan(new Tabungan(4000));
        bank.getNasabah(3).setTabungan(new Tabungan(6500));

        // Menampilkan informasi bank dan nasabah
        System.out.println("Jumlah Nasabah = " + bank.getJumlahNasabah());
        System.out.println();

        for (int i = 0; i < bank.getJumlahNasabah(); i++) {
            System.out.println("Nasabah ke-" + (i + 1) + ":");
            System.out.println("  Nama: " + bank.getNasabah(i).getNamaAwal() + " " + bank.getNasabah(i).getNamaAkhir()); // Assuming getNamaAwal and getNamaAkhir exist in Nasabah
            System.out.println("  Saldo: " + bank.getNasabah(i).getTabungan().getSaldo());
            System.out.println();
        }
    }
}

