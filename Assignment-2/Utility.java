package practice;
import java.util.Scanner;

public class Utility {
	Scanner sc=new Scanner(System.in);
	public int getInput() {
		int inputNumber=sc.nextInt();
		if(inputNumber>10 || inputNumber<0) {
			System.out.println("OOPS!!!");
			System.out.println("Please enter In the range(1-10), Try Again!!! Bye till then");
			System.out.println("Ending-------------------------------------------");
			System.exit(0);
		}
		return inputNumber;
	}

}
