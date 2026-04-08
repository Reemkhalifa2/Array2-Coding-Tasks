public class shiftLeft {
    public static Integer[] shiftLeft(Integer[] nums){
        Integer n = nums[0];
        for(Integer i =0; i< nums.length-1;i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=n;
        return nums;
    }
}
