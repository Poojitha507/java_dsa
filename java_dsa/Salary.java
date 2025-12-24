import java.util.Scanner;
public class Salary {
  public static void main(String[] args) {
    
   System.out.print("enter the salary");
    
    Scanner in = new Scanner(System.in);
    int sal=in.nextInt();
    if(sal>100000)
    {
      sal+=5000;
    }
    else
    {
      sal+=10000;
    }
        System.out.print(" the salary:" + sal);
in.close();
  }
}
