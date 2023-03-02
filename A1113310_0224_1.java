import java.util.Scanner;


public class A1113310_0224_1 
{
    public static void main(String [] args)
    {
        int num;
        System.out.print("enter number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        String result = (num % 2 == 0)? "even" : "odd";
        System.out.println(+num + " is " + result);
     }
    
}
