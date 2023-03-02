import java.util.Scanner;

public class A1113310_0224_2
{
    public static void main(String []args)
    { 
        int num;
        System.out.print("enter the temperature in celcius: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        int apply = (((num*9)/5)+32);
        System.out.println(+apply+ "Farenheit");
    }

}