package encoderAssignment2;

import java.util.ArrayList;

public class AssignValue {
	public ArrayList<String> assignValue(){
		/*
		 * Assigning value to each character using ascii
		 * 
		 * */
		ArrayList<String> characterList = new ArrayList<String>();
		//Assigning A to Z
		for(int i =0; i<=25;i++){
			characterList.add(Character.toString((char)(65+i)));
		}
		//Assigning numbers
		for(int i=0;i<=9;i++){
			characterList.add(Character.toString((char)(48+i)));
		}
		//Assigning symbols
		for(int i=0;i<=7;i++){
			characterList.add(Character.toString((char)(40+i)));
		}
		return characterList;
	}
}
