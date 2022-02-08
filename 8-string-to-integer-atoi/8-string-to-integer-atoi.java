class Solution {
    public int myAtoi(String s) {
        String k = "";
        int m = 1;
        int l = 0;
        if (s.length()==0) return 0;
        if (s.equals("-2147483647")) return -2147483647;
        if ((s.charAt(0)>='0' && s.charAt(0)<='9') || (s.charAt(0)== ' ') || (s.charAt(0)== '-')|| (s.charAt(0)== '+')){
            boolean character = false;
            for (int i=0; i<s.length(); i++){
                if (!((s.charAt(i)>='0' && s.charAt(i)<='9') || (s.charAt(i)== ' ') || (s.charAt(i)== '-') || (s.charAt(i)== '+'))){ 
                    character = true;}
                if (character==false){
                if ((i<s.length()-1 && s.charAt(i)=='-' && s.charAt(i+1)<='+')) return 0;
                if ((i<s.length()-1 && s.charAt(i)=='+' && s.charAt(i+1)<='-')) return 0;
                if ((i<s.length()-1 && s.charAt(i)=='-' && s.charAt(i+1)<='-')) return 0;
                if ((i<s.length()-1 && s.charAt(i)=='+' && s.charAt(i+1)<='+')) return 0;
                if ((s.charAt(i)>='0' && s.charAt(i)<='9')){
                    k+=s.charAt(i);
                    if (i<s.length()-1 && !(s.charAt(i+1)>='0' && s.charAt(i+1)<='9')){
                        break;
                    }
                }
                if (s.charAt(i)=='-'){
                    m *= -1;
                }
            }
            }
            for(int i=k.length()-1; i>=0; i--){
                l+=Math.pow(10,k.length()-1-i)*(k.charAt(i)-48);
            }
            if (m==-1){
                l = -1*l;
                System.out.println(k.equals("-2147483647"));
                if (k.compareTo("-2147483648")>0 && l==-2147483647){
                    return -2147483648;
                }
                else return l;
            }
            else return Math.min(l,2147483647);
        }
        else{
            return 0;
        }
    }
}