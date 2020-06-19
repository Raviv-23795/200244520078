
public class Base {
	int basenum;

	public Base(int basenum) {
		super();
		System.out.println("Inside parameterised constructor of Base class.");
		this.basenum = basenum;
	}

	public int getBasenum() {
		return basenum;
	}

	public void setBasenum(int basenum) {
		this.basenum = basenum;
	}
}
