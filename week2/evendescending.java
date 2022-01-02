import java.util.Scanner;

public class evendescending
{
    static void PrintReverseOrder(int N)
{
 
    for (int i = N; i > 0; i--)
       {
           if(i%2==0)
           {
        System.out.print( +i + " ");
           }
        }
}
 

public static void main(String[] args)
{
    int N;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    N = sc.nextInt();
    PrintReverseOrder(N);
}

}
