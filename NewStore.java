import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
public class NewStore{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        /*
         * All of the prices of items and costs of shipping and taxes
         */
        final double BOOKS = 9.0;
        final double MOVIES = 13.97;
        final double NUTS_PER_POUND = 1.72;
        final double BOOK_SHIP = 0.95;
        final double MOVIE_SHIP = .04;
        final double NUT_SHIP_POUND = 0.30;
        final double TAX = 0.072;

        System.out.println ("How many books would you like?");
        int totBook = scan.nextInt();
        System.out.println ("How many movies would you like?");
        int totMovie = scan.nextInt();
        System.out.println("How many pounds of peanuts would you like?");
        double totNutPound = scan.nextDouble();

        DecimalFormat fmt = new DecimalFormat("0.00");

        /*
         * Here are the total prices of each item depending on number of items
         */
        double book$ = (totBook * BOOKS);
        double movie$ = (totMovie * MOVIES);
        double nut$ = (totNutPound * NUTS_PER_POUND);

        /*
         * These are the total prices of shipping and taxing
         * Depending on number of items
         */
        double bkShip = (totBook*BOOK_SHIP);
        double movShip = (movie$*MOVIE_SHIP);
        double nutShip= (totNutPound*NUT_SHIP_POUND);
        double totShip = (bkShip + movShip + nutShip);
        double totTax = ((book$ + movie$) * TAX);

        /*
         * These are variables to display a random time and date
         */
        int hour = (rand.nextInt(24));
        int minute = (rand.nextInt(60));
        int second = (rand.nextInt(60));
        int month = (rand.nextInt(12)+1);
        int day = (rand.nextInt(30)+1);
        int year = (rand.nextInt(29)+1990);

        System.out.println("");
        System.out.println("           THANK YOU FOR SHOPPING AT");
        System.out.println("                STEVE'S S-MART");
        System.out.println("               ORDER NUMBER:"+rand.nextInt(100)+1);
        System.out.println("            CASHIER TODAY: GEORGE H.");
        System.out.print("          DATE/TIME:"+month+"/"+day+"/"+year);
        System.out.print(" "+hour+":"+minute+":"+second+"\n");
        System.out.println("");
        System.out.print(totBook+" BOOKS                                $");
        System.out.println(fmt.format(book$));
        System.out.print(totMovie+" MOVIES                               $");
        System.out.println(fmt.format(movie$));
        System.out.print(totNutPound+" LBS OF PEANUTS                     $");
        System.out.println(fmt.format(nut$));
        System.out.println("");
        System.out.print("                         SUBTOTAL:     $");
        System.out.println(fmt.format(book$+movie$+nut$));
        System.out.print("                              TAX:     $");
        System.out.println(fmt.format(totTax));
        System.out.print("                    SHIPPING COST:     $");
        System.out.println(fmt.format(totShip));
        System.out.println("");
        System.out.print("                      GRAND TOTAL:     $");
        System.out.println(fmt.format(book$ + movie$ + nut$ + totShip + totTax));
        System.out.println("");
        System.out.println("          X_________________________");
        System.out.println("              HAVE THE NICE DAY! :)");
        System.out.println("");
    }
}
