public class Quiz1 {
  public static void main(String[]args){
    String firstName = "Sofia";
    String middleName = "Maria";
    String lastName = "Hernadez";
    String firstFirst = (firstName.substring(0,1));
    String middleFirst = (middleName.substring(0,1));
    String lastFirst = (lastName.substring(0,1));
    String lowerInitials = firstFirst.toLowerCase()+middleFirst.toLowerCase()+lastFirst.toLowerCase();
    System.out.println(lowerInitials);
  }
}
