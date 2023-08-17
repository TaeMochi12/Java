public class first {
    public static void main(String[] args)
    {
        int bs,ta,da,hra,pf,med,gs,age,bonus;
        age=34;
        bonus=0;
        bs=14500;
        ta=(5*bs)/100;
        da=(95*bs)/100;
        hra=(25*bs)/100;
        pf=(10*bs)/100;
        med=(3*bs)/100;

        gs=(bs+ta+da+hra+med)-pf;
        if(age>=30 && age<=40)
        {
            bonus=(25*gs)/100;
        }
        else if(age>=40 && age<=50)
        {
            bonus=(50*gs)/100;
        }
        else if(age>=50 && age <=65)
        {
            bonus=(70*gs)/100;
        }
        else if(age>65)
        {
            System.out.println("Sorry no bonus for you,you are at your retirement age!");
        }
        System.out.println("Your salary slip is:");
        System.out.println("Your Basic Salary is:"+bs);
        System.out.println("Your TA is:"+ta);
        System.out.println("Your DA is:"+da);
        System.out.println("Your HRA is:"+hra);
        System.out.println("Your PF is:"+pf);
        System.out.println("Your MED is:"+med);
        System.out.println("Your GS is:"+gs);
        System.out.println("Your bonus:"+bonus);
        System.out.println("Your GS after bonus:"+(gs+bonus));
        System.out.println("If any query,contact HR department.");

    }

}
