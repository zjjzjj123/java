
public class ProducerAndConsumer {
	public static void main(String[] args) {
		Tickets t = new Tickets(10);
		new Consumer(t).start();
		new Producer(t).start();
	}
}

//class Tickets {
//	int size;  //票总数
//	int number = 0;  // 存票序号
//	int i = 0; //售票序号
//	boolean available = false; // 是否有售票
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
	int size;  //票总数
	int number = 0;  // 存票序号
	int i = 0; //售票序号
	boolean available = false; // 是否有售票
	public Tickets(int size) {this.size = size;}
	public synchronized void put() {
		if(available) //如果还有存票待售，则存票线程等待
			try {wait();}catch(Exception e) {}
		System.out.println("Producer puts ticket " + (++number));
		available = true;
		notify(); //存票后唤醒售票 对应的是sell中的wait
	}
	public synchronized void sell() {
		if(!available) //如果没有存票 则售票等待
			try {wait();}catch(Exception e) {}
		System.out.println("Consumer buys ticket "+ (number));
		available = false;
		notify(); //售票后唤醒存票 开始存票 对应puts
		if(number == size)number = size + 1; //在售完最后一张票后设置一个结束标志 number>size 表示结束
	}
}
class Producer extends Thread{
	Tickets t = null; //这只是一个引用吧
	public Producer(Tickets t) {this.t = t;}
	public void run() {
		//如果存票小于限定的总量，则存入票
		while(t.size>t.number) {
			t.put();
		}
	}
}

class Consumer extends Thread{
	Tickets t = null;
	public Consumer(Tickets t) {this.t = t;}
	public void run() {
		//如果售票数小于限定总量 则不断售票
		while(t.i<t.size) {
			t.sell();
		}
	}
}















