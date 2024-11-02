package polymorphism;

public class paymentApp {
	public static void main(String []args) {
		upi up=new upi();
		up.bill();
		up.offer();
		up.pay();
		wallet wl=new wallet();
		wl.bill();
		wl.offer();
		wl.pay();
		card cd=new card();
		cd.bill();
		cd.offer();
		cd.pay();
	}

}
