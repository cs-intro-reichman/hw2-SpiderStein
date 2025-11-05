// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String mode = args[1];
		boolean isVerbose = mode.equals("v");
	    
	    for (int seed = 1; seed <= N; seed++) {
	        int node = seed;
	        int steps = 1;

	        if (isVerbose) {
	            System.out.print(seed + " ");
	        }

	        do {
	            if (node % 2 == 0) {
	                node = node / 2;
	            } else {
	                node = (node * 3) + 1;
	            }
	            
	            if (isVerbose) {
	                System.out.print(node + " ");
	            }
	            
	            steps++;
	        } while (node != 1);
	        
	        if (isVerbose) {
	            System.out.println("(" + steps + ")");
	        }
	    }
	    
	    System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
