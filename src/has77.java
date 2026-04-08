public class has77 {
    public static Boolean has77(Integer[] nums){
        for(Integer i =0; i<nums.length-2;i++){
            if((nums[i]==7&&nums[i+1]==7 || i + 2 < nums.length &&nums[i]==7 && nums[i+2]==7)){
                return true;
            }

        }
        return false;
    }
}
