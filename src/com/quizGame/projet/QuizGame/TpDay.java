package com.quizGame.projet.QuizGame;

public class TpDay {

	public enum Day{
		
		VENDREDI, SAMEDI, DIMANCHE;
	}
	
	private Day day;
	
	public void setDay(Day day) {
		this.day = day;
	}
	public void getInfo(){
	switch(day)
	{
	  case VENDREDI :
		  System.out.println("jour massalikoul djinane");
		  break;
	  case SAMEDI : 
		  System.out.println("oui serigne Mountakh est � dakar");
		  break;
	  case DIMANCHE :
		  System.out.println("serigne mountakha rentrera � Touba");
	}
	
	}
	public static void main(String[] args) {
		TpDay tp = new TpDay();
	tp.setDay(Day.VENDREDI);
		tp.getInfo();
		tp.setDay(Day.SAMEDI);
		tp.getInfo();
		tp.setDay(Day.DIMANCHE);
		tp.getInfo();
	}

}
