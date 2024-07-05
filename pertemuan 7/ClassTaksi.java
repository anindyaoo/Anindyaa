 class Taksi extends Kendaraan{
	//4123001
	protected int tarifAwal;
	protected int tarifPerkm;
	
	public void setTarifAwal (int tarifAwal){
		this.tarifAwal = tarifAwal;
	}
	public int getTarifAwal(){
		return tarifAwal;
	}
	public void setTarifPerkm (int tarifPerkm){
		this.tarifPerkm= tarifPerkm;
	}
	public int getTarifPerkm (){
		return tarifPerkm;
	} 
	public void setTarifPerkm(int i){}
	public String getTarifPerkm(){
		return null;
	}
}