public class tripleUp {
    public static Boolean tripleUp(Integer[] nums){
        for(Integer i =0; i<nums.length-2;i++){
            if(i + 2 < nums.length &&nums[i]==nums[i+1]-1&&nums[i+1]==nums[i+2]-1){
                return true;
            }

        }
        return false;

    }
}
