
import java.util.*;
class task3 {
   public static void main(String args[]) {
       Scanner sc= new Scanner(System.in);
       System.out.println("how mant element you want to add in list?");
       int n= sc.nextInt();
       System.out.println("enter the element of list");
       List<Integer> arr= new ArrayList<>();
       for(int i=0;i<n;i++){
           arr.add(sc.nextInt());
       }

       if(isListOdd(arr)) {
           System.out.println("List contains only odd elements");
       }
       else{
           System.out.println("list doesn't contains only odd elements");
       }
       sc.close();
   }
   static boolean isListOdd(List<Integer> arr)
   {
       for(int i:arr){
           if(i%2==0)
               return false;
       }
       return true;
   }
}