//1) initialize a single dimension array and sort it in ascending order.

public class Array1
{
	public static void main(String[] args)
	{
		int a1[] = {12,1,15,45,34,79,56};
		int a1len = a1.length, i;
		
		System.out.println("Original array");
		for(i=0; i < a1len; i++)
		{
			System.out.println(a1[i]);
		}
		for(i=0; i < a1len-1; i++)
		{
			int temp;
			if(a1[i] > a1[i+1])
			{
				temp = a1[i];
				a1[i] = a1[i+1];
				a1[i+1] = temp;
			}
		}
		System.out.println("After sorting the array");
		for(i=0; i < a1len; i++)
		{
			System.out.println(a1[i]);
		}
	}
}