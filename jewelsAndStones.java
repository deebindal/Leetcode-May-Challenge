class Solution {
    public int numJewelsInStones(String J, String S) {
        int[] arr=new int[26];
        for(int i=0;i<J.length();i++){
            char ch=J.charAt(i);
            int idx=ch<='Z'?ch-'A':ch-'a';
            if(arr[idx]==0){
                if(ch<='Z') arr[idx]=1;
                else arr[idx]=2;
            }else arr[idx]=3;
        }
        int jewels=0;
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
          int idx=ch<='Z'?ch-'A':ch-'a';
            if(arr[idx]!=0){
                if(arr[idx]==3) jewels++;
                else{
                    if(ch<='Z'  && arr[idx]==1 ) jewels++;
                    if(ch>='a' && arr[idx]==2) jewels++;
                    }
            }     
        }
        return jewels;
    }
}
