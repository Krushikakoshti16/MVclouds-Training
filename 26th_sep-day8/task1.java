

class a{  
void walk(){System.out.println("walking");}  
}  
class b extends a{  
void run(){System.out.println("running");}  
}  
class c extends b{  
void eat(){System.out.println("eating");}  
}  
class task1{  
public static void main(String args[]){  
c obj=new c(); 
obj.eat();
obj.run();
obj.walk();  
}}  
