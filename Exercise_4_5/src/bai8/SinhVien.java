package bai8;

public class SinhVien {
	private String maSV;
	private String hoten;
	private String quequan;
	private double diemTB;
	private String ngaysinh;
	private String email;

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		if (maSV.length() < 7) {
			System.out.println("Mã sinh viên phải chứa 8 ký tự.");
		} else
			this.maSV = maSV;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getQuequan() {
		return quequan;
	}

	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		if (diemTB < 0.0 || diemTB > 10.0)
			System.out.println("Điểm trung bình không hợp lệ.");
		else
			this.diemTB = diemTB;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		int dem = 0;
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@' && email.charAt(i) != ' ') {
				dem = 1;
			}
		}
		if (dem == 1) {
			this.email = email;
		} else {
			System.out.println("Email không hợp lệ.");
		}
	}

}
