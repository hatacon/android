package baitapbosung_bai2;

import java.util.Random;
import java.util.Scanner;

public class Bai4_GameDoanso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Chào mừng bạn đến với Game đoán số.");
		System.out.println("Số điểm ban đầu của bạn là 5 điểm.");

		int diem = 5;
		int n;
		Scanner input = new Scanner(System.in);
		
		do
		{
			Random rd = new Random();
			int so = rd.nextInt(6);
			System.out.println("Vui lòng nhập 1 số bất kỳ từ 0 đến 5: ");
			n = input.nextInt();

			if (n == so) {
				diem += 1;
				System.out.println("Chúc mừng bạn đã đoán đúng. Số điểm hiện tại của bạn là: " + diem);
			} else {
				diem -= 1;
				System.out.println("Bạn đã đoán sai. Số điểm hiện tại của bạn là: " + diem);
			}
		}
		while (diem > 0 && diem < 10);
		input.close();
		
		if (diem == 0) {
			System.out.println("Game Over!");
		} else if (diem == 10) {
			System.out.println("Congratulations! You Win!");
		}

	}

}
