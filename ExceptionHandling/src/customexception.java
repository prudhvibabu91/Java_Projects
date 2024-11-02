import java.util.Scanner;

public class customexception {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the amount to be withdraw");
		int amount=scan.nextInt();
		try {
		transfer(amount);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void transfer(int amount) throws Exception{
		if(amount<=10000) {
			System.out.println("withdraw succesful");
			
		}
		else {
			 throw new insufficientBalance();
		}
	}

}
