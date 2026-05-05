package Deepak;
import java.util.Scanner;
public class Switchcase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		System.out.println("Operator");
		char operator=sc.next().charAt(0);
		//char operator='+';
	switch(operator) {
	case '+':
		System.out.println("addition :"+(a+b));
		break;
	case '-':
		System.out.println("sub :"+(a-b));
		break;
	case '*':
		System.out.println("mul :"+(a*b));
		break;
	case '/':
		System.out.println("div :"+(a/b));
		
		break;
		default:
			System.out.println("invalid");
			
	}
	}

}
