
public class Child1 extends Base {
	int num1;

	
	public Child1(int num1) {
		super(10);
		System.out.println("Inside parameterised constructor of Child1 class.");
		this.num1 = num1;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}
}
