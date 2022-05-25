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
        String k = "";
        String l = "";
        while(!a.isEmpty()){ 
            k += a.peek();
            a.pop();
        }
        while(!b.isEmpty()){
            l += b.peek();
            b.pop();
        }
        if(k.equals(l)) return true;
        return false;
    }
}