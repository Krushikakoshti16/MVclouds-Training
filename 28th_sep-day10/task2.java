import java.util.*;
public class task2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of dish you want to add in menu");
        int dish = sc.nextInt();
        // System.out.println("number of dish in menu"+dish);
        // int[] flavour = new int[dish];
        ArrayList<Integer> flavour  = new ArrayList<Integer>(dish);  
        System.out.println("enter the flavour");
        // for(int i=0; i<dish; i++){
        //     flavour[i]=sc.nextInt();
        // }  
        int d=0;
        while(d<dish) 
        { 
            flavour.add(sc.nextInt()); 
            // System.out.println(flavour.toString()); 
            d++;
        } 
        // for(int i=0;i<dish;i++){
        //     flavour.add(sc.nextInt());

        // }
        

        System.out.println("how many dish you want to eat");
        int eat=sc.nextInt();
        System.out.println("add your favourite ingredient");
        int ing=sc.nextInt();

        // System.out.println(eat);
        // System.out.println(ing);

        ArrayList<Integer> first  = new ArrayList<Integer>();
        for(int i = eat; i < dish; i++){
            if(flavour.get(i)%ing==0){
                first.add(flavour.get(i));
            }
        }
        System.out.println(first);

        for(int i = 0; i < eat; i++){
            Collections.sort(first, Collections.reverseOrder());
            System.out.println(first);
            int a =first.remove(0);
            if(a>flavour.get(i) && flavour.get(i)%ing==0){
                int b=flavour.get(i);
                a=a+b;
                b=a-b;
                a=a-b;
                
            }
            first.add(a);
            

        }

            int sum=0;
            for(int i=0; i<eat; i++){
                 sum += flavour.get(i);
            }
            System.out.println("total="+sum);


            

         sc.close();
    }
}
