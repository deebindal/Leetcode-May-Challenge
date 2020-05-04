class Solution {
    public int numJewelsInStones(String J, String S) {
        int[] arr=new int[26];                 // 26 sized integer array to keep record of characters present in jewels string.
        for(int i=0;i<J.length();i++){
            char ch=J.charAt(i);
            int idx=ch<='Z'?ch-'A':ch-'a';
            if(arr[idx]==0){
                if(ch<='Z') arr[idx]=1;        //mark 1 for characters A-Z
                else arr[idx]=2;               //mark 2 for characters a-z
            }else arr[idx]=3;                  //mark 3 for both small and capital characters 
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
