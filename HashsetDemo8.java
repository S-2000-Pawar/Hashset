//Write a Java program to convert a hash set to a List/ArrayList.


import java.util.*;
class HashsetDemo8
{
   public static void main(String[] args)
   {
      HashSet<String>h=new HashSet<String>();               
      h.add("Pink");
      h.add("White");
      h.add("Yellow");
      h.add("Gray");
     System.out.println(h);
    List<String>l=new ArrayList<String>(h);
    System.out.println("Arraylist" +l);

  }
}