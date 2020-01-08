package java_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args)
	{
		copy1(); // 第一种方式copy文件 使用reader writer
//		copy2(); //第二种使用Datastream  //没写好
	}
	
	public  static void copy1()
	{
		String src = "2.txt",dest = "1.txt";
		CopyMaker file = new CopyMaker();
		file.copy(src,dest);
		System.out.println("pro end");
	}
	
	public static void copy2(String src,String dest) throws IOException
	{
		DataInputStream instr;
		DataOutputStream outstr;
		int data;
		instr = new DataInputStream(new BufferedInputStream(new FileInputStream(src)));
		outstr = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dest)));

		while(true)
		{
			data = instr.readByte();
			outstr.writeByte(data);
		}			

	}

}
