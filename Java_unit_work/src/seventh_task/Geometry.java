package seventh_task;

public class Geometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon num1=new RegularPolygon();
		RegularPolygon num2=new RegularPolygon(6,4);
		RegularPolygon num3=new RegularPolygon(10,4,5.6,7.8);
		
		System.out.println("Num1's perimeter is "+num1.getPerimeter()+" , area is "+num1.getArea());
		System.out.println("Num2's perimeter is "+num2.getPerimeter()+" , area is "+num2.getArea());
		System.out.println("Num3's perimeter is "+num3.getPerimeter()+" , area is "+num3.getArea());

	}

}
