import java.util.Scanner;
public class ScanTime
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hours, minutes, and seconds!");

        double hours = scan.nextInt();
        double min = scan.nextInt();
        double sec = scan.nextInt();

        double totSec =((hours*3600)+(min*60)+sec);

        System.out.println("That is " + totSec + " in seconds!");
    }
}
