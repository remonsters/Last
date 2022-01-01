package sixth_task;

public class TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		Circle_3 myCircle = new Circle_3(5.0);
		System.out.println("The area of the circle of radius"
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius"
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		//System.out.println("The number of object created is " 
		//		+ Circle_3.getNumberOfObject());
		
	}

}
