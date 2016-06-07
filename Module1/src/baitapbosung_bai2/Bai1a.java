package baitapbosung_bai2;

import java.util.Scanner;

public class Bai1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên n: ");
		n = input.nextInt();
		input.close();
		
		int i, tinhTong = 2, tinhHieu = 2, tinhTich = 2;
		double tinhThuong = 2;
		if(n < 2)
		{
			tinhTong = 0;
			tinhHieu = 0;
			tinhTich = 0;
			tinhThuong = 0;
		}
		for(i = 3; i <= n; i++)
		{
	
			if(i%2 == 0)
			{
				tinhTong += i;
				tinhHieu -= i;
				tinhTich *= i;
				tinhThuong /= i;
		
			}
		}
		System.out.println("Tổng các số chẵn là: " + tinhTong);
		System.out.println("Hiệu các số chẵn là: " + tinhHieu);	
		System.out.println("Tích các số chẵn là: " + tinhTich);
		System.out.println("Thương các số chẵn là: " + tinhThuong);		
		
	}

}
