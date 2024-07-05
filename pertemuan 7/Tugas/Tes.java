class Tes {
    public static void main(String[] args) {
        Truk truk1 = new Truk();
        truk1.setJmlRoda(4);
        truk1.setWarna("kuning");
        truk1.setBahanBakar("solar");
        truk1.setKapasitasMesin(1500);
        truk1.setMuatanMaks(1000);

        Truk truk2 = new Truk();
        truk2.setJmlRoda(6);
        truk2.setWarna("merah");
        truk2.setBahanBakar("solar");
        truk2.setKapasitasMesin(2000);
        truk2.setMuatanMaks(5000);

        Taksi taksi1 = new Taksi();
        taksi1.setJmlRoda(4);
        taksi1.setWarna("oranye");
        taksi1.setBahanBakar("bensin");
        taksi1.setKapasitasMesin(1500);
        taksi1.setTarifAwal(10000);
        taksi1.setTarifPerKm(5000);

        Taksi taksi2 = new Taksi();
        taksi2.setJmlRoda(4);
        taksi2.setWarna("biru");
        taksi2.setBahanBakar("bensin");
        taksi2.setKapasitasMesin(1300);
        taksi2.setTarifAwal(7000);
        taksi2.setTarifPerKm(3500);

        Sepeda sepeda1 = new Sepeda();
        sepeda1.setJmlRoda(3);
        sepeda1.setWarna("hitam");
        sepeda1.setJmlSadel(1);
        sepeda1.setJmlGir(2);

        Sepeda sepeda2 = new Sepeda();
        sepeda2.setJmlRoda(2);
        sepeda2.setWarna("putih");
        sepeda2.setJmlSadel(2);
        sepeda2.setJmlGir(5);

        // Display data for each object
        System.out.println("Truk1: " + truk1.getJmlRoda() + " roda, warna " + truk1.getWarna() +
                ", bahan bakar " + truk1.getBahanBakar() + ", kapasitas mesin " + truk1.getKapasitasMesin() +
                ", muatan maks " + truk1.getMuatanMaks());
        System.out.println("Truk2: " + truk2.getJmlRoda() + " roda, warna " + truk2.getWarna() +
                ", bahan bakar " + truk2.getBahanBakar() + ", kapasitas mesin " + truk2.getKapasitasMesin() +
                ", muatan maks " + truk2.getMuatanMaks());
        System.out.println("Taksi1: " + taksi1.getJmlRoda() + " roda, warna " + taksi1.getWarna() +
                ", bahan bakar " + taksi1.getBahanBakar() + ", kapasitas mesin " + taksi1.getKapasitasMesin() +
                ", tarif awal " + taksi1.getTarifAwal() + ", tarif per km " + taksi1.getTarifPerKm());
        System.out.println("Taksi2: " + taksi2.getJmlRoda() + " roda, warna " + taksi2.getWarna() +
                ", bahan bakar " + taksi2.getBahanBakar() + ", kapasitas mesin " + taksi2.getKapasitasMesin() +
                ", tarif awal " + taksi2.getTarifAwal() + ", tarif per km " + taksi2.getTarifPerKm());
        System.out.println("Sepeda1: " + sepeda1.getJmlRoda() + " roda, warna " + sepeda1.getWarna() +
                ", jumlah sadel " + sepeda1.getJmlSadel() + ", jumlah gir " + sepeda1.getJmlGir());
        System.out.println("Sepeda2: " + sepeda2.getJmlRoda() + " roda, warna " + sepeda2.getWarna() +
                ", jumlah sadel " + sepeda2.getJmlSadel() + ", jumlah gir " + sepeda2.getJmlGir());
    }
}