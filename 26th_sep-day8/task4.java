
import java.util.*;

public class task4 {
	public static void main(String args[]) {
		String a;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string");
		a = sc.nextLine();
		char[] b = a.toCharArray();  
        // System.out.println(b);
        StringBuffer stringBuffer = new StringBuffer();  
        for (int i = 0; i < b.length; i++) {  
            if ((b[i] != ' ') && (b[i] != '\t')) {  
                stringBuffer.append(b[i]);  
            }
            
        } 
        String str= stringBuffer.toString();
        System.out.println(str);
        sc.close();
        
	}
	

}
