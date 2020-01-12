
public class Ex8_13 {
	public static void main(String[] args) {
		TestThread[] runners = new TestThread[2];  //线程数组
		for(int i=0; i<2; i++) runners[i] = new TestThread(i);
		runners[0].setPriority(2); // 优先级为2 
		runners[1].setPriority(5); //优先级为3
		for(int i=0; i<2; i++) runners[i].start();
	} 
}

class TestThread extends Thread{
	private int tick = 1;
	private int num ;
	public TestThread(int i) {this.num=i;}
	public void run() {
		while(tick<400000) {
			tick++;
			if((tick % 50000) == 0) {
				System.out.println("Thread # "+num + ",tick = "+ tick);
				yield(); // 放弃优先权执行权 去找同等级优先权的线程，如果没有就返回到本线程	
				try {sleep(1);}catch (Exception e) {} //等待就是给别的线程执行的机会				
			}
		}
	}
}




