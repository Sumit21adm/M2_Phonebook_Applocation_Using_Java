import java.util.*;

public class activity01
{
   public static void strcat(String s1,String s2)
   {
      System.out.print(s1+s2);
   }
   public static void main(String[] args){
    Scanner s =new Scanner(System.in);
    String s1=s.nextLine();
    String s2=s.nextLine();
    strcat(s1,s2);
    s.close();
 }
}