package bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
	
	private String maSV;
	private String hoTen;
	private String queQuan;
	private double diemTB;
	private String ngaySinh;
	private String email;
	private ArrayList<SinhVien> dssv;
	

	public SinhVien(String maSV, String hoTen, String queQuan, double diemTB,
			String ngaySinh, String email) {
		KiemTraMaSV(maSV);
		KiemTraDTB(diemTB);
		KiemTraEmail(email);
		this.hoTen = hoTen;
		this.queQuan = queQuan;
		this.diemTB = diemTB;
		this.ngaySinh = ngaySinh;
		
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		KiemTraMaSV(maSV);
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		KiemTraDTB(diemTB);
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		KiemTraEmail(email);
	}
	
	public void KiemTraMaSV(String maSV)
	{
		if(maSV.length()!= 8)
		{
			Scanner nhap = new Scanner(System.in);
			do{
				System.out.println("Ma SV phai co 8 ky tu");
				maSV = nhap.nextLine();
			}while(maSV.length() < 8 || maSV.length() > 8);
			
		}
		this.maSV = maSV;
	}
	
	public void KiemTraDTB(double diemTB)
	{
		if (diemTB<0 || diemTB>10) {
			Scanner nhap = new Scanner(System.in);
			do{
				System.out.println("Diem phai tu 0 den 10");
				diemTB = nhap.nextDouble();
			}while(diemTB<0 || diemTB>10);
			
		}
		this.diemTB = diemTB;
		
	}
	
	public void KiemTraEmail(String email)
	{
		if(email.contains("@") != true || email.contains(" ") != false)
		{
			Scanner nhap = new Scanner(System.in);
			do{
				System.out.println("Email phai co @ va khong co khoang trang");
				email = nhap.nextLine();
			}while(email.contains("@") != true || email.contains(" ") != false);
		}
		this.email = email;
	}
	public ArrayList getDssv() {
		return dssv;
	}
	public void setDssv(ArrayList dssv) {
		
		this.dssv = dssv;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "In thong tin sinh vien";
	}
	
}
