public class StringPractice{
  public static void main(String[] args){

    String message;
    message = "JackandJillwentupthehill";
    System.out.println(message.substring(message.length()-4));

    String word1 = "Hello";
    String word2 = word1;
    word1 = word1.substring(1, 2);
    System.out.println(word2);
  }
}
