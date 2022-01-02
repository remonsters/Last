
public class Circle
{
     //数据域
	double radius;
	
	//方法
	public double getArea()
	{
		return radius * radius* Math.PI;
	}
	
	public double getPermeter()
	{
		return 2*radius*Math.PI;
	}
	
	public void setRadius(double newRadius)
	{
	    this.radius=newRadius;	
	}
}
