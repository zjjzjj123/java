import java.net.*;
import java.io.*;

//客户端可以执行多个  在不同的工程打开就是多个客户端、
//访问网络上的一个程序需要IP+端口号
public class TalkClient {
	public static void main(String[] args) {
		try 
		{
			Socket socket = new Socket("127.0.0.1",4701);
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));  //键盘流,获得键盘输入
			PrintWriter os = new PrintWriter(socket.getOutputStream());  //socket输出流
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream())); //得到
			String readline;
			readline = sin.readLine();  //从键盘流读入
			while(!readline.equals("bye"))
			{
				os.print(readline);
				os.flush();
				System.out.println("Client:" + readline);
				System.out.println("Server:" + is.readLine());
				readline = sin.readLine();
			}
			
			os.close();
			is.close();	
			socket.close();
		}
		catch(Exception e) {System.out.println("Error"+e);}
	}
}





















