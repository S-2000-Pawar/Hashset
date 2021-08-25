 //Write a Java program to compare two hash set.  


import java.util.*;
class HashsetDemo9
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
      h1.add("Purpal");
     System.out.println(h1);
     HashSet<String>a = new HashSet<String>();
         for (String element : h)
         {
             System.out.println(h1.contains(element) ? "Yes" : "No");

        }
   }
}