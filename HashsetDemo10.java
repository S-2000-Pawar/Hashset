
//Write a Java program to compare two sets and retain elements which are same on both sets


import java.util.*;
class HashsetDemo10
{
   public static void main(String[] args)
   {
      HashSet<String>h=new HashSet<String>();               
      h.add("Pink");
      h.add("White");
      h.add("Yellow");
      h.add("Gray");
     System.out.println(h);
     HashSet<String>h1=new HashSet<String>();               
      h1.add("Red");
      h1.add("Black");
      h1.add("Orange");
      h1.add("Pink");
     System.out.println(h1);
     h.retainAll(h1);
     System.out.println("HashSet content:");
     System.out.println(h);
   }
}