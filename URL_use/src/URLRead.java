import java.net.*;
import java.io.*;
public class URLRead {
	public static void main(String[] args) throws Exception{
//		URL cs = new URL("https://zhihu.com");
//		BufferedReader in = new BufferedReader(new InputStreamReader(cs.openStream()));
//		String inputLine;
//		while((inputLine = in.readLine())!=null)
//			System.out.println(inputLine);
//		in.close();
		URLconn();
	}
	
	public static void URLconn() throws IOException
	{
		try {
			URL cs = new URL("https://zhihu.com");
			URLConnection tc = cs.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(tc.getInputStream()));
			String inputlien;
			while((inputlien = in.readLine()) != null) 
				System.out.println(inputlien);
			in.close();
			}
			
		catch(MalformedURLException e){System.out.println("MalformedURLException");}
	}
}


//也可以使用URLconnection



