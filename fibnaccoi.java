import java.util.*;
class Fibnaccoi
{
    int number(int n)
    {
      int   first=0, second=1, next;
      for(int i=1; i<=n; i++)
      {
          next = first+second;
          System.out.println(first + " ");
          first = second;
          second = next;
      }
                return n;

    }
}
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Fibnaccoi f = new Fibnaccoi();
        f.number(n);
    }
}
