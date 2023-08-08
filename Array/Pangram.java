import java.util.Arrays;

//Check if the Sentence Is Pangram
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
public class Pangram {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("qklccnqeicrabxpggieplwjhakurwwhxbugbryvhazoofifidzvxczmpdjfcyiuhqyedxhzexvpitxknjogpetvgxeqrjuuxzzfblhmhbgibocbhtcbgyxzchlawvnhczlecsrioapggorouzcputqsxhvoxbqxxydiumxwg"));
    }
    public static boolean checkIfPangram(String sentence) {
//        int[] arr = new int[26];
        // Method 1
//        for(int i=0;i<sentence.length();i++){
//            arr[sentence.charAt(i)-'a']++;
//        }
//        for(int i:arr){
//            if(i==0){
//                return false;
//            }
//        }

//        Method 2
        int count = 0;
        for(char el = 'a';el<='z';el++){
            if(sentence.contains(Character.toString(el))){
                count++;
            }
        }
        if(count<26){
            return false;
        }
        return true;
    }
}
