import java.util.Scanner;
public class alpha {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter character:");
        char ch=in.next().charAt(0);
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
            System.out.println("The character is an alphabet letter");
        }
        else System.out.println("The character is not a letter of alphabet");
    }
}
