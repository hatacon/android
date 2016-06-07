package baitap3_2;

public class HinhChuNhat {

	double chieuDai;
	double chieuRong;
	
//	phương thức khởi tạo
	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HinhChuNhat(double chieuDai) {
		super();
		this.chieuDai = chieuDai;
	}

	public HinhChuNhat(double chieuDai, double chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
//	phương thức get/set
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	
//	phương thức xử lý
	public double TinhChuVi() {
		return (chieuDai + chieuRong) * 2;
	}
	public double TinhDienTIch() {
		return chieuDai*chieuRong;
	}
	public String LayThongTin() {
		return "Chiều dài: "+chieuDai+"\nChiều rộng: "+chieuRong
				+"\nChu vi: "+TinhChuVi()+"\nDiện tích: "+TinhDienTIch();
	}
	
}
