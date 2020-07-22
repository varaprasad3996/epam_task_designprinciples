
package week;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int option;
		Operations op=new Operations();
		do{
			System.out.println("Select the operation");
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Divison\n5.Exit");
			option=sc.nextInt();
			if(option!=5)
				op.getInput();
			if(option==1)
				op.add();
			else if(option==2)
				op.subtract();
			else if(option==3)
				op.multiply();
			else if(option==4)
				op.divide();
			else
				break;
			op.display();
		}while(option!=5);
	}

}
