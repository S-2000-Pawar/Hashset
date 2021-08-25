 //Write a Java program to iterate through all elements in a hash list. 


import java.util.HashSet;
import java.util.Iterator;
class HashsetDemo1
{
   public static void main(String[] args)
   {
      HashSet<String>h=new HashSet<String>();
      h.add("Pink");
      h.add("White");
      h.add("Yellow");
      h.add("Gray");
     System.out.println(h);
      Iterator<String> s = h.iterator();
     while(s.hasNext())
     {
        System.out.println(s.next());
     }
  }
}