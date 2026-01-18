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
                System.out.println("Hello");
                System.out.println("Welcome to Triangle Area Calculator");
                System.out.println("Enter First Length of Triangle");
                b=read.nextDouble();
                if(b>0)
                {
                    System.out.println("Enter Second Length of Triangle");
                    c=read.nextDouble();
                    if(c>0)
                    {
                        System.out.println("Enter Third Length of Triangle");
                        d=read.nextDouble();
                        if(d>0)
                        {
                            s=(b+c+d)/2;
                            a =Math.sqrt(s*(s-b)*(s-c)*(s-d));
                            System.out.println("Semi Perimeter of Triangle is");
                            System.out.println(s);
                            System.out.println("Area of Triangle is");
                            System.out.println(a);
                            System.out.println("Thank you");
                            System.out.println("Bye");
                            System.out.println(".");
                        }
                        else if(d<0)
                        {
                            System.out.println("Length of Triangle can't be negative");
                            System.out.println("Try again");
                            System.out.println(".");
                        }
                        else if(d==0)
                        {
                            System.out.println("Length of Triangle can't be zero");
                            System.out.println("Try again");
                            System.out.println(".");
                        }
                    }
                    else if(c<0)
                    {
                        System.out.println("Length of Triangle can't be negative");
                        System.out.println("Try again");
                        System.out.println(".");
                    }
                    else if(c==0)
                    {
                        System.out.println("Length of Triangle can't be zero");
                        System.out.println("Try again");
                        System.out.println(".");
                    }
                }
                else if(b<0)
                {
                    System.out.println("Length of Triangle can't be negative");
                    System.out.println("Try again");
                    System.out.println(".");
                }
                else if(b==0)
                {
                    System.out.println("Length of Triangle can't be zero");
                    System.out.println("Try again");
                    System.out.println(".");
                }
            }
        }
    }

}

