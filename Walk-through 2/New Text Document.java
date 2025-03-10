import java.util.Random;
import java.util.Scanner;

public class JavaControlFlowMaster {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        // Check Age
        System.out.print("Tell me your age: ");
        int personAge = inputReader.nextInt();

        if (personAge >= 18) {
            System.out.println("Nice, your a grown-up!");
        } else {
            System.out.println("I see, your still young.");
        }

        //Checking Even or Odd
        System.out.print("Now, give me any number: ");
        int anyNumber = inputReader.nextInt();

        if (anyNumber % 2 == 0) {
            System.out.println("That is an even number.");
        } else {
            System.out.println("And that is an odd number.");
        }

        //Displaying Day of the Week (Switch-Case)
        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = inputReader.nextInt();

        System.out.print("That number corresponds to: ");
        switch (dayNumber) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Sorry, I don't recognize that day.");
        }

        //Counting Down (While Loop)
        System.out.println("Let's count down from 10:");
        int counter = 10;
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        //Guessing Game (Do-While Loop)
        Random numberGenerator = new Random();
        int secret = numberGenerator.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("I've picked a number between 1 and 100. Try to guess it!");

        do {
            System.out.print("Your guess: ");
            guess = inputReader.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println("Too low, try again!");
            } else if (guess > secret) {
                System.out.println("Too high, give it another shot!");
            } else {
                System.out.println("You got it! It took you " + attempts + " tries.");
            }
        } while (guess != secret);

        //Keep Asking Until "exit" (Do-While Loop)
        String userInput;
        do {
            System.out.print("Type something (or 'exit' to stop): ");
            userInput = inputReader.next();
            System.out.println("You said: " + userInput);
        } while (!userInput.equalsIgnoreCase("exit"));

        System.out.println("Alright, thanks for playing!");
        inputReader.close();
    }
}