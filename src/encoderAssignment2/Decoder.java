package encoderAssignment2;

import java.util.ArrayList;

public class Decoder {
	private String stringToDecode;
	
	public Decoder(String stringToDecode){
		this.stringToDecode = stringToDecode;
	}
	
	public String decode(){
		AssignValue av = new AssignValue();
		ArrayList<String> characterList = av.assignValue();
		String answer="";
		int offsetValue=0;
		int retrieveValue=0; //index value of the character
		
		stringToDecode = stringToDecode.toUpperCase();
		Character offsetCharacter = stringToDecode.charAt(0);
		
		if(characterList.contains(Character.toString(stringToDecode.charAt(0)))){
			//decode
			offsetValue = characterList.indexOf(Character.toString(stringToDecode.charAt(0)));
			for(int i =1; i<stringToDecode.length(); i++){
				if(characterList.contains(Character.toString(stringToDecode.charAt(i)))){
					retrieveValue = characterList.indexOf(Character.toString(stringToDecode.charAt(i)));
					if((retrieveValue+offsetValue)> characterList.size()-1){
						answer+=characterList.get(characterList.size()-2-(Math.abs(offsetValue-retrieveValue)));
					}else{
						answer+=characterList.get(retrieveValue+offsetValue);
					}
				}else{
					answer+=stringToDecode.charAt(i);
				}
			}
		}else{
			return "No such offset!";
		}
		return answer;
	}
}
