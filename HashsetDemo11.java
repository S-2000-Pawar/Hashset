//Write a Java program to remove all of the elements from a hash set.

import java.util.*;
class HashsetDemo11
{
   public static void main(String[] args)
   {
      HashSet<String>h=new HashSet<String>();
      h.add("Pink");
      h.add("White");
      h.add("Yellow");
      h.add("Gray");
     System.out.println(h);
     h.removeAll(h);
    System.out.println("removing elements" +h);
  }
}