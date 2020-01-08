package java_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class Write {
	public static void main(String[] args)
	{
		Mwrite();
		Mreader();
	}
	
	public static void Mwrite()
	{
		String Filename = "1.txt";
		//BufferWriter 缓冲类
		try {
//				FileWriter writer = new FileWriter(Filename,true);  //表示文件追加
				BufferedWriter out = new BufferedWriter(new FileWriter(Filename,true));
				out.write("hello");
				out.newLine();
				out.write("world");
				out.close();
				System.out.println("end");
		} 
		catch(IOException iox) {System.out.println("problem writer " + Filename);} //出错信息
	}
	public static void Mreader()
	{
		String Filename = "1.txt",line;
		try {
			BufferedReader in = new BufferedReader(new FileReader(Filename));
			line = in.readLine();
			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}
			in.close();
		}
		catch (IOException iox){System.out.println("Problem reader"+Filename);}
	}
	
}
