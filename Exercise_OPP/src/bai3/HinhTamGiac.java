package bai3;

public class HinhTamGiac {

	private int ma;
	private int mb;
	private int mc;
	
	public HinhTamGiac() {
		super();
	}
	public HinhTamGiac(int ma, int mb, int mc) {
		if (ma <= 0 || mb <= 0 || mc <= 0) {
			System.out.println("Do dai 3 canh cua tam giac phai >0");
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		} else {
			if (ma + mb <= mc || ma + mc <= mb || mb + mc <= ma) {
				System.out.println("Khong tao thanh tam giac");
				this.ma = 0;
				this.mb = 0;
				this.mc = 0;
			} else {
				this.ma = ma;
				this.mb = mb;
				this.mc = mc;
			}
		}
	}
	
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		if(ma<=0)
		{
			System.out.println("Do dai canh cua tam giac phai >0");
		}
		else
		{
			if(this.mb+this.mc <= ma || ma + this.mb <= this.mc || ma+ this.mc <= this.mb)
			{
				System.out.println("Khong tao thanh tam giac");
			}
			else
			{
				this.ma = ma;
			}
		}
	}
	public int getMb() {
		return mb;
	}
	public void setMb(int mb) {
		if(mb<=0)
		{
			System.out.println("Do dai canh cua tam giac phai >0");
		}
		else
		{
			if(mb+this.mc <= this.ma || this.ma + mb <= this.mc || this.ma+ this.mc <= mb)
			{
				System.out.println("Khong tao thanh tam giac");
			}
			else
			{
				this.mb = mb;
			}
		}
	}
	public int getMc() {
		return mc;
	}
	public void setMc(int mc) {
		if(mc<=0)
		{
			System.out.println("Do dai canh cua tam giac phai >0");
		}
		else
		{
			if(this.mb+mc <= this.ma || this.ma + this.mb <= mc || this.ma+ this.mc <= mb)
			{
				System.out.println("Khong tao thanh tam giac");
			}
			else
			{
				this.mc = mc;
			}
		}
	}
	
	public boolean laTamGiac(){
		if(getMa()+getMb() <= getMc() || getMb()+getMc() <= getMa() || getMa()+getMc() <= getMb() 
				|| getMa() <= 0 || getMb() <= 0 || getMc() <= 0 )
			return false;
		else
			return true;
	}
	public boolean laTamGiac(int a, int b, int c){
		if(a<=0 || b<=0 || c<=0 || a+b <= c || a+c <= b || b+c <=a)
			return false;
		else
			return true;
	}
	
	public int getChuVi(){
		return getMa() + getMb() + getMc();
	}
	
	public double getDienTich(){
		double p = (getMa() + getMb() + getMc())/2.0;
		return Math.sqrt(p*(p-getMa())*(p-getMb())*(p-getMc()));
	}
	
}
