import java.util.Scanner; 
/**
 *This program will tell the user if the entered integer a prime number or not
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);
    // ask the user for an integer
    System.out.println("Which number would you like to check?");
    // prompt the user for the integer 
    int userInteger = input.nextInt(); 
    // create a variable for count 
    int count = 1;
    // declare a variable to store primeNumber
    int primeNumber;
    // make a while loop 
    while( count <= userInteger){
      // divide the integer from all the numbers between 1 and itself
     primeNumber = userInteger / count ;
     // add one to the count as it goes 
     count = count + 1;
     // make an if statement to see if it is a prime number 
     if ( primeNumber == 1 && primeNumber == userInteger){
       System.out.println( userInteger + " is a prime number");
       // make an else statement for the non prime numbers
     }else 
     System.out.println( userInteger + " is not a prime number");
     // stop so it does not go forever
     break;
    }
  }
}
