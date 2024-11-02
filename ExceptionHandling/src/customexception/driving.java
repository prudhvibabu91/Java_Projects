package customexception;

import java.util.Scanner;

public class driving {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the age to apply for license");
		int age=scan.nextInt();
		try {
		check(age);
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	static void check(int age) throws Exception{
		if(age<18) {
			throw new underage();
			
		}
		else if(age>65) {
			throw new overage();
			
		}
		else {
			System.out.println("Driving license applied succesfully");
		}
	}

}
