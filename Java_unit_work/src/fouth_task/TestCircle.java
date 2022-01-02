package fouth_task;

public class TestCircle {

	public static void main(String[] args) 
	{
		Circle circle1=new Circle();
		circle1.setRadius(5);
		System.out.print("circle1's radius is "+ circle1.radius +
				"\ncircle1's area is " + circle1.getArea());
		Circle circle2=new Circle(3);
		System.out.print("\ncircle1's radius is "+ circle1.radius +
				"\ncircle1's area is " + circle1.getArea());
	}

}
