class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> a = new Stack<>();
        Stack<Character> b = new Stack<>();
        for(int i = 0; i<s.length();i++){
            if (s.charAt(i)!='#') a.push(s.charAt(i));
            else {
                if(!a.isEmpty()) a.pop();
            }
        }
        for(int i = 0; i<t.length();i++){
            if (t.charAt(i)!='#') b.push(t.charAt(i));
            else {
                if(!b.isEmpty()) b.pop();
            }
        }
        return a.equals(b);
    }
}