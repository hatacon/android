package bai2;

import java.util.Scanner;

public class Tinhsongay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int thang, nam;
		int k = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào năm:");
		nam = input.nextInt();
		System.out.println("Nhập vào tháng:");
		thang = input.nextInt();
		input.close();

			
		if(nam <= 0)
		{
			System.out.println("Năm không hợp lệ, vui lòng nhập lại.");
			return;				//trả về 
		}
		
		//kiểm tra năm nhuận
		if ((nam % 400 == 0) || (nam % 100 != 0 && (nam % 4) == 0)) 
		{
			k = 1;			
		}
		switch (thang) 
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Số ngày: 31");
			break;
		case 2:
			if (k == 1)
				System.out.println("Số ngày: 29");
			else
				System.out.println("Số ngày: 28");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Số ngày: 30");
			break;
		default:
			System.out.println("Tháng không hợp lệ, vui lòng nhập lại.");
		}
		
	}

}
