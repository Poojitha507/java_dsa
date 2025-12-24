import java.util.Scanner;
public class Prime {
  public static void main(String[] args) {
    int c,count=0;
    System.out.println("enter a number:");
    Scanner in = new Scanner(System.in);
    int num=in.nextInt();
    
    if(num<=1)
    {
      System.out.print("neither prime nor composite");
    }
    else
    {
      c=2;
      while(c<=num/2)
      {
        if(num%c==0)
        {
          
          count++;
          break;
        }
       c++;
      }
      if(count==0)
        {
          System.out.println("prime nuber");
        }
        else{
        System.out.println("not a prime nuber");

        }
      
    
    }
    in.close();
  }
}
