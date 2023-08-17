import java.util.Scanner;
public class Hello {
    public static void main(String[] args)
    {
     Scanner in= new Scanner(System.in);
     int salary=0;
     float Bonus=0.0f;
     String Name=" ";
        System.out.println("Enter the name of the employee:");
        Name=in.nextLine();
        System.out.println("Enter the salary of the employee:");
        salary=in.nextInt();
        System.out.println("Enter the bonus of the employee:");
        Bonus=in.nextFloat();
        System.out.println("Name:"+Name);
        System.out.println("Salary:"+salary);
        System.out.println("Bonus:"+Bonus);


    }
}
