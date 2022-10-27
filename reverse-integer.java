class Solution {
    public int reverse(int x) {
        int abso_x=Math.abs(x);
        long pre=0;
        while(abso_x>0){
            pre=10*pre+abso_x%10;
              abso_x=abso_x/10;
        }
        
        if(x<0){
            pre=(-1)*pre;
        }
        if (pre>Integer.MAX_VALUE || pre<Integer.MIN_VALUE){
            return 0;
        }
        return (int) pre;
        
      
        
    }
}