package Deepak;

import java.util.*;
import java.lang.*;
import java.io.*;

class temp implements Serializable{
	int age;
	String name;
	// constractor
	
	public temp(int age,String name) {
	this.age=age;
	this.name=name;
	}
}
 
 

public class Object_StreamIO {

	public static void main(String[] args) throws IOException{
		
		
		// TODO Auto-generated method stub
   
		// ============Object output Stream================
		
		/*try {
	   temp t=new temp(28,"Rahul");
	   FileOutputStream fos=new  FileOutputStream("C:\\Users\\Deepak Yadav\\eclipse-workspace\\Corejava\\src\\main\\java\\Deepak\\text.text");
	   ObjectOutputStream oos=new ObjectOutputStream(fos);
	   
	   oos.writeObject(t);
	   
	   fos.close();
	   oos.close();
	   
	   System.out.println("Object serialized succesfully");
   }catch(Exception e) {
	   e.printStackTrace();
   }*/
		
		//================Deserialization 
		
		/*try {
			FileInputStream fis=new  FileInputStream("C:\\Users\\Deepak Yadav\\eclipse-workspace\\Corejava\\src\\main\\java\\Deepak\\text.text");
		   ObjectInputStream ois=new ObjectInputStream(fis);
		   temp t=(temp)ois.readObject();
		   System.out.println("age:"+t.age+"Name:"+t.name);
		   System.out.println("deserialization succesfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		
		//Print Writer
		
		FileWriter fw=new  FileWriter("C:\\Users\\Deepak Yadav\\eclipse-workspace\\Corejava\\src\\main\\java\\Deepak\\text.text");
		   PrintWriter pw=new PrintWriter(fw);
		   
		   pw.println("student Data");
		   pw.printf("Name:%s"+"Age:%d","Vedant",21);
		   System.out.println("PrintWriter succesfully");
		   pw.close();
		   fw.close();
	}

}
