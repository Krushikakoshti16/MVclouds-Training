
import java.util.*;

public class task4 {
	public static int fact(int n){
		int fact=1;
		int i;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
		
		
	}
	public static void main(String[] args) {
		int n,r;
		Scanner sc = new Scanner(System.in); 
			System.out.println("enter a value of n");
			n=sc.nextInt();
			System.out.println("enter a value of r");
			r=sc.nextInt();
		
		int per= (fact(n)/(fact(n-r)));
		int com= (fact(n)/fact(n-r)*fact(r));
		
		System.out.println("Permutation is"+per);
		System.out.println("combination3 is"+com);
		sc.close();
		
		
		
	}
	

}
