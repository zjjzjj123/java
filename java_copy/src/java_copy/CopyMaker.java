package java_copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyMaker {
	
	private String srcName,destName;
	BufferedReader src;
	BufferedWriter dest;
	String line;
	
	private boolean openFile()
	{
		try {
			src = new BufferedReader(new FileReader(srcName)); 
		}
		catch(IOException iox) {
			System.out.println("Problem opening" + srcName);
			return false;
		}
		try {
			dest = new BufferedWriter(new FileWriter(destName));
		}
		catch(IOException iox) {
			System.out.println("Problem opening" + destName);
			return false;
		}
		return true;
	}
	private boolean closeFile() {
		boolean retval = true;
		try {
			src.close();

		}
		catch(IOException iox) {
			System.out.println("Close src have problem!");
			return retval;
		}
		try {	
			dest.close();

		}
		catch(IOException iox) {
			System.out.println("Close dest have problem!");
			return retval;
		}
		
		return retval;
	}
	private boolean copyFiles()
	{
		try {
			line = src.readLine();
			while(line != null)
			{	
				dest.write(line);
				dest.newLine();
				line = src.readLine();
			}
		}
		catch(IOException iox) {
			System.out.println("Reading have problem!");
			
		}
		return true;
	}
	
	public boolean copy(String srcName,String destName)
	{
		this.srcName = srcName;
		this.destName = destName;		
		return openFile()&&copyFiles()&&closeFile();
	}

}
