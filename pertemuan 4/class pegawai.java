class Pegawai {
    private int nip;
    private String nama;

    public Pegawai(int nip_pegawai) {
        this(nip_pegawai, "NoName");
    }

    public Pegawai(int nip_pegawai, String nama_pegawai) {
        this.nip = nip_pegawai;
        this.nama = nama_pegawai;
    }

    // Method to print the details of the Pegawai object
    public void printDetails() {
        System.out.println("NIP: " + this.nip);
        System.out.println("Nama: " + this.nama);
    }

    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai(12345, "azalia");
        pegawai1.printDetails();

        Pegawai pegawai2 = new Pegawai(67890);
        pegawai2.printDetails();
    }
}