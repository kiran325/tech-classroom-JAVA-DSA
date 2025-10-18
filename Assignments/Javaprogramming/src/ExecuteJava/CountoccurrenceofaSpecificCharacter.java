package ExecuteJava;

public class CountoccurrenceofaSpecificCharacter {

	public static void main(String[] args) {
		// Count Occurrence of a Specific Character
		
		String str = "occurrence";
        char target = 'c';
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        
        System.out.println("Character '" + target + "' occurs " + count + " times.");

	}

}
