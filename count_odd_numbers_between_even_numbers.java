import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,i,x[],count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
         x[i]=sc.nextInt();
        
        for(i=1;i<n-1;i++)
        {
            if(x[i-1]%2==0 &&  x[i+1]%2==0)
            {
                if(x[i]%2==1)
                     count++;
            }
        }
        System.out.println(count);
         
    }
}