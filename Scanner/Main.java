import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    // 1. Create your Scanner object to get input from the keyboard.
    Scanner myScan = new Scanner(System.in);

    // 2. Create a statement that ask the user their name "Hello please tell me your name?".

    System.out.println("Hello please tell me your name?");
    // 3. Create a variable that holds the users input from the keyboard. 

    String name = myScan.nextLine();
    // 4. Make a print statement that returns "Hello" + variable for your name + ", it is nice to meet you."
    System.out.println("Hello " + name + ", it is nice to meet you.");

    // 5. Create another statement that asks the user "What state do you live in?". 
    System.out.println("What state do you live in?");
    // 6. Create a variable that takes in the state the user lives in.
    String state = myScan.nextLine();

    // 7. Create a print statement that asks "How old are you?".
    System.out.println("How old are you?");
    // 8. Create a variable that takes in how old they are from the keyboard.
    String age = myScan.nextLine();

    // 9. Close your Scanner object. 
    myScan.close();
   
    // 10. Finish by combining your user inputs to one print statement. (See sample output for example)
    System.out.println(name + ", I am also " + age + " and hear that " + state + " is beautiful!");
    
  }
}