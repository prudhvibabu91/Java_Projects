package customexception;

public class underage extends Exception{
	public underage() {
		super("you are younger to apply for a license");
	}

}
