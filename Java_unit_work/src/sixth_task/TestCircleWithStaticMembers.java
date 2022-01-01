package sixth_task;

public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		System.out.println("Before ceating objects");
		System.out.println("The number of Circle object is "+
		Circle_2.numberOfObjects);
		
		Circle_2 c1=new Circle_2();
		
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius(" + c1.radius + 
		 ") and number of Circle objest (" + 
			Circle_2.numberOfObjects + ")");
		
		Circle_2 c2 = new Circle_2(5);
		
		c1.radius = 9;
		
	    System.out.println("\nAfter creating c2 and modifying c1");
	    System.out.println("c1: radius (" + c1.radius +
	    		") and number of Circle objects(" +
	    		Circle_2.numberOfObjects + ")");
	    System.out.println("c2: radius (" + c2.radius +
	    		") and number of Circle objects(" +
	    		Circle_2.numberOfObjects + ")");
		
	}

}
