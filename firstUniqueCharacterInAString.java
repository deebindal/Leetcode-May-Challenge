class Solution {
    public int firstUniqChar(String s) {
        int[] arr=new int[26];          //26 sized integer array for a-z characters
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            if(arr[idx]==0){
                arr[idx]=i+1;       //for first time storing index+1 of the character in int array at its place
            }else arr[idx]=-1;      // if character is repeated then storing -1 at its place
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
           if(arr[i]>0){
               min=Math.min(min,arr[i]);   //at the end looping through 26 sized array to find minimum index 
           } 
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min-1;
    }
}