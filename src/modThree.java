public class modThree {
    public static Boolean modThree(Integer[]nums){
        for(Integer i =0 ; i<nums.length-2; i++){
            if(nums[i] % 2 ==0 &&nums[i+1] % 2 ==0 &&nums[i+2] % 2 ==0 ){
                return true;
            }
            if(nums[i] % 2 !=0 &&nums[i+1] % 2 !=0 &&nums[i+2] % 2 !=0 ){
                return true;
            }
        }
        return false;
    }
}
