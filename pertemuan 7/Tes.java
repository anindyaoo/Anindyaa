class Tes {
	//4123001
	public static void main(String[] args) {
		
		Truk truk1 = new Truk();
		truk1.setJmlRoda(jmlRoda: 4);
		truk1.setWarna(warna: "merah");
		truk1.setBahanBakar(bahanBakar: "solar");
		truk1.setKapasitasMesin(kapasitasMesin: 1600);
		truk1.setMuatanMaxs(muatanMaxs: 1000);
		
		Truk truk2 = new Truk();
		truk2.setJmlRoda(jmlRoda: 6);
		truk2.setWarna(warna: "Ungu");
		truk2.setBahanBakar(bahanBakar: "solar");
		truk2.setKapasitasMesin(kapasitasMesin: 2000);
		truk2.setMuatanMaxs(muatanMaxs: 5000);
		
		Taksi taksi1 = new Taksi();
		taksi1.setJmlRoda(jmlRoda: 4);
		taksi1.setWarna(warna: "hijau");
		taksi1.setBahanBakar(bahanBakar: "bensin");
		taksi1.setTarifAwal(tarifAwal: 10000);
		taksi1.setTarifPerkm(tarifPerkm: 5000);
		
		Taksi taksi2 = new Taksi();
		taksi2.setJmlRoda(jmlRoda: 4);
		taksi2.setWarna(warna: "hijau");
		taksi2.setBahanBakar(bahanBakar: "bensin");
		taksi2.setKapasitasMesin(kapasitasMesin: 1500);
		taksi2.setTarifAwal(tarifAwal: 100);
		taksi2.setTarifPerkm(tarifPerkm: 5000);
		

		Sepeda sepeda1 = new Sepeda();
		sepeda1.setJmlRoda(jmlRoda: 2);
		sepeda1.setWarna(warna: "hitam");
		sepeda1.setJmlSadel(jmlSadel: 1);
		sepeda1.setJmlGir(jmlGir: 5);
		
		Sepeda sepeda2 = new Sepeda();
		sepeda2.setJmlRoda(jmlRoda: 2);
		sepeda2.setWarna(warna: "biru");
		sepeda2.setJmlSadel(jmlSadel: 1);
		sepeda2.setJmlGir(jmlGir: 5);
		
		System.out.println("Data Truk 1");
		System.out.println("Jumlah Roda:"+ truk1.getJmlRoda());
		System.out.println("Warna:"+ truk1.getWarna());
		System.out.println("Bahan Bakar:"+ truk1.getBahanBakar());
		System.out.println("Kapasitas Mesin:"+ truk1.getKapasitasMesin());
		System.out.println("Muatan Maxs:"+ truk1.getMuatanMaxs());

		System.out.println("\nData Truk 2");
		System.out.println("Jumlah Roda:"+ truk2.getJmlRoda());
		System.out.println("Warna:"+ truk2.getWarna());
		System.out.println("Bahan Bakar:"+ truk2.getBahanBakar());
		System.out.println("Kapasitas Mesin:"+ truk2.getKapasitasMesin());
		System.out.println("Muatan Maxs:"+ truk2.getMuatanMaxs());

		System.out.println("\nData Taksi 1");
		System.out.println("Jumlah Roda:"+ taksi1.getJmlRoda());
		System.out.println("Warna:"+ taksi1.getWarna());
		System.out.println("Bahan Bakar:"+ taksi1.getBahanBakar());
		System.out.println("Kapasitas Mesin:"+ taksi1.getKapasitasMesin());
		System.out.println("Tarif Awal:"+ taksi1.getTarifAwal());
		System.out.println("Tarif Perkm:"+ taksi1.getTarifPerkm());

		System.out.println("\nData Taksi 2");
		System.out.println("Jumlah Roda:"+ taksi2.getJmlRoda());
		System.out.println("Warna:"+ taksi2.getWarna());
		System.out.println("Bahan Bakar:"+ taksi2.getBahanBakar());
		System.out.println("Kapasitas Mesin:"+ taksi2.getKapasitasMesin());
		System.out.println("Tarif Awal:"+ taksi2.getTarifAwal());
		System.out.println("Tarif Perkm:"+ taksi2.getTarifPerkm());

		System.out.println("\nData Sepeda 1");
		System.out.println("Jumlah Roda:"+ sepeda1.getJmlRoda());
		System.out.println("Warna:"+ sepeda1.getWarna());
		System.out.println("Jumlah Sadel:"+ sepeda1.getJmlSadel());
		System.out.println("Jumlah Gir:"+ sepeda1.getJmlGir());

		System.out.println("\nData Sepeda 2");
		System.out.println("Jumlah Roda:"+ sepeda2.getJmlRoda());
		System.out.println("Warna:"+ sepeda2.getWarna());
		System.out.println("Jumlah Sadel:"+ sepeda2.getJmlSadel());
		System.out.println("Jumlah Gir:"+ sepeda2.getJmlGir());
	}
}
