package bai6;

public class Student {
	
	private String ho;
	private String ten;
	private Address dc_nha;
	private Address dc_truong;
	
	
	
	public Student(String ho, String ten, Address dc_nha, Address dc_truong) {
		super();
		this.ho = ho;
		this.ten = ten;
		this.dc_nha = dc_nha;
		this.dc_truong = dc_truong;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Address getDc_nha() {
		return dc_nha;
	}
	public void setDc_nha(Address dc_nha) {
		this.dc_nha = dc_nha;
	}
	public Address getDc_truong() {
		return dc_truong;
	}
	public void setDc_truong(Address dc_truong) {
		this.dc_truong = dc_truong;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Ho: "+ho+"\nTen: "+ ten + "\nDia chi nha:" + dc_nha + "\nDia chi truong: " + dc_truong;
	}
	
}
