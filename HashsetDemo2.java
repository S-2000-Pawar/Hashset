//Write a Java program to get the number of elements in a hash set.  




import java.util.*;
class HashsetDemo2
{
   public static void main(String[] args)
   {
      HashSet<String>h=new HashSet<String>();
      h.add("Pink");
      h.add("White");
      h.add("Yellow");
      h.add("Gray");
     System.out.println(h);
     System.out.println("size of elements" +h.size());
  }
}