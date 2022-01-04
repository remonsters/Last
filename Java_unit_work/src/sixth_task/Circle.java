package sixth_task;

public class Circle {
	private double radius = 1;
	
	private static int numberOfObjects = 0;

	public static String getNumberOfObject;
	
	public Circle()
	{
		numberOfObjects++;
	}

	public double getRadius()
	{
		return radius;
	}
	
	
	public static int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	
	public double getArea()
	{
		return radius * radius * Math.PI;
	}


	
}
