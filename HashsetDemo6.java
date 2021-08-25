//Write a Java program to convert a hash set to an array.

import java.util.*;
class HashsetDemo6
{
   public static void main(String[] args)
   {
      HashSet<String>h=new HashSet<String>();
      h.add("Pink");
      h.add("White");
      h.add("Yellow");
      h.add("Gray");
     System.out.println(h);
     String[] a=new String[h.size()];
     h.toArray(a);
     System.out.println("Array elements: ");
      for(String element : a)
      {
        System.out.println(element);
     }
  }
}
