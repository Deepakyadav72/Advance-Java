package Deepak;


class Student{
	int age;
	String name;
	String address;
	
	//Parameterize constructor
	Student(int age,String name,String address){
	this.age=age;
	this.name=name;
	this.address=address;
	}
	void display() {
		System.out.println("age:"+age +"name:"+name+"address:"+address);
			
		
	}
	
}


public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student stud= new Student(23,"Deepak","Goregaon");
       stud.display();
//       System.out.println(stud);
       
	}

}
