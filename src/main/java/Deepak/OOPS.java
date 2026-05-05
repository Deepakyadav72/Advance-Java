package Deepak;


//----------------------- class object--------------------- 

class customer {
	String name ;
	int age;
	String Email;
	float salary;
	 void name() {
		 System.out.println("customer name is:"+ name);
		 }
	 void age() {
		 System.out.println("customer age is:"+ age);
		 }
	 
	 void Email() {
		 System.out.println("customer Email is:"+ Email);
		 }
	  
	 void salary() {
		 System.out.println("customer salary is:"+ salary);
		 }
}

public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customer c = new customer();
		c.name="varun";
		c.age=21;
		c.Email="varun@12gmail.com";
		c.salary=100000;
		c.name();
		c.age();
		c.Email();
		c.salary();
	}

}


//------------------------------------------Encapsulation---------------------------------//
/*
class customer {
	private String  name;
	private  String Email;
	private int id;
	private double salary;
	// getter setter method

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setEmail(String Email) {
		this.Email=Email;
	}
	public String getEmail() {
		return Email;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
}


public class OOPS {
	
	public static void main (String [] args) {
		
		customer s1 = new customer();
		s1.setName("varun");
		s1.setEmail("varun@gmail.com");
		s1.setId(1);
		s1.setSalary(110000);
		
		System.out.println("name:"+ " " +s1.getName());
		System.out.println("Email:"+ " " +s1.getEmail());
		System.out.println("id:"+ " "+s1.getId());
		System.out.println("salary:"+ " "+ s1.getSalary());
		
	}
}
*/



//------------------------------Inheritance---------------------------------- //

/*class vehicle {
	void SpeedMove() {
		System.out.println("This is property common for all child");
	}
	void perfomance() {
		System.out.println("Engin performance is better for all vehicle");
	}
}
//child 1

class car extends vehicle {
	void start (){
		System.out.println("car is start");
	}
}

//child 2

class Toyota extends vehicle {
	void speedChecker() {
		System.out.println("the car speed is maximum");

	}
}
public class OOPS {
	
	public static void main (String [] args) {
		
		car C = new car();
		Toyota T = new Toyota();
		
		C.SpeedMove();
		C.perfomance();
		T.SpeedMove();
		T.perfomance();
	}
}*/



//---------------------------Polymorphism------------------------------------//

//Method Overloading 

//class Mathmatical_Operation{
//	
//	public int Add(int a, int b ) {
//		return a+b;
//	}
//	
//	public int Add(int a, int b, int c ) {
//		return a+b+c;
//	}
//	
//	
//	public double Add(double a,double b ) {
//		return a+b;
//	}
//	
//}
//
//public class OOPS{
//	
//	public static void main (String [] args) {
//		
//		Mathmatical_Operation m = new Mathmatical_Operation();
//		System.out.println("first method:"+ m.Add(12, 23));
//		System.out.println("second method:"+ m.Add(32, 34, 12));
//		System.out.println("first method:"+ m.Add(12.3, 23.28));
//	}
//}