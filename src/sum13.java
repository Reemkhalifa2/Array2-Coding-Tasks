public class sum13 {
    public Integer sum13(Integer[] nums){
        int sum =0;
        for(int i =0; i<nums.length; i++){
             if (nums[i]==13 ) {
                 i++;
             }else{sum +=nums[i];}
        }
        return sum;
    }
}
