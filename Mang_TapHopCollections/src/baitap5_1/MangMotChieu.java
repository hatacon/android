package baitap5_1;

import java.util.Random;
import java.util.Scanner;

public class MangMotChieu {

	public static void main(String[] args) {

		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào số phần tử của mảng: ");
		n = input.nextInt();

		int mang[] = new int[n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			mang[i] = random.nextInt(100);
		}
		input.close();

		long tinhTong = 0L;
		String xuatMang = "";
		for (int i = 0; i < mang.length; i++) {
			tinhTong += mang[i];
			xuatMang += mang[i] + " ";
		}

		System.out.println("Mảng: " + xuatMang
				+ "\nTổng các phần tử trong mảng: " + tinhTong);
	}
}
