import java.util.*;
class Task{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of dish you want to add in menu");
        int dish = sc.nextInt();
        // System.out.println("number of dish in menu"+dish);
        
        int[] flavour = new int[dish];  
        System.out.println("enter the flavour");

        for(int i=0; i<dish; i++){
            flavour[i]=sc.nextInt();
        }  

        System.out.println("test case");
        int test=sc.nextInt();
        int txt=0;
        while (txt<test) {

            System.out.println("how many dish you want to eat");
            int eat=sc.nextInt();
            System.out.println("add your favourite ingredient");
            int ing=sc.nextInt();
    
            // System.out.println(eat);
            // System.out.println(ing);
    
            ArrayList<Integer> first  = new ArrayList<Integer>();
            ArrayList<Integer> second  = new ArrayList<Integer>();
    
            for(int j=0;j<eat;j++){
                if(flavour[j]%ing==0){
                    first.add(j);
                }
            }
            System.out.println(first);
    
            for(int k=eat;k<dish;k++){
                if(flavour[k]%ing==0){
                    second.add(k);
                    
                        
                }
                
            }
            // Collections.sort(second,Collections.reverseOrder());
            System.out.println(second);
            int temp;
            for(int i=0;i<dish;i++){
                for (int j = 0; j < first.size(); j++){
                    for (int k = 0; k < second.size(); k++){
                        if (flavour[first.get(j)] < flavour[second.get(k)]) {
                            temp = flavour[first.get(j)];
                            flavour[first.get(j)] = flavour[second.get(k)];
                            flavour[second.get(k)] = temp;
                           
                        }
                    }
                }
            }
            int sum=0;
            for(int i=0; i<eat; i++){
                 sum += flavour[i];
            }
            System.out.println("total="+sum);

            txt++;
            
        }


       
        
       

    sc.close();


        }
    }