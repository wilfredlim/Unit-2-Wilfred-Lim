import java.util.Scanner;
public class ScanNumbers
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a two numbers! (with a space or enter between numbers)" );

        double num1 = scan.nextInt();
        double num2 = scan.nextInt();

        double sum  = (num1 + num2);
        double diff = (num1 - num2);
        double prod = (num1*num2);
        double quot = (num1/num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is = " + sum);
        System.out.println("The difference of " + num1 + " and " + num2 + " is = " + diff);
        System.out.println("The product of " + num1 + " and " + num2 + " is = " + prod);
        System.out.println("The quotient of " + num1 + " and " + num2 + " is = " + quot);
    }
}
