import java.util.Random;

  public class RandomNumber{
    public static void main(String[] args){
      Random rand = new Random();

      System.out.println("Random numbers generated with Random class:");
      System.out.println("Number between 0 and 9 is " + rand.nextInt(10));
      System.out.println("Number between 1 and 10 is " + (rand.nextInt(10) + 1));
      System.out.println("Number between 20 and 34 is " + (rand.nextInt(15) + 20));
      System.out.println("Number between -10 and 9 is " + (rand.nextInt(20) - 10));
      System.out.println("Number between 0 and 1 is " + rand.nextDouble());
      System.out.println("Number between 0 and 6 is " + (rand.nextDouble() * 6));
      System.out.println("                                ");
      System.out.println("Random numbers generated with Math class:");
      System.out.println("Number between 0 and 9 is " + (int) (Math.random() * 10));
      System.out.println("Number between 1 and 10 is " + (int) ((Math.random() * 10)+1));
      System.out.println("Number bsn 20 and 34 is " + (int) ((Math.random() * 15)+20));
      System.out.println("Number between 0 and 1 is " + Math.random());
      System.out.println("Number between 0 and 6 is " + (Math.random() * 6));


    }
  }
