package java_v01;

public class Person {
	public String name;
	int hide_ = 10;
	private int b = 10; //只有父类才能访问  如果让子类访问只能定义一个函数 通过函数访问
	protected int c = 20; //可以给子类访问
	public String getNmae()
	{
		return name;
	}
	
	public int getB()
	{
		return b;
	}
}

class Employee extends Person  //继承之后就直接是public了
{
	String hide_="hide";
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("hide_"+hide_);
		System.out.println("super_hide_"+ super.hide_);  //只有用super才能访问隐藏的变量 
	}
	public int employeeNumber;
	public int getEmployeeNumber()
	{
		return employeeNumber;
	}
}

class Manager extends Employee
{
	public String responsibilities;
	public String getResposibilities()
	{
		return responsibilities;
	}
	
}