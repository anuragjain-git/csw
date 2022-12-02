
public class multiply_bitwise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = 0;
		
		int a = 5;
		int b = 5;
//		System.out.println(b&1);
		while(b > 0) {
			if((b&1)!=0)  // if b is odd b&1=0
				res=res+a;
			
			a = a << 1; //a gets double
			b = b >> 1; //b gets half
		}
		System.out.println(res);
	}

}
