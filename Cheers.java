//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String text = args[0].toUpperCase();
	    int numRepeats = Integer.parseInt(args[1]);
	    
	    String anLetters = "AEFHILMNORSX";
	    
	    for (int i = 0; i < text.length(); i++) {
	        char currentChar = text.charAt(i);
	        
	        if (anLetters.indexOf(currentChar) != -1) {
	            System.out.println("Give me an " + currentChar + ": " + currentChar + "!");
	        } else {
	            System.out.println("Give me a  " + currentChar + ": " + currentChar + "!");
	        }
	    }
	    
	    System.out.println("What does that spell?");
	    
	    for (int i = 0; i < numRepeats; i++) {
	        System.out.println(text + "!!!");
	    }
        }
}
