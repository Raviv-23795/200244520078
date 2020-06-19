
public class Child2 extends Base{
	int child2Num;

	public Child2(int child2Num) {
		super(10);
		System.out.println("Inside parameterised constructor of Child2 class.");
		this.child2Num = child2Num;
	}

	public int getChild2Num() {
		return child2Num;
	}

	public void setChild2Num(int child2Num) {
		this.child2Num = child2Num;
	}
}
