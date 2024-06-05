package map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesclass {
/*
 1.String setProperty(String pname,String pvalue)--to set a new property
 2.String getProperty(String Pname)-to get value asscoiated with the specified property
 3.Enumeration propertyNames()
 4.void load(InputStream is):To load properties files into java properties Object
 5.void store(OutputStream os,String comment):to store properties from java properties object into properties file
 */
	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("E:\\Eclipse_workspace\\Programs_2023\\src\\map\\data.properties");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("name");
		System.out.println(s);
		p.setProperty("Salary", "90000");
		FileOutputStream fos=new FileOutputStream("E:\\Eclipse_workspace\\Programs_2023\\src\\map\\data.properties");
		p.store(fos,"updated data file");
		System.out.println(p);
		p.clear();
		System.out.println(p);
		

	}

}
