package com.dest.JAVAPROGRAMS;

import java.util.Random;
import java.util.Scanner;
public class Quiz_Program {
	public static void main(String[] args) {
		// Define quiz questions and answers
		String[][] quizData = {
				{"Which of the following is not java feature","A. Dynamic", "B. Archiecture netural", "C. use of pointers", "D. Object oriented","c"},
				{"__ is used to find and fix bugs in java program","A. JVM", "B. JRE", "C. JDK", "D. JDB","b", "B. JRE"},
				{"What is the retun type of the hashcode() method in the object class","A. object", "B. int", "C. void", "D. long","b"},
				{"Which package contains the Random class","A. java.util package", "B. java.lang package", "C. java.awt package", "D. java.io package","b"},
				{"which of the following for loop declaration is not valid","A. for(int i=99;i>=0;i/9)", "B. for(int i=7;i<77=;i+=7)", "C. for(int i=20;i>=2;--i)", "D. for(int i=2;i<=20;i=i=2*i)","a"},
				{"which method of class.class is used to determine the class represented by the class object in string?","A. getname()", "B. intern()", "C. getclass", "D. tostring()","a"},
				{"in java,jar stands for ___ ","A. java Archieve Runner", "B. java application resource", "C. java application runner", "D. none of above)","d", "D. none of above)"},
				{"What is the default encoding for an OutputStreamWriter","A. UTF-8" ,"B. Default encoding of the host platform" ,"C.UTF-12" ,"D. None of the above","b"},
				{"An interface with no fields or methods is known as a __","A. Runnable Interface" ,"B. Marker Interface" ,"C. Abstract Interface" ,"D. CharSequence Interface","b"},
				{"In which memory a String is stored, when we create a string using new operator","A. Stack" ,"B. String memory" ,"C. Heap memory" ,"D. Random storage space","c"},

		};
		int count=0;
		// Display questions and get user input
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < quizData.length; i++) {
			for (int j=0;j<quizData[i].length-1;j++){
				String option = quizData[i][j];

			}
			System.out.println("Question " + (i + 1) + ": " + quizData[i][0]);
			for (int j=1;j<quizData[i].length-1;j++){
				System.out.println(quizData[i][j]);
			}
			System.out.print("Choose your answer (A, B, C, D) or use a lifeline type audience or 50:50 :");
			String userAnswer = scanner.next();
			if (userAnswer.equalsIgnoreCase("AUDIENCE")) {
				System.out.println(quizData[i][1]+": " + new Random().nextInt(100) + "%");
				System.out.println(quizData[i][2]+": " + new Random().nextInt(100) + "%");
				System.out.println(quizData[i][3]+": " + new Random().nextInt(100) + "%");
				System.out.println(quizData[i][4]+": " + new Random().nextInt(100) + "%");
				System.out.print("Your answer (a/b/c/d): ");
				String option = scanner.next();
				if (option.equalsIgnoreCase(quizData[i][5])) {
					System.out.println("Correct!");
					count=count+1;
				} 
				else {
					System.out.println("Incorrect. The correct answer is: " + quizData[i][5]);
				}

			}
			else if (userAnswer.equalsIgnoreCase("50:50")) {
				System.out.println(quizData[i][5]);
				System.out.println(quizData[i][new Random().nextInt(1,4)]);
				System.out.print("enter the option :");
				String option1 = scanner.next();
				if (option1.equalsIgnoreCase(quizData[i][5])) {
					System.out.println("Correct!");
					count=count+2;
				} 
				else {
					System.out.println("Incorrect. The correct answer is: " + quizData[i][5]);
					System.out.println("Game over");
				}
			}
			   else{
				if (userAnswer.equalsIgnoreCase(quizData[i][5])) {
					System.out.println("Correct!");
					count=count+3;
				} 
				 else {
					System.out.println("Incorrect. The correct answer is: " + quizData[i][5]);
					
				}
			}
		}
		System.out.println("total points ="+count+"/30");
		scanner.close();
	}
}