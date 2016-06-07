package baitap3_2;

public class KiemTraHinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HinhChuNhat hinhChuNhat = new HinhChuNhat(4, 2);
		HinhVuong hinhVuong = new HinhVuong(3);
		
		System.out.println("Hình chữ nhật:\n"+hinhChuNhat.LayThongTin());
		System.out.println("Hình vuông:\n"+hinhVuong.LayThongTin());
		
		
	}

}
