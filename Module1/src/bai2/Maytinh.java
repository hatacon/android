package bai2;

import java.util.Scanner;

public class Maytinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		int tinhTong, tinhHieu, tinhTich;
		float tinhThuong;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập số a: ");
		a = input.nextInt();
		System.out.print("Nhập số b: ");
		b = input.nextInt();
		input.close();
		
		tinhTong = a + b;
		System.out.println("Tổng của hai số a và b là: " + tinhTong);
		
		tinhHieu = a - b;
		System.out.println("Hiệu của hai số a và b là: " + tinhHieu);		
		
		tinhTich = a * b;
		System.out.println("Tích của hai số a và b là: " + tinhTich);		
		
		tinhThuong = (float)a/b;
		System.out.println("Thương của hai số a và b là: " + tinhThuong);
		
	}

}
