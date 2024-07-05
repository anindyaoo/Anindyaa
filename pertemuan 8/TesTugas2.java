class TestTugas2 {

    public static void main(String[] args) {
        // Buat objek Katak
        Katak froggy = new Katak(5, "Froggy");

        // Buat objek Kecebong
        Kecebong juniorFrog = new Kecebong(2, "Junior Frog", 10);

        // Tampilkan informasi objek
        System.out.println("Nama: " + froggy.getNama());
        System.out.println("Umur: " + froggy.getUmur());
        System.out.println("Cara Bergerak: " + froggy.caraBergerak());

        System.out.println("Nama: " + juniorFrog.getNama());
        System.out.println("Umur: " + juniorFrog.getUmur());
        System.out.println("Cara Bergerak: " + juniorFrog.caraBergerak());
        System.out.println("Panjang Ekor: " + juniorFrog.getPanjangEkor());
    }
}

class Katak {

    private int umur;
    private String nama;

    public Katak(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String caraBergerak() {
        return "melompat";
    }
}

class Kecebong extends Katak {

    private double panjangEkor;

    public Kecebong(int umur, String nama, double panjangEkor) {
        super(umur, nama);
        this.panjangEkor = panjangEkor;
    }

    public double getPanjangEkor() {
        return panjangEkor;
    }

    public void setPanjangEkor(double panjangEkor) {
        this.panjangEkor = panjangEkor;
    }

    @Override
    public String caraBergerak() {
        return "berenang";
    }
}
