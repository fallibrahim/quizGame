package com.quizGame.projet.QuizGame;

public class TestQuiz {

	public static void main(String[] args) {
		
	Quiz quiz = new ConsoleQuiz(new CapitalCityQuestionGenerator(2));
	
	quiz.start();
	
    quiz.displayResults();
    
	}

}
