import java.util.Scanner;
public class max3 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the three integers:");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a==b && b==c)
        {
            System.out.println("All are equal");
        }
        else if(a>=b && a>=c)
        {
            System.out.println(a+" is greatest");
        }
        else if(b>=c)
        {
            System.out.println(b+" is greatest");
        }
        else
        {
            System.out.println(c+" is greatest");
        }

    }
}
