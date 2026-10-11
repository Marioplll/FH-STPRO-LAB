import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int score = 0;

        System.out.println("Welcome to the Java Quiz!");
        System.out.println("-------------------------");

        // Question 1
        System.out.println("\nQuestion 1:");
        System.out.println("What is 5 + 3?");
        System.out.println("A) 6");
        System.out.println("B) 8");
        System.out.println("C) 10");

        String answer1 = scanner.nextLine();

        if (answer1.equalsIgnoreCase("B")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is B.");
        }

        // Question 2
        System.out.println("\nQuestion 2:");
        System.out.println("Which language are we using?");
        System.out.println("A) Python");
        System.out.println("B) JavaScript");
        System.out.println("C) Java");

        String answer2 = scanner.nextLine();

        if (answer2.equalsIgnoreCase("C")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is C.");
        }

        // Question 3
        System.out.println("\nQuestion 3:");
        System.out.println("What is 10 * 2?");
        System.out.println("A) 20");
        System.out.println("B) 12");
        System.out.println("C) 30");

        String answer3 = scanner.nextLine();

        if (answer3.equalsIgnoreCase("A")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is A.");
        }

        // Question 4
        System.out.println("\nQuestion 4:");
        System.out.println("Which Java data type stores true or false?");
        System.out.println("A) int");
        System.out.println("B) boolean");
        System.out.println("C) String");

        String answer4 = scanner.nextLine().trim();

        // Accept A, B, or C, regardless of capitalization.
        if (answer4.equalsIgnoreCase("B")) {
            System.out.println("Correct!");
            score++;
        } else if (answer4.equalsIgnoreCase("A") || answer4.equalsIgnoreCase("C")) {
            System.out.println("Wrong! The correct answer is B.");
        } else {
            System.out.println("Invalid answer. Please enter A, B, or C. No point awarded.");
        }

        // Final result
        System.out.println("\nQuiz completed!");
        System.out.println("Your score: " + score + " out of 4");

        scanner.close();
    }
}
