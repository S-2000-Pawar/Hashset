//Write a Java program to clone a hash set to another hash set.


import java.util.*;
class HashsetDemo5
{
   public static void main(String[] args)
   {
      HashSet<String>h=new HashSet<String>();
      h.add("Pink");
      h.add("White");
      h.add("Yellow");
      h.add("Gray");
     System.out.println(h);
     HashSet <String>h1 = new HashSet <String> ();
      h1 = (HashSet)h.clone();
     System.out.println("Cloned Hash Set: " + h1); 
  }
}