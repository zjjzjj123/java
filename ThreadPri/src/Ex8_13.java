
public class Ex8_13 {
	public static void main(String[] args) {
		TestThread[] runners = new TestThread[2];  //�߳�����
		for(int i=0; i<2; i++) runners[i] = new TestThread(i);
		runners[0].setPriority(2); // ���ȼ�Ϊ2 
		runners[1].setPriority(5); //���ȼ�Ϊ3
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
				yield(); // ��������Ȩִ��Ȩ ȥ��ͬ�ȼ�����Ȩ���̣߳����û�оͷ��ص����߳�	
				try {sleep(1);}catch (Exception e) {} //�ȴ����Ǹ�����߳�ִ�еĻ���				
			}
		}
	}
}




