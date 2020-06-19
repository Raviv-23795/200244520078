
public class Base {
	private int baseNum;
	
	Base(int num)
	{
		this.baseNum = num;
		System.out.println("Inside the parameterised constructor of Base Class.");
	}
	
	void getNum()
	{
		System.out.println("Inside Base Class, num = " + baseNum);
	}
}
