class Solution {
    public int[] getConcatenation(int[] nums) {  // main logic = dynammic array 
        int[] ans = new int[2*nums.length];      //new array len = 2 * existing array
        int len = nums.length;
        for(int i = 0;i<len;i++){
            ans[i] = nums[i];
            ans[i+len] = nums[i];  //________ important line
        }
        return ans;
        
    }
}