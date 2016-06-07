package bai6;

public class Address {

	private String tenDuong;
	private String thanhPho;
	private String quan;
	private long maVung;
	
	public Address(String tenDuong, String thanhPho, String quan, long maVung) {
		this.tenDuong = tenDuong;
		this.thanhPho = thanhPho;
		this.quan = quan;
		this.maVung = maVung;
	}
	public String getTenDuong() {
		return tenDuong;
	}
	public void setTenDuong(String tenDuong) {
		this.tenDuong = tenDuong;
	}
	public String getThanhPho() {
		return thanhPho;
	}
	public void setThanhPho(String thanhPho) {
		this.thanhPho = thanhPho;
	}
	public String getQuan() {
		return quan;
	}
	public void setQuan(String quan) {
		this.quan = quan;
	}
	public long getMaVung() {
		return maVung;
	}
	public void setMaVung(long maVung) {
		this.maVung = maVung;
	}
	
	public String toString() {
		return "Dia chi: \nTen duong: "+ tenDuong + "\nThanh pho: " + thanhPho + "\nQuan: "+quan+ "\nMa vung: "+ maVung;
	}
	
}
