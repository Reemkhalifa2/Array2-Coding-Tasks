public class tenRun {
    public Integer[] tenRun(Integer[]nums){
        Integer a = 0;
        Boolean mod10 = false;
        for(Integer i = 0; i < nums.length; i++) {
            if(nums[i] % 10 == 0) {
                a = nums[i];
                mod10 = true;
            }
            else if(mod10) {
                nums[i] = a;
            }
        }
        return nums;
    }
}
