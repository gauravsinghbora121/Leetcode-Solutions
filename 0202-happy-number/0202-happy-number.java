
class Solution {
    int sqofdigit(int n){
    int sum=0;
    while(n>0){
        int digit=n%10;
        sum=sum+(digit*digit);
        n=n/10;

    }
    return sum;
}

    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1){
            slow=sqofdigit(slow);
            fast=sqofdigit(sqofdigit(fast));
            if(fast==1){
                return true;
            }
            if(fast==slow){
                return false;
            }

        
    }
    return true;
}
}