package baitap3_1;

public class KiemTraHinhTron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HinhTron hinhtron1 = new HinhTron();
		HinhTron hinhtron2 = new HinhTron(4);
		HinhTron hinhtron3 = new HinhTron(2, "Blue");
		
		System.out.println("Hình tròn 1:\n"+hinhtron1.LayThongTin());
		System.out.println("Hình tròn 2:\n"+hinhtron2.LayThongTin());
		System.out.println("Hình tròn 3:\n"+hinhtron3.LayThongTin());

	}

}
