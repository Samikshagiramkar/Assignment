package MyProject;

    import java.util.HashSet;
	import java.util.Scanner;
	import java.util.Set;

	public class pangramChecker {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine().toLowerCase();

	        boolean isPangram = checkIfPangram(input);

	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }

	    private static boolean checkIfPangram(String input) {
	        
	        String cleanInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
	        Set<Character> alphabetSet = new HashSet<>();

	        for (char c : cleanInput.toCharArray()) {
	            alphabetSet.add(c);
	        }

	        return alphabetSet.size() == 26;
	    }
	}


