package java_v01;

//final不能被继承  不能被改写覆盖  就是最后终结的意思
//public class final_learn {
//
//	int a = 10; 
//	final int b=10;
//	final int getnum()
//	{
//		return 10;
//	}
//}

class Gtype<Type>
{
	Type object;
	public Gtype(Type object)  //构造函数
	{
		this.object = object;
	}
	
	public Type getTpye()
	{
		return object;
	}
}

class showtype
{
	public void show(Gtype<?>o)
	{
		System.out.println(o.getTpye().getClass().getName());
	}
}


//



