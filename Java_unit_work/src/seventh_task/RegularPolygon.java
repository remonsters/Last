package seventh_task;

public class RegularPolygon {
	private int n=3;
	private double side=1;
	private double x=0;
	private double y=0;
	
	public RegularPolygon(){
		
	}
	//x,y��Ĭ��ֵ��0��0�����������ڣ�0��0��
	public RegularPolygon(int n,double side) {
		this.n=n;
		this.side=side;
	}
	public RegularPolygon(int n,double side,double x,double y) {
		this.n=n;
		this.side=side;
		this.x=x;
		this.y=y;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n=n;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side=side;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x=x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y=y;
	}
	
	public double getPerimeter() {
		return side*n;
	}
	public double getArea() {
		return (n*side*side)/(4*Math.tan(Math.PI/n));
	}

}
