public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "today is wednesday!";

	        if (isPangram(input)) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }

	    public static boolean isPangram(String input) {
	        input = input.toLowerCase();
	        return input.matches(".*[a-z]{26}.*");
		

	}

}