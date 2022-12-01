import java.util.*;
public class parity_2 {
	
    private static void checkParity(int num){
        int count = 0;
        while(num != 0){
            num = num & (num - 1);
            // if n = no. of 1s num will be 0 after n times
            count++;
        }
        if(count%2==0)
        	System.out.println("No of 1s is even.");
        else
        	System.out.println("No of 1s is odd.");
    }

	public static void main(String[] args) {
		
		// With bitwise operator
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int num = sc.nextInt();
        checkParity(num);
        
        
        /*Without bitwise operator
        
        int rem,x=0;
        int i = 0, count=0;
        while(num!=0) {
        	rem = num%2;
        	num=num/2;
        	if(rem==1) {
        		count++;
        	}
        	x += (int) Math.pow(10, i)+rem;
        	i++;
        }
        if(count%2==0)
        	System.out.println("even");
        else
        	System.out.println("odd");*/
        
	}
}


