package prepareExam07;

// Class itu Blueprint
public class Pohon {
//	Private
	private int daun;
	private int batang;
	private int ranting;
	
	public Pohon(int daun,int batang,int ranting){
		this.daun = daun;
		this.batang = batang;
		this.ranting = ranting;
		System.out.println(this.daun + " " + this.batang + " " + this.ranting);
	}
//	Getter
	public int getDaun() {
		return daun;
	}
//	Setter
	public int setDaun(int daun) {
		return this.daun = daun;
	}
	public int getBatang() {
		return batang;
	}
	public void setBatang(int batang) {
		this.batang = batang;
	}
	public int getRanting() {
		return ranting;
	}
	public void setRanting(int ranting) {
		this.ranting = ranting;
	}
		
//	Static itu biasa global, indepedent terhadap suatu instance
	public int menyerang(int ranting) {
		return this.ranting = ranting*2;
	}
}
