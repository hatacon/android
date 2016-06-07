package bai12;

public class Rectangle extends Shape {
	private int chieudai, chieurong;

	public int getChieudai() {
		return chieudai;
	}

	public void setChieudai(int chieudai) {
		if (chieudai >= 1 && chieudai <= 15) {
			this.chieudai = chieudai;
		}
	}

	public int getChieurong() {
		return chieurong;
	}

	public void setChieurong(int chieurong) {
		if (chieurong >= 1 && chieurong <= 15) {
			this.chieurong = chieurong;
		}
	}

	public Rectangle() {
		super();
	}

	public Rectangle(int chieudai, int chieurong) {
		super();
		this.chieudai = chieudai;
		this.chieurong = chieurong;
	}

	public void draw(int cd, int cr) {
		super.draw();
		int i, j;
		for(i = 1; i <= cr; i++)
		{
			for(j = 1; j <= cd; j++)
			{
				if(i == 1 || i == cr)
				{
					System.out.println("*");
				}
			}
			if(j == 1 || j == cd)
			{
				System.out.println("*");
			}
		}
	}
}
