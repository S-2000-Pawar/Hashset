//Write a Java program to empty an hash set. 


import java.util.*;
class HashsetDemo3
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