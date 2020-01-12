
public class ProducerAndConsumer {
	public static void main(String[] args) {
		Tickets t = new Tickets(10);
		new Consumer(t).start();
		new Producer(t).start();
	}
}

//class Tickets {
//	int size;  //Ʊ����
//	int number = 0;  // ��Ʊ���
//	int i = 0; //��Ʊ���
//	boolean available = false; // �Ƿ�����Ʊ
//	public Tickets(int size) {this.size = size;}
//	public synchronized void put() {
//		System.out.println("Producer puts ticket " + (++number));
//		available = true;
//	}
//	public synchronized void sell() {
//		if(available==true && i<number)
//			System.out.println("Consumer buys ticket "+ (++i));
//		if(i==number) available = false;
//	}
//}

class Tickets {
	int size;  //Ʊ����
	int number = 0;  // ��Ʊ���
	int i = 0; //��Ʊ���
	boolean available = false; // �Ƿ�����Ʊ
	public Tickets(int size) {this.size = size;}
	public synchronized void put() {
		if(available) //������д�Ʊ���ۣ����Ʊ�̵߳ȴ�
			try {wait();}catch(Exception e) {}
		System.out.println("Producer puts ticket " + (++number));
		available = true;
		notify(); //��Ʊ������Ʊ ��Ӧ����sell�е�wait
	}
	public synchronized void sell() {
		if(!available) //���û�д�Ʊ ����Ʊ�ȴ�
			try {wait();}catch(Exception e) {}
		System.out.println("Consumer buys ticket "+ (number));
		available = false;
		notify(); //��Ʊ���Ѵ�Ʊ ��ʼ��Ʊ ��Ӧputs
		if(number == size)number = size + 1; //���������һ��Ʊ������һ��������־ number>size ��ʾ����
	}
}
class Producer extends Thread{
	Tickets t = null; //��ֻ��һ�����ð�
	public Producer(Tickets t) {this.t = t;}
	public void run() {
		//�����ƱС���޶��������������Ʊ
		while(t.size>t.number) {
			t.put();
		}
	}
}

class Consumer extends Thread{
	Tickets t = null;
	public Consumer(Tickets t) {this.t = t;}
	public void run() {
		//�����Ʊ��С���޶����� �򲻶���Ʊ
		while(t.i<t.size) {
			t.sell();
		}
	}
}















