class TesLatihan {

    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan(5000, 8.5/100);

        System.out.println("Uang yang ditabung : Rp5.000");
        System.out.println("Tingkat bunga sekarang : 8.5%");
        System.out.println("Total uang anda sekarang : Rp" + tabungan.getSaldo());

        tabungan.setorTunai(1000);
        System.out.println("Saldo setelah setor tunai : Rp" + tabungan.getSaldo());

        tabungan.tarikTunai(3000);
        System.out.println("Saldo setelah tarik tunai : Rp" + tabungan.getSaldo());
    }

}
