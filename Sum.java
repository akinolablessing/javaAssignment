import java.util.Scanner;
// Scanner is a class in util package which is used to take the input from the user at run time//
  public class Sum{
/* My class name is Sum */
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
 /** I make a new object of the scanner class and I store it in the variable input **/

    System.out.print("Enter number between 0 and 1000: ");
    int number = scanner.nextInt();

    int division = number / 100;
   System.out.printf("result is:%d%n",division);

   int middle = (number/ 10)%10;
   System.out.printf("result is:%d%n",middle);

  int modulus = number % 10;
   System.out.printf("result is:%d%n",modulus);

  int sum = division + middle + modulus;
  System.out.printf("result is:%d%n",sum);

 }
}