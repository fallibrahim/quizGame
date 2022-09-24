package com.quizGame.projet.QuizGame;


abstract public class Quiz {
	
  private CapitalCityQuestionGenerator generator;
  
  private int score;
  
  private long timeElapsed;
  
  private boolean done = false;
  
  public Quiz(CapitalCityQuestionGenerator generator) {
	   
	  this.generator =  generator;
  }
  
  public abstract void displayMessage(String message);
	 
  public abstract String retrieveAnswer(String prompt);
	 

  //Scanner clavier = new Scanner(System.in);
  
  //private final static int NUMBER_OF_QUESTIONS = 55;
  
  public void start()
  {
	  try 
	  {
          long startTime = System.currentTimeMillis();
          
			for(Question question : generator.generate())
			{
				String responseUtilisateur = retrieveAnswer(question.getText());
							    
			    if (responseUtilisateur.equalsIgnoreCase(question.getResponse())) 
			    {
			    	score++;
			    	
			    	displayMessage("Bonne réponse!");
			    }
			    else
			    {
			    	displayMessage("réponse incorrect");
			    	
			    	displayMessage(String.format("la bonne réponse etait : %s\n",question.getResponse()));
			    }
			} 
			       done = true;
	           long endTime = System.currentTimeMillis();
	  
	               timeElapsed = endTime - startTime;
	  
	  }catch(IllegalArgumentException e) {
		  done = false;
		  System.out.println(e.getMessage());
	  }
  }
  
  private int getTimeElapseInSeconds(long timeInMilliseconds) {
	
	return (int) (timeInMilliseconds / 1000);
}

public void displayResults()
  {
	if(done)
	{
		displayMessage(String.format("Votre score finale <<%d/%d>>\n",score,  generator.getNbreQ()));
		displayMessage(String.format("Il vous a fallu environ %d seconds pour répondre aux %d questions",
				getTimeElapseInSeconds(timeElapsed), generator.getNbreQ()));
	}

  }
  

}

