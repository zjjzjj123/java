package java_v01;

//接口
interface shape2d {
	final double pi = 3.14;
	public abstract double area();

}

interface Color
{
	public abstract void setColor(String col);
}

class circle1 implements shape2d,Color
{
	int r = 3;
	String color;
	public circle1(int r)
	{
		this.r = r;
	}
	
	public double area() 
	{
		return pi*r*r;
	}
	
	public void setColor(String col)
	{
		color = col;
		System.out.println("circle color is "+color);
	}
}

class rect1 implements shape2d,Color
{
	int w,h;
	String color;
	public rect1(int w,int h)
	{
		this.w = w;
		this.h = h;
	}
	
	public double area()
	{
		return w*h;
	}
	
	public void setColor(String col)
	{
		color = col;
		System.out.println("rect1 color is "+color);
	}
}



