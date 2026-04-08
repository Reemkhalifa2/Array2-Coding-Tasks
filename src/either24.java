public class either24 {
    public Boolean either24(Integer [] nums){
        Boolean has22 = false;
        Boolean has44 = false;
        for(Integer i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 2 && nums[i+1] == 2) {
                has22 = true;
            }
            if(nums[i] == 4 && nums[i+1] == 4) {
                has44 = true;
            }
        }
        return has22 ^ has44;
    }
}
