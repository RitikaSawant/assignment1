import java.util.Scanner;
public class Pattern
{
   public static void main(String args[])
   {
   	Scanner sc = new Scanner (System.in);
   	System.out.println("Enter your name: ");
   	String name=sc.nextLine();
    int ch=name.length();
    for (int i=1;i<=ch;i++)
     {
     	for (int j=1;j<i;j++)
     	 {
          System.out.print(" "); 		
     	}
       for(int k=i;k<ch;k++)
       {
         System.out.print(name.charAt(k-1));
       }
    	System.out.println( );
    }
   }
 }