import java.util.Scanner;
public class posneg {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the integer:");
        int n=in.nextInt();
        if(n>0) System.out.println(n+" is positive");
        else if(n<0) System.out.println(n+" is negative");
        else System.out.println(n+" is zero");
    }
}
