//missing number
lass Solution {
    public int missingNumber(int[] nums) {
        int total=0,sum=0;
        for(int i=1;i<=nums.length;i++)
            total+=i;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        return total-sum;
    }
}
