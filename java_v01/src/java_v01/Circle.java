package java_v01;
import java.text.*;

public class Circle {
	private String ownerName;
	private int accountNum;
	private static int Al_num=0;
	private float balance;
	public Circle(String name)
	{
		this(name,0);
	}
	public Circle()
	{
		this("",0);
		System.out.println("this is a gouzao function");  //跳转到其他构造函数 构造器后面的指令就不会再执行了
	}
	public Circle(String ownerName,float balance)
	{
		this.ownerName = ownerName;
		this.balance = balance;
		this.accountNum = ++Al_num;
		System.out.println("transfered here");
	}
	
	public String getName() {return ownerName;}
	public int getNum() {return accountNum;}
	public float getBalance() {return balance;}
	public void setName(String name) {ownerName=name;}
	
	//为了使输出能够更加明确 要覆盖tostring方法 调用这个输出时用到的  
	public String toString()
	{
		return "Acc#" + ownerName + " account: " + 
				new java.text.DecimalFormat("00000").format(Al_num) + " balance: " +
				new java.text.DecimalFormat("$0.00").format(balance);
	}
	//存款
	public float deposit(float balance)
	{
		this.balance = this.balance + balance;
		return this.balance;
	}
	
	//取款
	public float withDraw(float balance)
	{
		if(balance > this.balance) 
			{
			System.out.println("balance not enough!");
				return this.balance;
			} 
		this.balance = this.balance - balance;
		return this.balance;
	}
	
	//example
	public static Circle ex1()
	{
		Circle b2 = new Circle();
		b2.setName("ex1");
		b2.deposit(200);
		return b2;
	}
}


