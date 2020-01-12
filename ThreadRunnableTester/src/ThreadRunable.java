public class ThreadRunable {
	public static void main(String[] args) {
		TestThread t1 = new TestThread();
		TestThread t2 = new TestThread();
		TestThread t3 = new TestThread();
		System.out.println("starting Thread");
		
		new Thread(t1,"Thread1").start();  //��ʼ�Ķ�˳��һ��  ���ǽ�����˳���й��ɣ���Ϊ��ʼ�Ǹ��ݵ�����������
		new Thread(t2,"Thread2").start();  //���Ƕ���߳�
		new Thread(t3,"Thread3").start();
		
		System.out.println("Threads started ,main Thread end!");
		
	}

}

class TestThread implements Runnable{
	private int sleepTime;
	public TestThread() {
		sleepTime = (int)(Math.random()*6000);
	}
	
	public void run() {
		try{
			System.out.println(Thread.currentThread().getName() + "going to sleep for"
					+ sleepTime);
			Thread.sleep(sleepTime);
			}
		catch(InterruptedException exception) {};
		System.out.println( Thread.currentThread().getName() + "finished");
	}
	
}