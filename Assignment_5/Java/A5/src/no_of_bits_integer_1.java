import java.util.*;
public class no_of_bits_integer_1 {
	
	static int count(int num)
	{
		int count = 0;
		while (num != 0)
		{
			num = num>>1;
			count++;
			
			/* >>1 converts the num to binary and
			right shift each digits once and then 
			convert that binary number to integer.*/
			
			//System.out.println(num);
		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.print(count(num));
	}

}
