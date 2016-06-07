package baitap4_1;

import java.util.Scanner;

public class SoSanh2So {

	public static void main(String[] args) {

		int a, b, Ketqua;
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập vào giá trị a: ");
		a=input.nextInt();
		System.out.print("Nhập vào giá trị b: ");
		b=input.nextInt();
		input.close();
		
		Ketqua = Math.max(a, b);
		System.out.println("Giá trị lớn nhất giữa hai số a và b là: " + Ketqua);
		
	}

}
