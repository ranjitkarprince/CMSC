/**
 Class: CMSC203 CRN 20798
 Program: Lab1 - Driver and Data Element
 Instructor: Ahmed Tarek
 Summary of Description: The program uses a Movie class to store and manage movie information, 
 including the movie title, rating, and number of tickets sold. The MovieDriver class allows
 the user to enter movie information, creates a Movie object, and displays the information using
 the toString() method. 
 The program also uses a loop to allow the user to enter information for multiple movies
 Due Date: 10/07/2026
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Student Name: Prince Ranjitkar 
 */





import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String answer;

        do {
            // Create a new Movie object
            Movie movie = new Movie();

            // Ask for the movie title
            System.out.print("Enter the movie title: ");
            String title = keyboard.nextLine();
            movie.setTitle(title);

            // Ask for the movie rating
            System.out.print("Enter the movie rating: ");
            String rating = keyboard.nextLine();
            movie.setRating(rating);

            // Ask for the number of tickets sold
            System.out.print("Enter the number of tickets sold: ");
            int soldTickets = Integer.parseInt(keyboard.nextLine());
            movie.setSoldTickets(soldTickets);

            // Display the movie information
            System.out.println(movie.toString());

            // Ask if the user wants to enter another movie
            System.out.print("Do you want to enter another movie? (yes/no): ");
            answer = keyboard.nextLine();

        } while (answer.equalsIgnoreCase("yes"));

        System.out.println("Program ended.");

        keyboard.close();
    }
}