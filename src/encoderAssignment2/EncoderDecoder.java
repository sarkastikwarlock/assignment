package encoderAssignment2;

import java.util.Scanner;

public class EncoderDecoder {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
	        String continueEncoderDecoder="";

		do{
	        System.out.print( "Press 1 to Encode, 2 to Decode: " );
	        String encodeOrDecode = input.nextLine();
		
	        switch(encodeOrDecode){
	    		case "1":
	    			System.out.print( "Enter text: ");
	    			String text = input.nextLine();
	    
	    			Encoder encodeText = new Encoder(text);
	    			System.out.println(encodeText.encode());
	    			break;
	    		case "2":
	    			System.out.print( "Enter text: ");
	    			text = input.nextLine();
	    			
	    			Decoder decodeText = new Decoder(text);
	    			System.out.println(decodeText.decode());
	    			break;
	    		default:
	    			System.out.println("No such option!");
	    			break;
	        }
	        System.out.println("\nContinue with EncoderDecoder?");
	        System.out.println("(Y to continue, anything else to exit)");
	        continueEncoderDecoder = input.nextLine();
        }while(continueEncoderDecoder.equals("Y")||continueEncoderDecoder.equals("y"));
		System.exit(0);
	}
}
