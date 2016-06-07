package bai6;

public class KiemTra {

	public static void main(String[] args) {
		
		Address dc_nha = new Address("79/2 M3A", "HCM", "4", 8);
		Address dc_truong = new Address("357 Le Hong Phong", "HCM", "10", 8);
		
		Student st = new Student("Ha", "Tan", dc_nha, dc_truong);
		System.out.println(st.toString());
	}

}
