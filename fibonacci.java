import java.util.*;
public class Fibonacci 
{
   public static void Fib(int n)
   {
      int first=0;
      int second=1;
      System.out.print("The Fibonacci Sequence: ");
      for(int i =1;i<=n;i++)
        {
           System.out.print(" " + first);
           int Result = first + second;
           first=second;
           second = Result;
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n = sc.nextInt();
        Fib(n);
    }
}
