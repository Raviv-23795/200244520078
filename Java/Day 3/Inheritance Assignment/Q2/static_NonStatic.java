/*
 * 2)	Create a class with static and non-static member variables. Define static and non-static member functions. Create instance of this class and call both static and non-static member functions.
 */
public class static_NonStatic {

	private static int ctr = 0;
	private int num;
	
	{
		ctr++;
	}
	
	public static int getCtr() {
		return ctr;
	}
	
	public static_NonStatic() {
		super();
	}
	
	public static_NonStatic(int num) {
		super();
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static_NonStatic s1 = new static_NonStatic();
		s1.setNum(10);
		static_NonStatic s2 = new static_NonStatic(20);
		System.out.println("Inside s1, num = " + s1.getNum() + ". Inside s2, num = " + s2.getNum() + "\n Counter = " + static_NonStatic.getCtr());
		static_NonStatic s3 = new static_NonStatic(30);
		System.out.println("Inside s3, num = " + s3.getNum() + "\n Counter = " + static_NonStatic.getCtr());
	}

}
