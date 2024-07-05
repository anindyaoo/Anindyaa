class Taksi extends Mobil {
    private int tarifAwal;
    private int tarifPerKm;

    public void setTarifAwal(int tarifAwal) {
        this.tarifAwal = tarifAwal;
    }

    public int getTarifAwal() {
        return tarifAwal;
    }

    public void setTarifPerKm(int tarifPerKm) {
        this.tarifPerKm = tarifPerKm;
    }

    public int getTarifPerKm() {
        return tarifPerKm;
    }
}