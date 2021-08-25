 //Write a Java program to append the specified element to the end of a hash set.


import java.util.HashSet;
class HashsetDemo
{
   public static void main(String[]args)
   {
     HashSet<String>h=new HashSet<String>();
     h.add("Tom");
     h.add("Jerry");
     h.add("Cartoon");
     h.add("Tiger");
     System.out.println(h);
  }
}
