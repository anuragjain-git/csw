import java.util.*;
public class swap_bits_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter i'th and j'th value: ");
        int i = sc.nextInt();
        int j = sc.nextInt();
        int rem;
        int res = 0;
        int arr[] = new int[64];
        int q = 0;
        while(num!=0) {
        	rem = num%2;
        	num=num/2;
//        	System.out.print(rem);
//        	res += (int) Math.pow(10, q)+rem;
        	arr[q]=rem;
        	q++;
        }
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
        while(q!=0) {
        	q--;
        	System.out.print(arr[q]);
        }
	}
}