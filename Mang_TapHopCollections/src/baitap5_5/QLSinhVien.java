package baitap5_5;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSinhVien {

	public static void nhapSV(int n, ArrayList<SinhVien> dssv) {
		Scanner input = new Scanner(System.in);
		for(int i =0; i<n; i++){
			SinhVien x = new SinhVien();
			input.nextLine();
			System.out.println("Nhập thông tin sinh viên thứ "+i+1);
			System.out.println("Nhập MSSV: ");
			x.setMaSV(input.nextLine());
			System.out.println("Nhập họ tên sinh viên: ");
			x.setHoten(input.nextLine());
			System.out.println("Nhập địa chỉ: ");
			x.setDiachi(input.nextLine());
			System.out.println("Nhập số điện thoại:");
			x.setSdt(input.nextInt());
			System.out.println("Nhập điểm hệ số 1: ");
			x.setDiemhe1(input.nextDouble());
			System.out.println("Nhập điểm hệ số 2: ");
			x.setDiemhe2(input.nextDouble());
			System.out.println("Nhập điểm thi: ");
			x.setDiemthi(input.nextDouble());
			
			dssv.add(x);
		}
		input.close();
	}
	
	public static double tinhDiemTB(double diemHS1, double diemHS2, double diemThi) {
		double diemTB = (((diemHS1+diemHS2*2)/3)*0.3 + diemThi*0.7);
		return diemTB;
	}
	
	public static void xuatSV(int n, ArrayList<SinhVien> dssv) {
		
		System.out.println("Danh sách sinh viên: ");
		
		for(int i =0; i<n; i++)
		{
			System.out.println(i+1+".");
			System.out.println("Mã số SV: "+((SinhVien) dssv.get(i)).getMaSV());
			System.out.println("Họ và tên: "+((SinhVien) dssv.get(i)).getHoten());
			System.out.println("Địa chỉ: "+((SinhVien) dssv.get(i)).getDiachi());
			System.out.println("Số điện thoại: "+((SinhVien) dssv.get(i)).getSdt());
			System.out.println("Điểm Trung bình: "+tinhDiemTB(((SinhVien) dssv.get(i)).getDiemhe1(), ((SinhVien) dssv.get(i)).getDiemhe2(), ((SinhVien) dssv.get(i)).getDiemthi()));
		}
	}
	
	public static void main(String[] args) {
/*		QLSinhVien.nhapSV(3, dssv);
		QLSinhVien.xuatSV(3, dssv);*/
	}
}
