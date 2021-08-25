// Write a Java program to convert a hash set to a tree set. 




import java.util.*;
class HashsetDemo7
{
   public static void main(String[] args)
   {
      HashSet<String>h=new HashSet<String>();               
      h.add("Pink");
      h.add("White");
      h.add("Yellow");
      h.add("Gray");
     System.out.println(h);
     Set<String>treeset=new TreeSet<String>(h);
     System.out.println("Treeset elements: ");
      for(String element : treeset)
      {
        System.out.println(element);
     }
  }
}



