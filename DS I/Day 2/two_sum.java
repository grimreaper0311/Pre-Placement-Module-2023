class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = nums.length;
        int ar[] = new int[2];
        for(int i = 0; i<a-1; i++){
            for(int j = i+1; j<a; j++){
                if(nums[i]+nums[j] == target){
                    ar[0]=i;
                    ar[1] = j;
                }
            }
        }
        return ar;
    }
}
