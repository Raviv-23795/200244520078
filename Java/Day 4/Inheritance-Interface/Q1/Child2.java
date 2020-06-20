
public class Child2 extends Child1 {
	int child2Num;

	public Child2() {
		super();
		System.out.println("Inside the non-parameterised constructor of Child2.");
	}

	public int getChild2Num() {
		return child2Num;
	}

	public void setChild2Num(int child2Num) {
		this.child2Num = child2Num;
	}
}
