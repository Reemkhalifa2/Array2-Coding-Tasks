public class isEverywhere {
    public static Boolean isEverywhere(Integer[] nums, Integer n){
        if(nums.length<=1){
            return true;
        }
        for(Integer i =0; i<nums.length-1; i++){
            if(nums[i] != n && nums[i+1] != n) {
                return false;
            }
        }
        return true;
    }
}
