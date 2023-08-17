import java.util.Scanner;
public class div5and11 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=in.nextInt();
        if(n%5==0 && n%11==0) System.out.println("The number is divisible by 5 and 11");
        else System.out.println("Not divisible by 5 and 11");
    }
}
