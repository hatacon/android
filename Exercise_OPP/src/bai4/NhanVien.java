package bai4;

public class NhanVien {

	String maNV;
	int soSP;
	
	public NhanVien() {
		super();
	}

	public NhanVien(String maNV, int soSP) {
		super();
		this.maNV = maNV;
		if(soSP<0)
		{
			this.soSP = 0;
		}
		else
		{
			this.soSP = soSP;
		}
	}

	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public int getSoSP() {
		return soSP;
	}
	public void setSoSP(int soSP) {
		if(soSP < 0)
		{
			this.soSP = 0;
		}
		else
		{
			this.soSP = soSP;
		}
	}
	
	public boolean coVuotChuan(){
		if(soSP>500)
			return true;
		else
			return false;
	}
	public String getTongKet() {
		if(coVuotChuan() == true)
			return "Vượt";
		else
			return "";
	}
	public double getLuong() {
		if(coVuotChuan() == true)
			return (soSP-500)*30000 + 500*20000;
		else
			return soSP*20000;
	}
	
	public static void XuatTieuDe(){
		System.out.println("Mã nhân viên \tSố sản phẩm \tLương \t\tTổng kết");
	}
	
	public String toString(){
		return maNV + "\t\t"+soSP + "\t\t"+getLuong() + "\t\t"+getTongKet();
	}
	
}
