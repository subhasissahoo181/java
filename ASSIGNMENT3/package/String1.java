//Q-1
import java.util.Scanner;
public class String1{
	
    public static void main(String args[]) {
        int index = 0;
        System.out.println("Enter a Sentence: ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
		
		String sentence2 = sentence.toLowerCase();
		

        System.out.println("The given sentence is: " + sentence);

        for(int i =0; i<sentence2.length();i++){
            char letter = sentence2.charAt(i);

            if(letter == 'a' || letter == 'e'|| letter == 'i' ||letter == 'o' ||letter == 'u'){
				
                index++;
            }

        }
        System.out.println("The number of vowels in the given Sentence is : "+ index);
    }

}