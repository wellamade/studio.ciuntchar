import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        System.out.println("Write a sentence: ");
        Scanner input = new Scanner(System.in);
        String quoteWords = input.nextLine();

        //String quoteWords = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";



        char[] charactersInString = quoteWords.toLowerCase().toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char letter : charactersInString) {
            if (charCount.containsKey(letter)) {
                charCount.put(letter, charCount.get(letter)+1) ;
            }
            else {
                charCount.put(letter, 1);
            }

        }
            //Map.Entry class helps to identify the key:value pair
            //charCount.entrySet() returns set view of the pair
        for(Map.Entry<Character, Integer> letter : charCount.entrySet()){
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }





    }
}
