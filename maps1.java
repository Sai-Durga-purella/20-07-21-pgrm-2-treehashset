import java.util.*;

class map1

{
  
public static void main(String args[])
  
{
    
HashMap<Integer,String>x=new HashMap<Integer,String>();
    
x.put(5,"john");
    
x.put(1,"sam");
    
x.put(7,"kim");
   
TreeMap<Integer,String>t=new TreeMap<Integer,String>();
    
 System.out.println(x);
  
}

}



output:
         {1=sam, 5=john, 7=kim}