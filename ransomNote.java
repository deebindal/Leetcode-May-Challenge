class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr=new int[26];
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            int idx=ch-'a';
            arr[idx]++;
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            int idx=ch-'a';
            if(arr[idx]==0) return false;
            arr[idx]--;
        }
        return true;
    }
}