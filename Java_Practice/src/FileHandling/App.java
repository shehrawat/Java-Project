package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class App 
{

	public static void main(String[] args) throws Exception 
	{
		Properties p = new Properties();
		OutputStream os = new FileOutputStream("dataConfig.properties");
	
	
		p.setProperty("url", "localhost:3306/myDb");
		p.setProperty("uname", "ajay");
		p.setProperty("pass", "0000");
		
		p.store(os, null);
		
		InputStream is = new FileInputStream("dataConfig.properties");
		p.load(is);
		
//		System.out.println(p.getProperty("uname"));
//		System.out.println(p.getProperty("pass"));
//		System.out.println(p.getProperty("url"));
		
		// Or you can use
		
		p.list(System.out);
	}

}
