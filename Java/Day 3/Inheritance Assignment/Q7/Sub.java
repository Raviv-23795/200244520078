
public class Sub extends Base {
	private int subNum;
	
	Sub(int num)
	{
		super(10);
		System.out.println("Inside the parameterised constructor of Sub Class.");
		this.subNum = num;
	}
	
	void getNum()
	{
		System.out.println("Inside Sub Class, num = " + subNum);
	}
}
