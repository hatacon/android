package bai12;

public class RightTriangle extends Shape {
	private int canhvuong;

	public int getCanhvuong() {
		return canhvuong;
	}

	public void setCanhvuong(int canhvuong) {
		if (canhvuong >= 1 && canhvuong <= 20) {
			this.canhvuong = canhvuong;
		}
	}

	public RightTriangle(int canhvuong) {
		super();
		this.canhvuong = canhvuong;
	}

	public RightTriangle() {
		super();
	}

}
