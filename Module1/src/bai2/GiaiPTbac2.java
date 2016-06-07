package bai2;

import java.util.Scanner;

public class GiaiPTbac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c;
		float x1, x2, delta;
		
		Scanner input = new Scanner(System.in);  //gọi luồng đọc chuẩn
		
		int i;
		do
		{
			System.out.println("Nhập a: ");
			a = input.nextInt();			//đối với biến int
			System.out.println("Nhập b: ");
			b = input.nextInt();
			System.out.println("Nhập c: ");
			c = input.nextInt();
			
			if(a==0)
			//Giải phương trình bậc 1
			{
				x1 = -c/b;
				System.out.println("Phương trình có nghiệm kép: x = " + x1);
			}
/*			else if(a==0 && b==0)
			{
				System.out.println("Phương trình vô nghệm.");
			}
			else if(a==0 && b==0 && c==0)
			{
				System.out.println("Phương trình có vô số nghiệm.");
			}*/
			
			//Giải phương trình bậc 2
			else
			{
				delta = b*b - 4*a*c;			//tính delta
				if(delta < 0)
				{
					System.out.println("Phương trình vô nghiệm.");
				}
				else if(delta == 0)
				{
					x1 = -b/(2*a);
					System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + x1);
				}
				else
				{
					x1 = (float) ((-b+Math.sqrt(delta))/(2*a));
					x2 = (float) ((-b-Math.sqrt(delta))/(2*a));
					System.out.println("Phương trình có 2 nghiệm: ");
					System.out.println("x1 = "+ x1);
					System.out.println("x2 = "+ x2);
				}
			}
		
		System.out.println("Bạn có muốn tiếp tục(0/1): ");
		i = input.nextInt();
//		input.close();
		System.out.println();
		}
		while(i!=0); 
		input.close();
		
	}

}
