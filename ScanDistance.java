import java.util.Scanner;
public class ScanDistance
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first x value and y value: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();

        System.out.print("Enter your next x value and y value: ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double dist = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)),.5);

        System.out.printf("The distance between the two points is " + dist + "units!");
    }
}
