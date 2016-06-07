package bai4;

public class KiemTra {

	public static void main(String[] args) {
		
		NhanVien nv1 = new NhanVien("01", 400);
		NhanVien nv2 = new NhanVien("02", 510);
	
		NhanVien.XuatTieuDe();
		System.out.println(nv1.toString());
		System.out.println(nv2.toString());
		
	}

}
