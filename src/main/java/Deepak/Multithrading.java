package Deepak;
import java.lang.*;
import java.util.*;
import java.io.*;


//Life Cycle of Thread

//1)New (Born thread) -> thread not started yet
//Ready
//2) Runable -> Ready to Run
//3)Running -> it is Starting
//4) wait,Block,sleep();
//5) Terminate();



class Myclass extends Thread{
	public void run() {
		System.out.println("Thread Starting");
		
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Execution complete");
	}
}


//example 2

class Task extends Thread {
    public void run() {
        for(int i = 0; i < 6; i++) {
            System.out.println(i);
        }
    }
}


public class Multithrading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		example 1
		
		Myclass c=new Myclass();
		c.start();
		System.out.println("Main Thread started");
		
		
//		example 2
		
		Task t1 = new Task();
        t1.start();

	}

}








