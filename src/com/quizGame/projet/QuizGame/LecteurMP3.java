package com.quizGame.projet.QuizGame;

import javax.swing.JOptionPane;

public class LecteurMP3 {
	
	public enum Volume
	{
		LOW(10), MEDIUM(50), HIGH(100);
		
		private int value;
		
		Volume(int value){
			
			this.value = value;
		}
		
		public String toString() {
			
			return String.valueOf(value);
		}
		
		public static void alert() {
			 JOptionPane.showMessageDialog(null,"attention à vos oreilles !");
		}
	}

	private Volume volume;
	
	public void setVolume(Volume volume) {
		
		if(volume == Volume.HIGH)
			Volume.alert();
		
		this.volume = volume;
	}
	
	public Volume getVolume() {
		
		return volume;
	}
	public static void main(String[] args) {
		
//       LecteurMP3 l = new LecteurMP3();
//       
//       l.setVolume(Volume.LOW);
//       
//       JOptionPane.showMessageDialog(null, l.getVolume());
//       
//       l.setVolume(Volume.MEDIUM);
//       
//       JOptionPane.showMessageDialog(null, l.getVolume());
//       
//       l.setVolume(Volume.HIGH);
//       
//       JOptionPane.showMessageDialog(null, l.getVolume());
		
//		for (Volume volume : Volume.values()) {
//			
//			 JOptionPane.showMessageDialog(null,volume);
//		}
		LecteurMP3 l = new LecteurMP3();
		l.setVolume(Volume.HIGH);
	}

}
