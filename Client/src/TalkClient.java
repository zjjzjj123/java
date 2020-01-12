import java.net.*;
import java.io.*;

//�ͻ��˿���ִ�ж��  �ڲ�ͬ�Ĺ��̴򿪾��Ƕ���ͻ��ˡ�
//���������ϵ�һ��������ҪIP+�˿ں�
public class TalkClient {
	public static void main(String[] args) {
		try 
		{
			Socket socket = new Socket("127.0.0.1",4701);
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));  //������,��ü�������
			PrintWriter os = new PrintWriter(socket.getOutputStream());  //socket�����
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream())); //�õ�
			String readline;
			readline = sin.readLine();  //�Ӽ���������
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





















