
public class Child2 extends Parent {
	int child2Num;

	public Child2(int parentNum, int child2Num) {
		super(parentNum);
		System.out.println("Inside parameterised constructor of Child2.");
		this.child2Num = child2Num;
	}

	public int getChild2Num() {
		return child2Num;
	}

	public void setChild2Num(int child2Num) {
		this.child2Num = child2Num;
	}
}
