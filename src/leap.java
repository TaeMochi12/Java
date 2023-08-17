import java.util.Scanner;
public class leap {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=in.nextInt();
        if(year%400==0) System.out.println("The year is a leap year");
        else if(year%100==0) System.out.println("The year is not a leap year");
        else if(year%4==0) System.out.println("The year is a leap year");
        else System.out.println("Not a leap year");

    }

}
