package encoderAssignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Encoder {
	private String stringToEncode;
	
	public Encoder(String stringToEncode){
		this.stringToEncode = stringToEncode;
	}
	
	public String encode(){
		
		AssignValue av = new AssignValue();
		ArrayList<String> characterList = av.assignValue();
		String answer="";
		int offsetValue=0;
		int retrieveValue=0; //index value of the character
		
		Scanner input = new Scanner(System.in);
		System.out.print( "Select offset: " );
        String offsetCharacter = input.nextLine().toUpperCase();
		
		stringToEncode = stringToEncode.toUpperCase();
		
		/*
		 * 	Using the index to retrieve the value to encode
		 *  index-offsetValue if the retrieved index to encode
		 * 
		 *  if the retrieved index-offsetValue is less than 0
		 *  get the value for at the other end of the index a.k.a loops the get method
		 *  making it seems like the array is a circular array
		 *  the formula for the get is characterList.size()-absolute value of retrieve index - offset
		 *  Eg. the characterList a.k.a dictionary is only up to index 43, if offsetValue >= 5, program will
		 *      break returning index that is not within range of 0~43.ie, with string 'E' and offset 'F' which equals 5,
		 *      with the formula it should return 44-|5-4| = 43. So the formula would help retrieve the proper encode text
		 *      which is '/'
		 * 
		 * */
		
		if(characterList.contains(offsetCharacter)){ 
			offsetValue=characterList.indexOf(offsetCharacter); 
			for(int i =0; i<stringToEncode.length();i++){
				if(characterList.contains(Character.toString(stringToEncode.charAt(i)))){
					retrieveValue=characterList.indexOf(Character.toString(stringToEncode.charAt(i)));
					if((retrieveValue-offsetValue)<0){
						answer+=characterList.get(characterList.size()-(Math.abs(offsetValue-retrieveValue)));
					}else{
						answer+=characterList.get(retrieveValue-offsetValue); 
					}
				}else{
					answer+=stringToEncode.charAt(i);
				}
			}
		}else{
			return "No such offset!";
		}
		
		return offsetCharacter+answer;
	}
}
