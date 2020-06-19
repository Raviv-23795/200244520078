/*
2) create a class "DemoArr",with the function "disp". create 4 objects of this class in an array.
Traverse the array and invoke "disp" on each objects.
*/

public class DemoArr
{
	public static void main(String[] args)
	{
		ArrayInst arr2[] = new ArrayInst[4];
		int arr2len = arr2.length;
		for(int i = 0, j = 10; i < arr2len; i++, j = j+10)
		{
			arr2[i] = new ArrayInst(j);
		}
		for (int i=0; i < arr2len; i++)
			arr2[i].disp();
	}
}

class ArrayInst
{
	private int num;
	void disp()
	{
		System.out.println(num);
	}
	
	ArrayInst(int num)
	{
		this.num = num;
	}
}