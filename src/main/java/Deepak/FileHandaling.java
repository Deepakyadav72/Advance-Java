package Deepak;

import java.lang.*;
import java.io.*;
import java.util.*;



	



public class FileHandaling {
	public static void main(String[] args)  throws IOException{
		
		
		//=========File Writer and write
		/*Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name=s.nextLine();
		
		//Age
		System.out.println("Enter your age:");
		int age=s.nextInt();
		
		FileWriter file=new FileWriter("C:\\Users\\Deepak Yadav\\eclipse-workspace\\Corejava\\src\\main\\java\\Deepak\\text.text");
		file.write("name:"+name+"\n");
		file.write("age:"+age+"\n");
		
		System.out.println("name:" +name +"\n");
		
		System.out.println("name:" +age +"\n");
		
		System.out.println("name is give Above");
		file.close();*/
		
		
		
		//======Create file===========
		
		File file=new File("test.text");
		
		if(file.createNewFile()) {
			System.out.println("File create Successfullyt");
			
		}
		else {
			System.out.println("File exist");
		}
		System.out.println("File name:"+file.getName());
		System.out.println("File name:"+file.getAbsolutePath());
		
		
		
		
		//===============Delete============
		if(file.delete()) {
			System.out.println("file deleted succesfully");
			
		}
		else {
			System.out.println("file not delete");
			
		}
		
		
		// !Buffered Reader
		
		// Buffered Writer 
		
		FileWriter fw= new FileWriter("C:\\Users\\Deepak Yadav\\eclipse-workspace\\Corejava\\src\\main\\java\\Deepak\\text.text");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("the quick brown fox jumps over ionto the dog ");
		bw.newLine();
		bw.write("We all are developing project in full stack java");
		
		System.out.println("Data write Successfully");
		bw.close();
		
		
		
		// ===========File Input Stream=======================
		
		
		/*try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Deepak Yadav\\eclipse-workspace\\Corejava\\src\\main\\java\\Deepak\\WhatsApp Image 2022-10-16 at 5.35.51 PM.jpeg");
			int i;
			while((i=fis.read())!=1) {
				System.out.println(i);
			}
			System.out.println("File input stream read succssefully");
			
			}catch(Exception e) {
				e.printStackTrace();
			}*/
		
		
		//=========File output Stream ===========
		
		/*try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Deepak Yadav\\eclipse-workspace\\Corejava\\src\\main\\java\\Deepak\\WhatsApp Image 2022-10-16 at 5.35.51 PM.jpeg");
			FileOutputStream fos=new FileOutputStream("Copied_image.jpeg");
			int i;
			while((i=fis.read())!=-1) {
				fos.write(i);
			}
			System.out.println("Image copied Successfully");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		
		//==========Object Stream================

	 
	}
	}


