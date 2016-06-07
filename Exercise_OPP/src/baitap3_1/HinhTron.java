package baitap3_1;

public class HinhTron {

	double bankinh;
	String mausac;
	
//	phương thúc khởi tạo không có tham số
	public HinhTron() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	phương thức khởi tạo có tham số
	public HinhTron(double bankinh) {
		super();
		this.bankinh = bankinh;
	}
	public HinhTron(double bankinh, String mausac) {
		super();
		this.bankinh = bankinh;
		this.mausac = mausac;
	}
	
//	phương thức đặt và lấy giá trị
	public double getBankinh() {
		return bankinh;
	}
	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}
	public String getMausac() {
		return mausac;
	}
	public void setMausac(String mausac) {
		this.mausac = mausac;
	}

//	phương thức tính chu vi
	public double TinhChuVi(double bankinh) {
		return 2*3.14*bankinh;
	}

//	phương thức tính diện tích
	public double TinhDienTich(double bankinh) {
		return 3.14*bankinh*bankinh;
	}

//	phương thức lấy thông tin
	public String LayThongTin() {
		return "Bán kính: "+getBankinh()+"\nMàu sắc: "+getMausac()
				+"\nChu vi: "+TinhChuVi(bankinh)+"\nDiện tích: "+TinhDienTich(bankinh);
	}
	
	
	
}
