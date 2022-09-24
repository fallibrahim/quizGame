package com.quizGame.projet.QuizGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Procedural {

	public static void main(String[] args) {
		
	   final int NUMBER_OF_QUESTIONS = 5;
	   
	   int score = 0, index;
	   String pays, capitale, userAnswer;
	   
	   char replayAnswer;
	   
	   ArrayList<Integer> indexAlreadyTakens = new  ArrayList<Integer>();
	   
	   String[][] data = getData();
	   
	   Scanner clavier = new Scanner(System.in);
	   
	   do {
		   indexAlreadyTakens.clear();
		   
		   for(int i = 0; i < NUMBER_OF_QUESTIONS; i++)
		   {
			   do {
				   Random random = new Random();
				   
				   index = random.nextInt(data.length);
				   
			   }while(indexAlreadyTakens.contains(index));
			   
			   indexAlreadyTakens.add(index);
			   
			   pays = data[index][0];
			   
			   capitale = data[index][1];
			   
			   System.out.printf("quelle est la capitale de ce pays : %s?\n",pays);
			   
			   userAnswer = clavier.nextLine();
			   
			   if(capitale.equalsIgnoreCase(userAnswer))
			   {
				   System.out.println("Bonne réponse!");
				   
				   score++;
			   }
			   else
			   {
				   System.out.printf("Mauvaise réponse. Il va falloir répondre %s\n",capitale);
			   }
		   }
		 
		   System.out.printf("c\'est terminé <<Score finale %d/%d>>\n\n",score,NUMBER_OF_QUESTIONS);
	  
	       do {
	    	   System.out.println("Voulez-vous rejouer?(O/N)");
	    	   
	    	   replayAnswer = clavier.nextLine().toLowerCase().charAt(0);
	    	   
	       }while(replayAnswer != 'o' && replayAnswer != 'n');
		   
	   }while(replayAnswer == 'o');
	   
       System.out.println("\nBye Bye!");
       
       System.out.println("Appuyer sur la touche Entree pour quitter!");
       
       clavier.nextLine();
       
       clavier.close();
	}
	  static String[][] getData(){
		  
		  String[][] data = { {"Senegal","Dakar"}, {"Malie","Bamako"},
				  
			{"France","Paris"}, {"Angleterre","Londre"}, {"Italie","Rome"} };
			
			return data;
	  }
}
