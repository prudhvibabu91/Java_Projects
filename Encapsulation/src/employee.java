
public class employee {
	 private int empid;
	private String empname;
	private float empsal;
	public employee(int empid,String empname,float empsal) {
		this.empid=empid;
		this.empname=empname;
		this.empsal=empsal;
		}
	public int getempid(){
		return empid;
		
	}
	public String getempname() {
		return empname;
		
	}
	public float getempsal() {
		return empsal;
	}

}
