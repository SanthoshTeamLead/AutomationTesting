package com.hyr.FilesCreation;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.Date;
import java.util.Arrays;

public class FilesHandling {

	public static void main(String[] args) throws IOException {
		
		//1.
	  /*File file = new File("C:\\FileHandlingTest\\SampleTest\\SanthoshResume.txt");
		System.out.println(file.createNewFile()); //Return type :- True
		file.delete(); //Return Type :- False 
	  */
		
		//2.
	  /*File f = new File("C:\\FileHandlingTest\\SampleTest\\ResumeSample.txt");
		f.createNewFile();
		System.out.println(f.exists()); // Already here Return "True" 
		f.delete();
		System.out.println(f.exists()); //No There Return "False"
   	  */	
		//3.
	  /*File f = new File("C:\\FileHandlingTest\\SampleTest\\ResumereadOnly.txt");
		f.createNewFile();
		f.canWrite(); // File is Already Readable Mode Only 
		System.out.println(f.canWrite()); //Return type is false  
		f.setWritable(true);
		System.out.println(f.canWrite()); //Return type is True Can I change and Write the Code   
	   */
		//4. 
	/*	File  f = new File("C:\\FileHandlingTest\\SampleTest\\ResumeHiddenIteam.txt");
		f.createNewFile();
		System.out.println(f.isHidden()); // File is Hidden Return type is "TRUE"
										 //There File is Not Hidden Return type is "False"	
	*/
		//5
	  /*File f = new File("./Resourcesmkdir/");
		System.out.println(f.mkdir());
		
		File file = new File("./mkdirsPathFiles/pathFileB/pathFileC/");
		System.out.println(file.mkdirs());
		*/
		//6
		
	/*	File file = new File("C:\\Users\\neelima\\eclipse-workspace\\Core Java Concepts\\FilesHandlingInJava");
		System.out.println(Arrays.toString(file.list()));
		for(String FileName : file.list()){
			System.out.println(FileName); 
			}
		*/
		
		//7 
		File f = new File("C:\\FileHandlingTest\\SampleTest\\ResumeHiddenIteam.txt");
		System.out.println(f.getName()); //Return get File Name 
		System.out.println(f.getParent()); // Return get File Parent Name
		System.out.println(f.getPath());   // Return File Path Name
		System.out.println(f.isDirectory()); // Return type file b / f
		System.out.println(f.isFile());     // Return type is b/f
		System.out.println(f.getAbsoluteFile());   // Return type is File path Name
		System.out.println(new Date(f.lastModified()));  // Date is long type 
		
		
	}
	
}
