package com.quizGame.projet.QuizGame;

import javax.swing.JOptionPane;

public class GUIQuiz extends Quiz{

	

	public GUIQuiz(CapitalCityQuestionGenerator generator) {
		
		super(generator);
	
	}

	@Override
	public void displayMessage(String message) {
		
		JOptionPane.showMessageDialog(null, message);
	}

	@Override
	public String retrieveAnswer(String prompt) {
	
		return JOptionPane.showInputDialog(prompt);
	}

}
