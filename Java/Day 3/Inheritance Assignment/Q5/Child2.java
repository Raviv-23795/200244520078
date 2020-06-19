
public class Child2 extends Child1 {
	int num2;

	public Child2() {
		super(20);
		System.out.println("Inside non-parameterised constructor of Child 2 class.");
	}

	public Child2(int num2) {
		super(20);
		System.out.println("Inside parameterised constructor of Child 2 class.");
		this.num2 = num2;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
