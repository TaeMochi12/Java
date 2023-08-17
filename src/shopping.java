import java.util.Scanner;
public class shopping {
    static void printfn(float price,float dis,float pay)
    {
        System.out.println("YOUR NET BILLING STATEMENT:");
        System.out.println("Total Price:Rs."+price);
        System.out.println("Discount:Rs."+dis);
        System.out.println("Total Payable Amount:Rs."+(pay));
    }
    static void bprint(float hprice,float rprice,float hdis,float rdis)
    {
        System.out.println("YOUR NET BILLING STATEMENT:");
        System.out.println("Total Price of Hand Loom Garments:Rs."+hprice);
        System.out.println("Discount on Hand Loom:Rs."+hdis);
        System.out.println("Total Price of Ready Made Garments:Rs."+rprice);
        System.out.println("Discount on Ready Made Garments:Rs."+rdis);
        System.out.println("Total Discount:Rs."+(hdis+rdis));
        System.out.println("Total Payable Amount:Rs."+((hprice-hdis)+(rprice-rdis)));
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        float rdis,hdis,hprice,rprice;
        String sh;
        System.out.println("What did you shop?\nh:Hand loom\nr:Ready made\nb:Both,Hand loom and Ready made\nn:None");
        sh=in.nextLine();
        switch(sh)
        {
            case "h":
            {
                System.out.println("Enter the price of your hand loom clothes:");
                hprice=in.nextFloat();
                if(hprice>=1000 && hprice<=5000)
                {
                    hdis= (float) ((0.25)*hprice);
                    printfn(hprice,hdis,(hprice-hdis));
                }
                else if(hprice>=5000 && hprice<=10000)
                {
                    hdis=(float) ((0.35)*hprice);
                    printfn(hprice,hdis,(hprice-hdis));
                }
                else if(hprice>=10000 && hprice<=20000)
                {
                    hdis=(float) ((0.65)*hprice);
                    printfn(hprice,hdis,(hprice-hdis));
                }
                else if(hprice>20000)
                {
                    System.out.println("YOUR NET BILLING STATEMENT:");
                    System.out.println("Total Price:Rs."+hprice);
                    System.out.println("Hurray you got free membership!");
                    System.out.println("Discount:Rs.0");
                    System.out.println("Total Payable Amount:Rs."+hprice);
                }
                else {
                    hdis=0;
                    printfn(hprice,hdis,(hprice-hdis));
                }
                break;
            }
            case "r":
            {
                System.out.println("Enter the price of your ready made clothes:");
                rprice=in.nextFloat();
                if(rprice>=500 && rprice<=1000)
                {
                    rdis= (float) ((0.25)*rprice);
                    printfn(rprice,rdis,(rprice-rdis));
                }
                else if(rprice>=1000 && rprice<=2500)
                {
                    rdis=(float) ((0.35)*rprice);
                    printfn(rprice,rdis,(rprice-rdis));
                }
                else if(rprice>=2500 && rprice<=7500)
                {
                    rdis=(float) ((0.55)*rprice);
                    printfn(rprice,rdis,(rprice-rdis));
                }
                else {
                    rdis=0;
                    printfn(rprice,rdis,(rprice-rdis));
                }
                break;
            }
            case "b":
            {
                System.out.println("Enter the price of your hand loom clothes:");
                hprice=in.nextFloat();
                System.out.println("Enter the price of your ready made clothes:");
                rprice=in.nextFloat();
                if(hprice>=1000 && hprice<=5000)
                {
                    hdis= (float) ((0.25)*hprice);
                }
                else if(hprice>=5000 && hprice<=10000)
                {
                    hdis=(float) ((0.35)*hprice);
                }
                else if(hprice>=10000 && hprice<=20000)
                {
                    hdis=(float) ((0.65)*hprice);
                }
                else if(hprice>20000)
                {
                    System.out.println("Hurray you got Free Membership!");
                    hdis=0;
                }
                else {
                    hdis=0;
                }

                if(rprice>=500 && rprice<=1000)
                {
                    rdis= (float) ((0.25)*rprice);
                }
                else if(rprice>=1000 && rprice<=2500)
                {
                    rdis=(float) ((0.35)*rprice);
                }
                else if(rprice>=2500 && rprice<=7500)
                {
                    rdis=(float) ((0.55)*rprice);
                }
                else {
                    rdis=0;
                }
                bprint(hprice,rprice,hdis,rdis);
                break;
            }
            case "n":
            {

                bprint(0,0,0,0);
                break;
            }

        }
    }
}
