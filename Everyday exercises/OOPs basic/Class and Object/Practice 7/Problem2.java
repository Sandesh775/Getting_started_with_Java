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
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence : ");
        String analyzer = sc.nextLine();
        String clean = analyzer.trim();
        String[] words = clean.split(" ");
        boolean isRepeated = false;
        int count = 0;
        for( int i = 0; i<words.length; i++){
            count = 0;
            for( int j = i+1; j< words.length; j++){
                if(words[i].length()==words[i].length()){
                    for()
                }
            }
        }
    }
}
