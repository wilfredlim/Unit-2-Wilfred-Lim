import java.util.Scanner;

/**
 * Write a description of class ScanPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScanPractice
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a three numbers and get an average!");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int avgNum = ((num1 + num2 + num3)/3);

        System.out.println("The average of " + num1 + ", " + num2 + ", and "
        + num3 + " is = " + avgNum);
    }
}
