/*
* Problem 2: Word Frequency Analyzer (Strings + Tools + Thinking)
Input: "java is great java is fun"

Output:
Word Frequencies:
java - 2
is - 2
great - 1
fun - 1

Most frequent word: java (or is)
Rules:
•	✅ USE split()
•	✅ USE HashMap or manual tracking (your choice)
•	Focus on clean logic
*/
import java.util.*;
public class Word_Frequency_Analyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence : ");
        String text = sc.nextLine().toLowerCase().trim();

        String[] words = text.split(" ");

        String[] unique = new String[words.length];

        int[] count = new int[words.length];
        int uniquesize = 0;

        boolean isFound = false;
        for( int i = 0; i< words.length; i++){
            isFound = false;
            for(int j = 0; j< uniquesize; j++){
                if(words[i].equals(unique[j])){
                    count[j] = count[j]+1;
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                unique[uniquesize] = words[i];
                count[uniquesize] = 1;
                uniquesize++;
            }
        }
        int max = 0;
        for(int i = 0; i< count.length; i++){
            if(count[i]>count[max]){
                max = i;
            }
        }
        System.out.println("Most frequent word in string is : "+unique[max]);// prints java because 2 is not greater than 2 so doesn't update in max ?
        // Let's print if are there max more than one in string
        System.out.println(" ");
        System.out.println("Words with max frequencies are : ");
        for(int i = 0; i<uniquesize; i++){
            if(count[i]==count[max]){
                System.out.println(unique[i]);
            }
        }
        // here let's print each unique words with corresponding counts
        System.out.println(" ");
        System.out.println("Word Frequencies:");
        for(int i =0 ; i< uniquesize; i++){
            System.out.println("Word : "+unique[i]+" - "+count[i]);
        }
    }
}