import java.util.Scanner;
class Disarium
{
    public static void main(String args[])
    {
        int n,i,r,temp,d=0,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(temp>0)
        {
            d++;
            temp=temp/10;
        }
        temp=n;
        while(temp>0)
        {
            r=temp%10;
            sum=sum+(int)Math.pow(r,d);
            temp=temp/10;
            d--;
        }
        if(n==sum)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}