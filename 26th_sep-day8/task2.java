import java.util.*;
public class task2 {
public static void main(String args[]) {
	int a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	a= sc.nextInt();
	System.out.println("enter a number");
	b= sc.nextInt();
	System.out.println("number");
	System.out.println("a="+a);
	System.out.println("b="+b);
	a= a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swap");
	System.out.println("a="+a);
	System.out.println("b="+b);
	sc.close();
	
	
	
	
	
	
}

}
