package baitap5_2;

import java.util.Scanner;

public class NhapXuatMang {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n;
		System.out.print("Nhập số phần tử của mảng: ");
		n = input.nextInt();
		int mang[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			mang[i] = input.nextInt();
		}

		input.close();
		
		long tich = 1;
		String xuatMang = "";
		for (int i = 0; i < mang.length; i++) {
			if (mang[i] > 0 && mang[i] % 2 == 0) {
				tich *= mang[i];
			}
			xuatMang += mang[i] + " ";

		}

		System.out.println("Mảng đã nhập: " + xuatMang
				+ "\nTích các phần tử chia hết cho 2: " + tich);

	}

}
