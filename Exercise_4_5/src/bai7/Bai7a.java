package bai7;

import java.util.Scanner;

public class Bai7a {

	public static void main(String[] args) {
		String n;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào 1 đoạn văn: ");
		n = input.nextLine();
		input.close();

		int dem = 0;
		// String chuoi = "a";
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == 'a') {
				dem++;
			}
		}
		if (dem == 0) {
			System.out.println("Đoạn văn không có ký tự 'a'.");
		} else {
			System.out.println("Đoạn văn có " + dem + " ký tự 'a'.");
		}
	}

}
