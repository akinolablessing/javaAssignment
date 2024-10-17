import java.util.Scanner;
  public class Palindrome{
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number between 0 and 1000: ");
    int number = scanner.nextInt();

    int division = number / 100;
   System.out.printf("result is:%d%n",division);

   int modulus = number  % 10;
   System.out.printf("result is:%d%n",modulus);
 }
}