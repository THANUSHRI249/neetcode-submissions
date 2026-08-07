class Solution {
    public boolean isAnagram(String s, String t) {
        String s1;
        String t1;
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        s1 = new String(char1);
        t1 = new String(char2);
        if(s1.equals(t1)){
            return true;
        }else{
            return false;
        }


    }
}
