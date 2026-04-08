public class zeroMax {
    public Integer[] zeroMax(Integer[] nums) {
        for(Integer i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                Integer max = 0;
                for(Integer j = i + 1; j < nums.length; j++) {
                    if(nums[j] % 2 != 0) {
                        if(nums[j] > max) {
                            max = nums[j];
                        }
                    }
                }
                nums[i] = max;
            }
        }

        return nums;
    }
}
