
public class Child1 extends Base {
	private int chil1Num;

	public Child1() {
		super();
		System.out.println("Inside the non-parameterised constructor of Child1.");
	}

	public int getChil1Num() {
		return chil1Num;
	}

	public void setChil1Num(int chil1Num) {
		this.chil1Num = chil1Num;
	}
}
