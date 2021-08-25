//Write a Java program to test a hash set is empty or not.


import java.util.*;
class HashsetDemo4
{
   public static void main(String[] args)
   {
      HashSet<String>h=new HashSet<String>();
      h.add("Pink");
      h.add("White");
      h.add("Yellow");
      h.add("Gray");
     System.out.println(h);
     System.out.println(h.isEmpty());
     h.removeAll(h);
     System.out.println(h.isEmpty());
     System.out.println("removing elements" +h);
  }
}