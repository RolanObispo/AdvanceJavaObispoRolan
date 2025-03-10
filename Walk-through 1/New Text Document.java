import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JavaExample {

    public static void main(String[] args) {
        String name = "Ronald";  
        System.out.println("Hello, " + name + "! Welcome to Java.");
        
        double length = 5.0;  
        double width = 3.0;   
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);
        
        LocalDate currentDate = LocalDate.now();
        System.out.println("Today's Date: " + currentDate);
        
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + userName + "! You are " + age + " years old.");

        scanner.close();
    }
}