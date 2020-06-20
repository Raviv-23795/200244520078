
public class Child1 extends Parent {
	int child1Num;

	public Child1(int parentNum, int child1Num) {
		super(parentNum);
		System.out.println("Inside parameterised constructor of Child1.");
		this.child1Num = child1Num;
	}

	public int getChild1Num() {
		return child1Num;
	}

	public void setChild1Num(int child1Num) {
		this.child1Num = child1Num;
	}
}
