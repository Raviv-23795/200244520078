//4)	Display numbers from 3 to 30 except number 24  using while loop.
public class while_loop
{
	public static void main(String[] args)
	{
		int i = 3, n = 30;
		while (i <= 30)
		{
			if (i == 24)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}