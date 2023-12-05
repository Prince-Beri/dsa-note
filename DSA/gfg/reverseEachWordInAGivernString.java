import java.util.*;
public class reverseEachWordInAGivernString {
    public static String reverseWords(String S){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char ch: S.toCharArray()){
            stack.push(ch);
            if(ch == '.'){
                while(!stack.isEmpty()){
                    result.append(stack.pop());
                }
            }
        }
        // i.ekil.siht.margorp.yrev.hcum
        // .i.ekil.siht.margorp.yrev
        return result.toString();
    }

    private static String reverse(String str){
        // get the length of given string str.
        int n = str.length();
        // converting str into characters array word so,  i can swap the character of str easily.
        char[] word = str.toCharArray();
        // travers the word array to swap the characters.
        for(int i = 0; i < n / 2; i++){
            char temp = word[i];
            word[i] = word[n - i - 1];
            word[n - i - 1] = temp;
        }
        // convert the words array to string.
        StringBuilder sb = new StringBuilder();
        for(char ch : word){
            sb.append(ch);
        }
        // return the reverse string.
        return sb.toString();
    }

    public static void main(String[] args){
        String S = "i.like.this.program.very.much";
        System.out.println(reverseWords(S));
    }
}