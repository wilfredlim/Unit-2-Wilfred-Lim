import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
public class Store{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
      
        final double BOOKS = 9.0;
        final double MOVIES = 13.97;
        final double NUTS_PER_POUND = 1.72;
        final double BOOK_SHIP = 0.95;
        final double MOVIE_SHIP = .04;
        final double NUT_SHIP_POUND = 0.30;
        final double TAX = 0.072;

        System.out.print("Thank you for shopping at");
        System.out.print("STEVE'S S-MART \n");
        System.out.print("Your cashier today: George H. \n");
        System.out.println ("Enter number of books ordered:");
        double totBook = scan.nextDouble();
        System.out.println ("Enter number of movies ordered:");
        double totMovie = scan.nextDouble();
        System.out.println("Enter amount of peanuts (pounds) ordered:");
        double totNutPound = scan.nextDouble();

        double book$ = (totBook * BOOKS);
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println("Book Price: " + fmt.format(book$));
        double movie$ = (totMovie * MOVIES);
        System.out.println("Movie Total Price: " + movie$);
        double nut$ = (totNutPound * NUTS_PER_POUND);
        System.out.println("Nuts Total Price: " + nut$);

        double bkShip = (totBook*BOOK_SHIP);
        double movShip = (movie$*MOVIE_SHIP);
        double nutShip= (totNutPound*NUT_SHIP_POUND);
        double totShip = (bkShip + movShip + nutShip);
        double totTax = ((book$ + movie$) * TAX);
        System.out.println("Total shipping cost: " + fmt.format(totShip));

        System.out.println("Tax: " + fmt.format(totTax));

        System.out.print("Your Total Today:");
        System.out.print(fmt.format(book$ + movie$ + nut$ + totShip + totTax));

        int hour = (rand.nextInt(25));
        int minute = (rand.nextInt(60));
        int second = (rand.nextInt(60));

        System.out.println("Time:"+hour+":"+minute+":"+second+"");
      }

}
