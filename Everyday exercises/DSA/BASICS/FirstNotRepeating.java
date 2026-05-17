/**
 * Find first character that appears only once
 *
 * Input: "leetcode"
 * Output: 'l'
 *
 * Input: "loveleetcode"
 * Output: 'v'
 *
 * YOUR TASK:
 * 1. Count frequency of each character using HashMap
 * 2. Loop through string again
 * 3. Return first character with frequency == 1
 * 4. If none found, return '_'
 *
 * TIME LIMIT: 40 minutes
 */

import java.util.HashMap;

/**
 * Find first character that appears only once
 *
 * Input: "leetcode"
 * Output: 'l'
 *
 * Input: "loveleetcode"
 * Output: 'v'
 *
 * YOUR TASK:
 * 1. Count frequency of each character using HashMap
 * 2. Loop through string again
 * 3. Return first character with frequency == 1
 * 4. If none found, return '_'
 *
 * TIME LIMIT: 40 minutes
 * */
public class FirstNotRepeating {
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(str+" : "+firstNotRepeatingCharacter(str));
        System.out.println("aaa : "+firstNotRepeatingCharacter("aaa"));
        System.out.println("loveleetcode : "+firstNotRepeatingCharacter("loveleetcode"));
    }
    public static char firstNotRepeatingCharacter(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        // key - character , value - frequency

        // counting frequency
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        // traversing though Sting while checking if found character is in map or not
        // if yes then check it's frequency ,
        // simple logic which ever first character appears , check it frequency , if it's one we got it ours
        for(char c : s.toCharArray()){
            if(map.get(c) == 1){
                return c;
            }
        }
        return '_';
    }
}