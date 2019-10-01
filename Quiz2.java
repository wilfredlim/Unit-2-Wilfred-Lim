import java.util.Scanner;
public class Quiz2 {
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter in a number between 1 and 100");

    int userNumber = (scan.nextInt());
    int randomNumber = ((int)(Math.random()*100)+1);
    int luckyNumber = (Math.abs(userNumber-randomNumber));
    System.out.println("Your lucky number is "+luckyNumber+"!");
  }
}
