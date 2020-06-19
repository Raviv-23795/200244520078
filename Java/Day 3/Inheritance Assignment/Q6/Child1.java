
public class Child1 extends Base{
	int Child1num;

	public Child1(int child1num) {
		super(10);
		System.out.println("Inside parameterised constructor of Child1 class.");
		Child1num = child1num;
	}

	public Child1() {
		super(10);
		System.out.println("Inside non-parameterised constructor of Child1 class.");
	}
	
	public int getChild1num() {
		return Child1num;
	}

	public void setChild1num(int child1num) {
		Child1num = child1num;
	}
}
