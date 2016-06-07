package baitap4_2;

import java.util.Scanner;

public class XuLyChuoi {

	public static void main(String[] args) {

		String a,b;
		boolean ketqua;
		
		Scanner input = new Scanner(System.in);
		System.out. println("Nhập vào chuỗi a: ");
		a = input.nextLine();
		System.out. println("Nhập vào chuỗi b: ");
		b = input.nextLine();
		input.close();
		
		ketqua = a.contains(b);
		System.out.println("Kết quả kiểm tra (0: không thuộc, 1: thuộc): " +ketqua);

	}

}
