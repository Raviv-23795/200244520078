/*
3) Define a class "Emp" with private static member "int cnt".
How will u make sure that outsiders can read the value of cnt ?
*/

class Emp
{
	private static int cnt = 0;
	static int getCnt()
	{
		return cnt;
	}
	public Emp()
	{
		cnt++;
		System.out.println("Inside default constructor of Emp");
	}
}

public class EmpCnt
{	
	public static void main(String[] args)
	{
		Emp e1 = new Emp();
		System.out.println(Emp.getCnt());
	}
}