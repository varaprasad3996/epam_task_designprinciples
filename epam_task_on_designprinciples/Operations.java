package week;
import java.util.Scanner;
public class Operations {
	Float a,b,c;
	Scanner sc=new Scanner(System.in);
	void getInput(){
		System.out.println("Enter 2 numbers");
		a=sc.nextFloat();
		b=sc.nextFloat();
	}
	void add(){
		c=a+b;
	}
	void subtract(){
		c=a-b;
	}
	void multiply(){
		c=a*b;
	}
	void divide(){
		c=a/b;
	}
	void display(){
		System.out.printf("The result is %.2f\n",c);
	}
}
