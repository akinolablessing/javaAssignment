import java.util.Scanner;
// Scanner is a class in util package which is used to take the input from the user at run time//
  public class Numbers{
    public static void main(String[] args){
/** public is a access modifier, static is a keyword, void is the return type, main is 
    the default method name,String[] args used to pass command line arguments to java application**/
      Scanner scanner = new Scanner(System.in);
// I make a new object of the scanner class and store it in the variable input//

      System.out.print("Enter 1st number:");
      int firstNumber = scanner.nextInt();
/* The nextInt method returns the int value of the number */
     System.out.print("Enter 2nd number:");
      int secondNumber = scanner.nextInt();

      System.out.print("Enter 3rd number:");
      int thirdNumber = scanner.nextInt();

     System.out.print("Enter 4th number:");
      int forthNumber = scanner.nextInt();

      System.out.print("Enter 5th number:");
      int fifthNumber = scanner.nextInt();

    if (firstNumber < 0 || secondNumber < 0){
   System.out.printf("The negative numbers: %d%nThe negative numbers is:%d%n",firstNumber, secondNumber);
  }
   if (thirdNumber > 0 || forthNumber > 0){
  System.out.printf("The positive numbers is:%d%nThe positive numbers is:%d%n ",thirdNumber,forthNumber,fifthNumber);
  }
  if (fifthNumber==0){
  System.out.printf("Number five is %d%n",fifthNumber);
  }
 }
}