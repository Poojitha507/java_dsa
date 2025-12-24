import java.util.Scanner;
public class Leapyear {
  public static void main(String[] args) {
    System.out.println("enter a year:");
    Scanner in=new Scanner(System.in);
    int year = in.nextInt();
    if(year%4==0 && year%100!=0 || year%100==0 )
    {
      System.out.println(year + "is leap year");
    }
    else{
      System.out.println(year + "is not leap year");

    }
    in.close();
  }
}
