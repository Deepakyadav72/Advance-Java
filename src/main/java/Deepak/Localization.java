package Deepak;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.lang.*;
import java.io.*;
import java.util.*;



public class Localization {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Locale l1=new Locale("hi", "IN");
    	Locale l2=new Locale("fr", "fr");
    	Locale l3=new Locale("en", "USE");
    	
    	System.out.println("India :" +l1);
    	System.out.println("France :" +l2);
    	System.out.println("Use :" +l3);
    	
    	System.err.println("Default Value :" +l1.getDefault());
    	
    	System.out.println(" Country Name :" +l1.getCountry());
    	
    	System.out.println(" language Name :" +l1.getLanguage());
    	
    	System.out.println(" Display Country Name :" +l1.getDisplayCountry());
    	
    	System.out.println(" Country Name & language :" +l1.getDisplayName());
    	
	    	
	    
	
       
	}

}
