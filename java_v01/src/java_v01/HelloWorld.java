package java_v01;

import java_v01.Circle; //不导入也没有问题


public class HelloWorld {
	public static void main(String[] args)
	{
		
//		rect1 var1 = new rect1(2,2);
//		var1.setColor("red");
//		System.out.println("rect1 :"+ var1.area());
		
		

		showtype b = new showtype();
		Gtype<Integer> a = new Gtype<Integer>(3);
		Gtype<String> c = new Gtype<String>("heh");
		
		b.show(a);
		b.show(c);
		Person x;
		int t = 10;
		System.out.println();
		x = new Person();
		x.name = "xiaoming";
		System.out.println("name:"+x.getNmae());
		System.out.println("main is end!");
		System.out.println("\n");
		bulidFac();
		System.out.println("\n");
		test();
		System.out.println(test(2,3));
		
		identical();
	}
	
	public static void bulidFac()
	{
		System.out.println("this is a function to build a manager!");
		
		Employee Mao = new Employee();
		Mao.name = "maomao";
		Mao.employeeNumber = 123;
		System.out.println("Mao name is "+Mao.getNmae());
		System.out.println("Mao number is "+Mao.getEmployeeNumber());
		System.out.println(Mao.c);  //访问父类的protected
		System.out.println(Mao.getB());  //通过方法来访问父类里面的私有变量
		System.out.println(Mao.hide_);
		
		System.out.println("\n");
		Manager manager = new Manager();
		manager.name = "Zjj";
		manager.employeeNumber = 456;
		manager.responsibilities = "this is a leader!";
		System.out.println("name "+ manager.getNmae());
		System.out.println("number "+manager.getEmployeeNumber());
		System.out.println("responsibilities "+manager.getResposibilities());
		System.out.println("this is ending");	
	}
	
	public static int test(int a,int b)  //这个是重载吧  哈哈哈
	{
		System.out.println("cover");
		return a+b;
	}
	public static void test()
	{
		System.out.println("通过参数可以正确的调用被重载的函数 \n 不能通过返回值 因为通过返回值 不能唯一确定重载后的参数");
	}
	
	public static void identical()
	{
		Circle bank1,bank2;
		bank1 = new Circle("xiao",100.00f);
		bank2 = new Circle("xiao",100.00f);
		System.out.println(bank2.getClass());  //得到引用的类型
		if(bank1==bank2)  //判断引用是否是一个变量 
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		if(bank1.equals(bank2))
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("no");
		}
	}
	
}
