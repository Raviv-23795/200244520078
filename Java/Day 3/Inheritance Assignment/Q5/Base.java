
public class Base {
	int num;

	public Base(int num) {
		super();
		System.out.println("Inside parameterised constructor of Base class.");
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
