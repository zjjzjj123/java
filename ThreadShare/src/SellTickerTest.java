public class SellTickerTest {
	public static void main(String[] args) 
	{
		sell t = new sell();
		new Thread(t,"t1").start();
		new Thread(t,"t2").start();
		new Thread(t,"t3").start();
//		ScellTicket t = new ScellTicket();
//		new Thread(t,"thread1").start();
//		new Thread(t,"thread2").start();
//		new Thread(t,"thread3").start();
	}
}

//class ScellTicket implements Runnable
//{
//	private int ticket = 200;
//	public void run()   //ÖØÐ´
//	{
//		while(ticket>0) {
//			System.out.println(Thread.currentThread().getName() + " is selling ticket " + ticket--);
//		}
//	}
//}

class sell implements Runnable{
	private int tickets = 200;
	
	public void run() 
	{
		while(tickets>0)
		{
			System.out.println(Thread.currentThread().getName() + " sell tickets is " + tickets-- );
		}
	}
	
}