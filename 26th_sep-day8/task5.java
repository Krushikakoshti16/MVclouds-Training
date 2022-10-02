
import java.util.*;
public class task5{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		String str1=sc.nextLine();
		System.out.println("you enter:"+str1);
		char []arr= str1.toCharArray();
		Arrays.sort(arr);
		System.out.print(str1.valueOf(arr));
		sc.close();
		
		
	}
}