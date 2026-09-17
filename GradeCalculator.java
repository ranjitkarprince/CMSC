/*
 * Class              : CMSC203-20798
 * Instructor         : Prof. Ahmed Tarek
 * Description        : This program reads a course grading configuration and student scores from files,
 *                      calculates category averages, overall grade, and writes report to an output file.                       
 * Project            : 1 Grade Calculator 
 * Due                : 09/16/2026
 * Platform/compiler  : Eclipse / Java
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name    : Prince Ranjitkar
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class GradeCalculator {
	
	public static void main(String[] args) throws FileNotFoundException {

		
		// creating scanner for the keyboard input from the user
		
		Scanner keyboard = new Scanner(System.in);
		
		// creating grade configuration file
		
		String courseName = "CMSC203 Computer Science I";
		
		int numberOfCategories = 3;
		
		String category1 = "Projects";
		int weight1 = 40;
		
		String category2 = "Quizzes";
		int weight2 = 30;
		
		String category3 = "Exams";
		int weight3 = 30;
		
		//Read gradeconfig.txt
		File configFile = new File("gradeconfig.txt");
		
		Scanner configInput = new Scanner(configFile);
		
		courseName = configInput.nextLine();

		numberOfCategories = configInput.nextInt();
		
		
	   //Read category 1 
		if (numberOfCategories >= 1) {
		    
		    category1 = configInput.next();
		    weight1 = configInput.nextInt();
		}
		
		if (numberOfCategories >= 2) {
			
			category2 = configInput.next();
			weight2 = configInput.nextInt();
			
		}
		
		if (numberOfCategories >= 3) {
			
			category3 = configInput.next();
			weight3 = configInput.nextInt();
		}
		
		configInput.close();
		     
		//check the weights equal to 100
		
		int totalWeight = weight1 + weight2 + weight3;
		
		if (totalWeight != 100) {
			System.out.println("The Weight do not add up to 100.");
			System.out.println("Using the default configuration. ");
			
			courseName = "CMSC203 Computer Science I";
			
			numberOfCategories = 3;
			
			category1 = "Projects";
			weight1 = 40;
			
			category2 = "Quizzes";
			weight2 = 30;
			
			category3 = "Exams";
			weight3 = 30;
			
		}
		
		//variables for student information 
		
		String firstName;
		String lastName;
		
		double average1 = 0;
		double average2 = 0;
		double average3 = 0;
		
		//Read grades_input.txt
		File gradesFile = new File("grades_input.txt");
		
		Scanner gradesInput = new Scanner(gradesFile);
		
		firstName = gradesInput.next();
		lastName = gradesInput.next();
		
		
		// this will loop through all categories
		for (int categoryNumber = 1;
			 categoryNumber <= numberOfCategories;
			 categoryNumber++) {
			
			String inputCategoryName = gradesInput.next();
			int numberOfScores = gradesInput.nextInt();
			
			//category 1
			if (categoryNumber == 1) {
				
				if (!inputCategoryName.equals(category1)) {
					System.out.println("Category name configuration does not match.");
				}
				
				double total = 0;
				
				// loop through scores
				for(int scoreNumber = 1;
						scoreNumber <= numberOfScores;
						scoreNumber++) {
					
					double score = gradesInput.nextDouble();
					
					total = total + score;
				}
				
				average1 = total / numberOfScores;
			}
		
			 //categories 2
			else if (categoryNumber == 2) {
				
				if (!inputCategoryName.equals(category2)) {
					System.out.println("Category name configuration does not match.");
				}
				
				double total = 0;
				
				// loop through scores
				for(int scoreNumber = 1;
						scoreNumber <= numberOfScores;
						scoreNumber++) {
					
					double score = gradesInput.nextDouble();
					
					total = total + score;
				}
				
				average2 = total / numberOfScores;
			}
			
			 //categories 3
			else if (categoryNumber == 3) {
				
				if (!inputCategoryName.equals(category3)) {
					System.out.println("Category name configuration does not match.");
				}
				
				double total = 0;
				
				// loop through scores
				for(int scoreNumber = 1;
						scoreNumber <= numberOfScores;
						scoreNumber++) {
					
					double score = gradesInput.nextDouble();
					
					total = total + score;
				}
				
				average3 = total / numberOfScores;
			}
		}
		gradesInput.close();
		
		 // Calculate overall average

        double overallAverage = 0;

        if (numberOfCategories >= 1) {

            overallAverage = overallAverage

                    + average1 * weight1 / 100;

        }

        if (numberOfCategories >= 2) {

            overallAverage = overallAverage

                    + average2 * weight2 / 100;

        }

        if (numberOfCategories >= 3) {

            overallAverage = overallAverage

                    + average3 * weight3 / 100;

        }

        // Find base letter grade

        String baseLetterGrade;

        if (overallAverage >= 90) {

            baseLetterGrade = "A";

        } else if (overallAverage >= 80) {

            baseLetterGrade = "B";

        } else if (overallAverage >= 70) {

            baseLetterGrade = "C";

        } else if (overallAverage >= 60) {

            baseLetterGrade = "D";

        } else {

            baseLetterGrade = "F";

        }


        // Ask about plus/minus grading

        String plusMinus;

        do {

            System.out.print("Apply +/- grading? (Y/N): ");

            plusMinus = keyboard.nextLine();

        } while (!plusMinus.equalsIgnoreCase("Y")

                && !plusMinus.equalsIgnoreCase("N"));

        // Final letter grade

        String finalLetterGrade = baseLetterGrade;

        if (plusMinus.equalsIgnoreCase("Y")) {

            if (overallAverage >= 97) {

                finalLetterGrade = "A+";

            } else if (overallAverage >= 93) {

                finalLetterGrade = "A";

            } else if (overallAverage >= 90) {

                finalLetterGrade = "A-";

            } else if (overallAverage >= 87) {

                finalLetterGrade = "B+";

            } else if (overallAverage >= 83) {

                finalLetterGrade = "B";

            } else if (overallAverage >= 80) {

                finalLetterGrade = "B-";

            } else if (overallAverage >= 77) {

                finalLetterGrade = "C+";

            } else if (overallAverage >= 73) {

                finalLetterGrade = "C";

            } else if (overallAverage >= 70) {

                finalLetterGrade = "C-";

            } else if (overallAverage >= 67) {

                finalLetterGrade = "D+";

            } else if (overallAverage >= 63) {

                finalLetterGrade = "D";

            } else if (overallAverage >= 60) {

                finalLetterGrade = "D-";

            } else {

                finalLetterGrade = "F";

            }

        }
     // Display results
        
        System.out.println("=========================================");
        System.out.println("  CMSC203 Project 1 - Grade Calculator");
        System.out.println("=========================================");

        System.out.println();

        System.out.println("Student: " + firstName + " " + lastName);

        System.out.println("Course: " + courseName);

        System.out.println();

        System.out.println("Category Results:");

        if (numberOfCategories >= 1) {
            System.out.println(category1 + " (" + weight1 + "%): average = " + average1);
        }

        if (numberOfCategories >= 2) {
            System.out.println(category2 + " (" + weight2 + "%): average = " + average2);
        }

        if (numberOfCategories >= 3) {
            System.out.println(category3 + " (" + weight3 + "%): average = " + average3);
        }

        System.out.println();

        System.out.println("Overall numeric average: " + overallAverage);

        System.out.println("Base letter grade: " + baseLetterGrade);

        System.out.println("Final letter grade: " + finalLetterGrade);


        // Write results to grades_report.txt

        PrintWriter outputFile = new PrintWriter("grades_report.txt");

        outputFile.println("Student: " + firstName + " " + lastName);

        outputFile.println("Course: " + courseName);

        outputFile.println();

        outputFile.println("Category Results:");

        if (numberOfCategories >= 1) {
            outputFile.println(category1 + " (" + weight1 + "%): average = " + average1);
        }

        if (numberOfCategories >= 2) {
            outputFile.println(category2 + " (" + weight2 + "%): average = " + average2);
        }

        if (numberOfCategories >= 3) {
            outputFile.println(category3 + " (" + weight3 + "%): average = " + average3);
        }

        outputFile.println();

        outputFile.println("Overall numeric average: " + overallAverage);

        outputFile.println("Base letter grade: " + baseLetterGrade);

        outputFile.println("Final letter grade: " + finalLetterGrade);

        outputFile.close();

        System.out.println();

        System.out.println("Summary written to grades_report.txt");

        System.out.println("Program complete. Goodbye!");

        keyboard.close();
		

	}

}

