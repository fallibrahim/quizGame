package com.quizGame.projet.QuizGame;

import java.util.Scanner;

public class ConsoleQuiz extends Quiz{
	
 public ConsoleQuiz(CapitalCityQuestionGenerator generator) {
	 
		super(generator);
		
	}

Scanner clavier = new Scanner(System.in);
 
	

	@Override
	public void displayMessage(String message) {

		System.out.println(message);
	}

	@Override
	public String retrieveAnswer(String prompt) {
	
		displayMessage(prompt);
		
		return clavier.nextLine();
	}
 
}
