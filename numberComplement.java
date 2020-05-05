class Solution {
    public int findComplement(int num) {
        int count=-1;
        int ans=0;
        while(num>0){
            count++;
            if((num&1)==0){
                int answer=1<<count;
                ans|=answer;
            }
            num>>=1;
        }
        return ans;
    }
}