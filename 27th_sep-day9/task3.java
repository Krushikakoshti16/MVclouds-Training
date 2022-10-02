

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
			System.out.println("Enter a string : ");
			String str = sc.nextLine();
			str = str+" ";
			String rev ="", word ="";
			for(int i=0;i<str.length();i++)
			{
				char c = str.charAt(i);
				if(c != ' ')
				{
					word = word + c;
				}
				else {
					rev = word+" "+rev;
					word="";
				}
			}
			System.out.println("String reversed : "+rev);
			sc.close();
		}
		

	}


