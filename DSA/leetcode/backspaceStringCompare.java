import java.util.Stack;

public class backspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == '#'){
                if(!s1.isEmpty()){
                    s1.pop();
                    continue;
                }
            }
            s1.push(ch);
        }
        for(char ch: t.toCharArray()){
            if(ch == '#'){
                if(!s2.isEmpty()){
                    s2.pop();
                    continue;
                }
            }
            s2.push(ch);
        }
        String str1 = "", str2 = "";
        while(!s1.isEmpty()){
            str1 += s1.pop();
        }
        while(!s2.isEmpty()){
            str2 += s2.pop();
        }
        return str1.equals(str2);
    }
}
