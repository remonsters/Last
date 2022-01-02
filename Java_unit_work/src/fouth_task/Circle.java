package fouth_task;

public class Circle 
{
    double radius;
    
    Circle()
    {
    	
    }
    Circle(double newRadius)
    {
        radius=newRadius;  	
    }
    double getArea()
    {
    	return radius*radius*Math.PI;
    }
    
    double getPermeter()
    {
    	return 2*radius*Math.PI;
    }
    
    void setRadius(double newRadius)
    {
    	radius=newRadius;
    }
}
