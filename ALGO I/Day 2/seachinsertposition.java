class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        int a=0;
        while(l<=h){
            int mid = (l+h)/2;
            if(target == nums[mid]){
                a = mid;
                return mid;
            }
            else if(target<nums[mid]){
                a = mid;
                h = mid-1;
        }
            else{
                a = mid;
                l = mid+1;
            }
        }
        if(target<=nums[a])
            return a;
        else
            return a+1;
    }
}
