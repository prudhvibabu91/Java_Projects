
public class laptopApp {
	public static void main(String []args) {
		laptop l1=new laptop("mac",240);
		laptop l2=new laptop("lenova",220);
		System.out.println(l1.getlapname());
		System.out.println(l1.getlapmemorysize());
		System.out.println(l2.getlapname());
		System.out.println(l2.getlapmemorysize());
	}

}
