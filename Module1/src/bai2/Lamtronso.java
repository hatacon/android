package bai2;

import java.util.Scanner;

public class Lamtronso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b;
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào số bất kỳ: ");
		a = input.nextDouble();
		input.close();
		
		if(a>=0)
		{
			n = (int)a;
			b = a - n;
			if(b >= 0.5)
			{
				n = n + 1;
			}
			System.out.println("Số đã làm tròn: "+ n);		
		}
		else
		{
			n = (int)a;
			b = a - n;
			if(b <= (-0.5))
			{
				n = n - 1;
			}
			System.out.println("Số đã làm tròn: "+ n);
		}
		
	}

}
