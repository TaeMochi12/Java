import java.util.Scanner;
public class max {
    public static void main(String[] args)
    {
        int a,b;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the two integer values:");
        a=in.nextInt();
        b=in.nextInt();
        if(a>b)
        {
            System.out.println(a+" is greater than "+b);
        }
        else if(a<b)
        {
            System.out.println(b+" is greater than "+a);
        }
        else
        {
            System.out.println("Both are equal");
        }

    }
}
