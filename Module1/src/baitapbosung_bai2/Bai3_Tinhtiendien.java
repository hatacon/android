package baitapbosung_bai2;

import java.util.Scanner;

public class Bai3_Tinhtiendien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào số KWh điện tiêu thụ: ");
		n = input.nextInt();
		input.close();
		
		int tien = 0;
		if(n <= 100)
		{
			tien = n*600;
		}
		if(n>100 && n<=150)
		{
			tien = (n-100)*700 + 100*600;
		}
		if(n>150 && n<=200)
		{
			tien = (n-150)*900 + 100*600 + 50*700;
		}
		if(n>200)
		{
			tien = (n-200)*1100 + 100*600 + 50*700 + 50*900;
		}
		System.out.print("Số tiền điện phải trả là: " + tien);
		System.out.println("đồng.");
	}

}
