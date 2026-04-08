public class sum67 {
    public static Integer sum67(Integer[] nums){
        Integer sum=0;
        for(Integer i = 0 ; i<nums.length; i++){
            if(nums[i]==6){
                while(nums[i] != 7){ i++;}
            }else{
                sum += nums[i];
            }
        }
        return  sum;
    }
}
