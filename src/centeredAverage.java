public class centeredAverage {
    public static Integer centeredAverage(Integer[] nums){
        Integer min = nums[0];
        Integer max = nums[nums.length-1];
        Integer sum =0;
        for(Integer i = 0; i< nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
            sum +=nums[i];
        }
        return (sum-min-max)/ (nums.length-2);

    }
}
