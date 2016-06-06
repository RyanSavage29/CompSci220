/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab12
 ******************************/
 
public class Sum
{
	public static void main(String[] args)
	 {
		Sum s = new Sum();
		System.out.println(s.sum(7));
	 }

// This method returns the sum of 1 to num
public int sum(int num)
{
	int half, full, result;
	half = sumHalf(num/2);
	full = sumFull(num/2 + 1, num);
	result = half + full;
	return result;
}

public int sumHalf(int num)
{
	int result;
	if (num == 1)
	{
		result = 1;
		System.out.println("1st result: " + result);
	}
	else 
	{
		result = num + sumHalf(num - 1);
		System.out.println(result);
	}
	return result;
}

public int sumFull(int num, int total)
{
	int result;
	if (num == total)
	{
		result = total;
		System.out.println("1st result: " + result);
	}
	else
	{
		result = num + sumFull(num + 1, total);
		System.out.println(result);
	}
	return result;
	
}
}