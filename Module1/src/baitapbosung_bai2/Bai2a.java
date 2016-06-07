package baitapbosung_bai2;

import java.util.Scanner;

public class Bai2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên n: ");
		n = input.nextInt();
		input.close();
		
		int i, tongChan = 0, tongLe = 0;
		
		for(i = 1; i <= n; i++)
		{
			if(i%2 == 0)
			{
				tongChan += i;
			}
			else
			{
				tongLe +=i;
			}
		}
		System.out.println("Tổng các số chẵn là: " + tongChan);
		System.out.println("Tổng các số lẻ là: " + tongLe);
	}

}
