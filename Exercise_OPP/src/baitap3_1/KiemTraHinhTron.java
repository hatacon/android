package baitap3_1;

public class KiemTraHinhTron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HinhTron hinhtron1 = new HinhTron();
		HinhTron hinhtron2 = new HinhTron(4);
		HinhTron hinhtron3 = new HinhTron(2, "Blue");
		
		System.out.println("H�nh tr�n 1:\n"+hinhtron1.LayThongTin());
		System.out.println("H�nh tr�n 2:\n"+hinhtron2.LayThongTin());
		System.out.println("H�nh tr�n 3:\n"+hinhtron3.LayThongTin());

	}

}
