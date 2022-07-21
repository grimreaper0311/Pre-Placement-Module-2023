class Solution {
    public int reverse(int x) {
        int num=x;
        int rev=0;
        int rem;
        long sum=0;
        int count =0;
     if(x<0){
         num= -num;
         count++;
     }
        while(num!=0){
            rem= num%10;
            sum = sum*10+rem;
            num= num/10;
        }
        if(count==1)
        {
            sum= -sum;
        }
        
        
        
        double val=Math.pow(2,31);
        double val1=-val-1;
        
        
        if(sum>val1&&sum<val)
            return (int)sum;
        else
            return 0;
        
    }
}
