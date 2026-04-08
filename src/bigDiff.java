public class bigDiff {
    public static Integer bigDiff(Integer [] nums){
        Integer max = nums[0];
        Integer min = nums[0];
        for (Integer i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return max - min;
    }
}
