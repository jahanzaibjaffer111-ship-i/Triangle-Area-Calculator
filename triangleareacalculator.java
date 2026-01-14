import java.util.Scanner;
public class triangleareacalculator
{
    public static void main(String[] args)
    {
        /*a=area
        s=semi perimeter
        b=first length
        c=second length
        d=thirth length */
        double a,s,b,c,d;
        try (Scanner read = new Scanner(System.in)) {
            while(true)
            {
                System.out.println("HELLO");
                System.out.println("WELCOME TO TRIANGLE AREA CALCULATOR");
                System.out.println("ENTRE FIRST LENGTH OF TRIANGLE");
                b=read.nextDouble();
                if(b>0)
                {
                    System.out.println("ENTRE SECOND LENGTH OF TRIANGLE");
                    c=read.nextDouble();
                    if(c>0)
                    {
                        System.out.println("ENTRE THIRTH LENGTH OF TRIANGLE");
                        d=read.nextDouble();
                        if(d>0)
                        {
                            s=(b+c+d)/2;
                            a =Math.sqrt(s*(s-b)*(s-c)*(s-d));
                            System.out.println("SEMI PERIMETER OF TRIANGLE IS");
                            System.out.println(s);
                            System.out.println("AREA OF TRINAGLE IS");
                            System.out.println(a);
                            System.out.println("THANKS");
                            System.out.println("BYE");
                            System.out.println(".");
                        }
                        if(d<0)
                        {
                            System.out.println("LENGHT OF TRIANGLE CANT BE NEGATIVE");
                            System.out.println("TRY AGAIN");
                            System.out.println(".");
                        }
                    }
                    if(c<0)
                    {
                        System.out.println("LENGHT OF TRIANGLE CANT BE NEGATIVE");
                        System.out.println("TRY AGAIN");
                        System.out.println(".");
                    }
                }
                if(b<0)
                {
                    System.out.println("LENGHT OF TRIANGLE CANT BE NEGATIVE");
                    System.out.println("TRY AGAIN");
                    System.out.println(".");
                }
            }
        }
    }

}
