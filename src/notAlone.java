public class notAlone {
    public static Integer[] notAlone(Integer []nums, Integer n){
        for(Integer i=1; i< nums.length-2;i++){
            if(nums[i]==n){
                if( nums[i - 1] > nums[i +1] ){
                    nums[i]= nums[i - 1];
                }else{
                    nums[i] =  nums[i + 1];
                }
            }
        }
        return nums;
    }
}
