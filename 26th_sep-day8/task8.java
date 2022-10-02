 
public class task8  {  
	public static void main(String[] args){  
		int i, j, n=6;  
		for (i=1; i<= n ; i++){  
			for (j = i; j <= n ; j++){  
				System.out.print(" ");  
			} 
			
			for(j=1;j<i;j++) {
				if(i==n||j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(j=1;j<=i;j++) {
				if(i==n||j==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			// for(j=1;j<i;j++) {
			// 	if(j==i-1 && j<n-1) {
			// 		System.out.print("*");
			// 	}
			// } 
			System.out.println();  
		}  
	}  
}  
