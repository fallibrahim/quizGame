package com.quizGame.projet.QuizGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class CapitalCityQuestionGenerator {
	
	private int nbreQuestions; 
	
	public CapitalCityQuestionGenerator(int nbreQuestions){
		
		this.nbreQuestions = nbreQuestions;
	}
	 public int getNbreQ() {
		 
		 return nbreQuestions;
	 }
	  public List<Question> generate()
	  {
		HashMap<String, String> data = getData();
		
		List<String> countries = new ArrayList<>(data.keySet());
		
		Random random = new Random();
		
		  
		  if (nbreQuestions >  data.size())
		  {
			  throw new IllegalArgumentException("On ne peut generer que " +data.size()+ " questions");
		  }
		  
		  List<Question> question = new ArrayList<>();
		
		for(int i = 0; i < nbreQuestions; i++) 
		{
		
			int randomKey = random.nextInt(countries.size());
			
			String country = countries.get(randomKey);
			
			String capitale = data.get(country);
			
			countries.remove(country);
			
			String questionText = String.format("quelle est la capitale de ce pays : %s",country);
			
			question.add( new Question(questionText, capitale) );
			
		}
		
		return question; 
		
	  }
	  
	   private static HashMap<String, String> getData()
	   {
		   HashMap<String, String> data = new HashMap<String, String>();
		   
		   data.put("Senegal","Dakar");
		   
		   data.put("Malie","Bamako");
		   
		   data.put("France","Paris");
		   
		   data.put("Angleterre","Londre");
		   
		   data.put("Italie","Rome");
			
		   data.put("Argentine","Bienos Aires"); 
		   
		   data.put("COte d\'ivoire","Yamoussoukro");
		   
		   data.put("Espagne","Madrid");
		   
		   data.put("Bresil","Brasilia");
		   
		   data.put("maroc", "rabat");
		   
		   return data;
	  }
}
