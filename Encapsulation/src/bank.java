
public class bank {
	private int money;
	public void setdata(int amount) {
		if(amount>0) {
		money=amount;
		}
		else {
			System.out.println("enter valid amount");
			return;
		}
	}
	public int getdata() {
		return money;
	}
	

}
